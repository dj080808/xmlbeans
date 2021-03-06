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
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#Name">xs:Name</a> type.
 * One of the derived types based on <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#string">xs:string</a>.
 * <p>
 * This kind of string is the same as the non-colonized strings that are used
 * for XML localnames and prefixes, "my-href.2".  It is just a physical
 * string, however, and it should NOT be confused with {@link XmlQName},
 * which is a logical combination of localname and namespace URI.
 * <p>
 * Convertible to {@link String}.
 */ 
public interface XmlNCName extends XmlName
{
    /** The constant {@link SchemaType} object representing this schema type. */
    public static final SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_NCName");
    
    /**
     * A class with methods for creating instances
     * of {@link XmlNCName}.
     */
    public static final class Factory
    {
        /** Creates an empty instance of {@link XmlNCName} */
        public static XmlNCName newInstance() {
          return (XmlNCName) XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** Creates an empty instance of {@link XmlNCName} */
        public static XmlNCName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (XmlNCName) XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** Creates an immutable {@link XmlNCName} value */
        public static XmlNCName newValue(Object obj) {
          return (XmlNCName) type.newValue( obj ); }
        
        /** Parses a {@link XmlNCName} fragment from a String. For example: "<code>&lt;xml-fragment&gt;My-Name&lt;/xml-fragment&gt;</code>". */
        public static XmlNCName parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        /** Parses a {@link XmlNCName} fragment from a String. For example: "<code>&lt;xml-fragment&gt;My-Name&lt;/xml-fragment&gt;</code>". */
        public static XmlNCName parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        /** Parses a {@link XmlNCName} fragment from a File. */
        public static XmlNCName parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        /** Parses a {@link XmlNCName} fragment from a File. */
        public static XmlNCName parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        /** Parses a {@link XmlNCName} fragment from a URL. */
        public static XmlNCName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( u, type, null ); }

        /** Parses a {@link XmlNCName} fragment from a URL. */
        public static XmlNCName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( u, type, options ); }

        /** Parses a {@link XmlNCName} fragment from an InputStream. */
        public static XmlNCName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        /** Parses a {@link XmlNCName} fragment from an InputStream. */
        public static XmlNCName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        /** Parses a {@link XmlNCName} fragment from a Reader. */
        public static XmlNCName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        /** Parses a {@link XmlNCName} fragment from a Reader. */
        public static XmlNCName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        /** Parses a {@link XmlNCName} fragment from a DOM Node. */
        public static XmlNCName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        /** Parses a {@link XmlNCName} fragment from a DOM Node. */
        public static XmlNCName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** Parses a {@link XmlNCName} fragment from an XMLInputStream.
         * @deprecated Superceded by JSR 173 */
        public static XmlNCName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** Parses a {@link XmlNCName} fragment from an XMLInputStream.
         * @deprecated Superceded by JSR 173 */
        public static XmlNCName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (XmlNCName) XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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

