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

package org.apache.xmlbeans.impl.marshal;

import org.apache.xmlbeans.GDateSpecification;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.impl.common.InvalidLexicalValueException;
import org.apache.xmlbeans.impl.util.XsTypeConverter;

import java.util.Date;


/**
 * convert between schema date/time types and java.util.Date
 */
final class JavaDateTypeConverter
    extends BaseSimpleTypeConverter
{
    private final int schemaType;

    /**
     *
     * @param schemaType  use codes from SchemaType
     */
    JavaDateTypeConverter(int schemaType)
    {
        this.schemaType = schemaType;
    }

    protected Object getObject(UnmarshalResult context) throws XmlException
    {
        return context.getDateValue();
    }

    public Object unmarshalAttribute(UnmarshalResult context) throws XmlException
    {
        return context.getAttributeDateValue();
    }

    public Object unmarshalAttribute(CharSequence lexical_value,
                                     UnmarshalResult result)
        throws XmlException
    {
        try {
            GDateSpecification gd =
                XsTypeConverter.getGDateValue(lexical_value, schemaType);
            return gd.getDate();
        }
        catch (IllegalArgumentException e) {
            throw new InvalidLexicalValueException(e, result.getLocation());
        }

    }

    public CharSequence print(Object value, MarshalResult result)
    {
        Date d = (Date)value;
        GDateSpecification gd = XsTypeConverter.getGDateValue(d, schemaType);
        return gd.toString();
    }
}
