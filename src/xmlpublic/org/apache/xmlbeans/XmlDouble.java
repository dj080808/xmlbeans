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

/**
 * Corresponds to the XML Schema
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#double">xs:double</a> type.
 * <p>
 * Naturally, convertible to a Java double.
 */ 
public interface XmlDouble extends XmlAnySimpleType
{
    /** The constant {@link SchemaType} object representing this schema type. */
    public static final SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_double");
    
    /** Returns this value as a double */
    double getDoubleValue();
    /** Sets this value as a double */
    void setDoubleValue(double v);

    /**
     * Returns this value as a double
     * @deprecated replaced with {@link #getDoubleValue}
     **/
    double doubleValue();
    /**
     * Sets this value as a double
     * @deprecated replaced with {@link #setDoubleValue}
     **/
    void set(double v);

    /**
     * A class with methods for creating instances
     * of {@link XmlDouble}.
     */
    public static final class Factory
    {
        /** Creates an empty instance of {@link XmlDouble} */
        public static XmlDouble newInstance() {
          return (XmlDouble) XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** Creates an empty instance of {@link XmlDouble} */
        public static XmlDouble newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (XmlDouble) XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** Creates an immutable {@link XmlDouble} value */
        public static XmlDouble newValue(Object obj) {
          return (XmlDouble) type.newValue( obj ); }
        
        /** Parses a {@link XmlDouble} fragment from a String. For example: "<code>&lt;xml-fragment&gt;123.34e+57&lt;/xml-fragment&gt;</code>". */
        public static XmlDouble parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        /** Parses a {@link XmlDouble} fragment from a String. For example: "<code>&lt;xml-fragment&gt;123.34e+57&lt;/xml-fragment&gt;</code>". */
        public static XmlDouble parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        /** Parses a {@link XmlDouble} fragment from a File. */
        public static XmlDouble parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        /** Parses a {@link XmlDouble} fragment from a File. */
        public static XmlDouble parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        /** Parses a {@link XmlDouble} fragment from a URL. */
        public static XmlDouble parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( u, type, null ); }

        /** Parses a {@link XmlDouble} fragment from a URL. */
        public static XmlDouble parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( u, type, options ); }

        /** Parses a {@link XmlDouble} fragment from an InputStream. */
        public static XmlDouble parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        /** Parses a {@link XmlDouble} fragment from an InputStream. */
        public static XmlDouble parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        /** Parses a {@link XmlDouble} fragment from a Reader. */
        public static XmlDouble parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        /** Parses a {@link XmlDouble} fragment from a Reader. */
        public static XmlDouble parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        /** Parses a {@link XmlDouble} fragment from a DOM Node. */
        public static XmlDouble parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        /** Parses a {@link XmlDouble} fragment from a DOM Node. */
        public static XmlDouble parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** Parses a {@link XmlDouble} fragment from an XMLInputStream.
         * @deprecated Superceded by JSR 173 */
        public static XmlDouble parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** Parses a {@link XmlDouble} fragment from an XMLInputStream.
         * @deprecated Superceded by JSR 173 */
        public static XmlDouble parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (XmlDouble) XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** Returns a validating XMLInputStream.
         * @deprecated Superceded by JSR 173 */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** Returns a validating XMLInputStream.
         * @deprecated Superceded by JSR 173 */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

