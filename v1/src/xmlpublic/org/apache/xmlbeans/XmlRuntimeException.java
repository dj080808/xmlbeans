/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xmlbeans;

import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.PrintStream;

/**
 * An unchecked XML exception.
 * May contain any number of {@link XmlError} objects.
 * 
 * @see XmlError
 * @see XmlException
 */ 
public class XmlRuntimeException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    private Throwable _cause = null;
    private String _detailMessage = null;

    public XmlRuntimeException()
    {
        super();
    }

    /**
     * Constructs an XmlRuntimeException from a message.
     */ 
    public XmlRuntimeException ( String m              ) { super( m );    }
    
    /**
     * Constructs an XmlRuntimeException from a message and a cause.
     */ 
    public XmlRuntimeException ( String m, Throwable t ) { super( m ); _cause = t; }

    /**
     * Constructs an XmlRuntimeException from a cause.
     */ 
    public XmlRuntimeException ( Throwable t           ) { super( ); _cause = t;   }

    /**
     * Constructs an XmlRuntimeException from a message, a cause, and a collection of XmlErrors.
     */ 
    public XmlRuntimeException ( String m, Throwable t, Collection errors )
    {
        this( m, t );

        if (errors != null)
            _errors = Collections.unmodifiableList( new ArrayList(errors) );
    }

    /**
     * Constructs an XmlRuntimeException from an XmlError.
     */ 
    public XmlRuntimeException ( XmlError error )
    {
        this( error.toString(), null, error );
    }

    /**
     * Constructs an XmlRuntimeException from a message, a cause, and an XmlError.
     */ 
    public XmlRuntimeException ( String m, Throwable t, XmlError error )
    {
        this( m, t, Collections.singletonList( error ) );
    }
    
    /**
     * Constructs an XmlRuntimeException from an {@link XmlException}.
     */ 
    public XmlRuntimeException ( XmlException xmlException )
    {
        this( xmlException.getMessage(), xmlException.getCause() );

        Collection errors = xmlException.getErrors();

        if (errors != null)
            _errors = Collections.unmodifiableList( new ArrayList( errors ) );
    }
    
    /**
     * Returns the first {@link XmlError} that caused this exception, if any.
     */ 
    public XmlError getError ( )
    {
        if (_errors == null || _errors.size() == 0)
            return null;

        return (XmlError) _errors.get( 0 );
    }
    
    /**
     * Returns the collection of {@link XmlError XmlErrors} that caused this exception, if any.
     */ 
    public Collection getErrors ( )
    {
        return _errors;
    }

        public Throwable getCause()
    {
        return _cause;
    }

    public Throwable initCause(Throwable t)
    {
        if (_cause != this)
            throw new IllegalStateException("Can't overwrite cause");
        if (_cause == this)
            throw new IllegalArgumentException("Self-causation not permitted");
        _cause = t;

        return this;
    }


    public String toString()
    {
        return getClass().getName() + ": " + getMessage();
    }


    public String getMessage()
    {
        if (_detailMessage == null)
            _detailMessage = _cause != null ? _cause.toString() : super.getMessage();

        return _detailMessage;
    }


    public String getLocalizedMessage()
    {
        return getMessage();
    }


    public void printStackTrace()
    {
        printStackTrace(System.err);
    }


    public void printStackTrace(PrintStream s)
    {
        synchronized (s)
        {
            super.printStackTrace(s);

            Throwable ourCause = getCause();
            if (ourCause != null)
            {
                s.println("Caused by: ");
                ourCause.printStackTrace(s);
            }
        }
    }


    public void printStackTrace(PrintWriter p)
    {
        synchronized (p)
        {
            super.printStackTrace(p);

            Throwable ourCause = getCause();
            if (ourCause != null)
            {
                p.println("Caused by: ");
                ourCause.printStackTrace(p);
            }
        }
    }

    private List _errors;
}