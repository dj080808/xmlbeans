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
package org.apache.xmlbeans.impl.jam.editable.impl.ref;

import org.apache.xmlbeans.impl.jam.JClass;

/**
 *
 * @author Patrick Calahan <pcal@bea.com>
 */
public class UnqualifiedJClassRef implements JClassRef {

    // ========================================================================
  // Variables

  private String mUnqualifiedClassname;
  private String mQualifiedClassname = null;
  private JClassRefContext mContext;

  // ========================================================================
  // Factory

  /**
   * Creates a new JClassRef for a qualified class or type name.
   */
  public static JClassRef create(String qualifiedClassname,
                                 JClassRefContext ctx) {
    return new UnqualifiedJClassRef(qualifiedClassname,ctx);
  }

  // ========================================================================
  // Constructors

  private UnqualifiedJClassRef(String qualifiedClassname,
                               JClassRefContext ctx)
  {
    mContext = ctx;
    mUnqualifiedClassname = qualifiedClassname;
  }

  // ========================================================================
  // JClassRef implementation

  public JClass getRefClass() {
    //FIXME this needs optimization, keep it simple and lazy for now
    return mContext.getClassLoader().loadClass(getQualifiedName());
  }

  public String getQualifiedName() {
    if (mQualifiedClassname != null) return mQualifiedClassname;
    mQualifiedClassname = getAlreadyQualified();
    if (mQualifiedClassname != null) return mQualifiedClassname;
    mQualifiedClassname = getExplicitImport();
    if (mQualifiedClassname != null) return mQualifiedClassname;
    //FIXME '*' imports!
    return "void";  //FIXME uh oh
  }

  // ========================================================================
  // Private methods

  /**
   * Check to see if the unqualified name actually is already qualified.
   */
  private String getAlreadyQualified() {
    JClass clazz =
            mContext.getClassLoader().loadClass(mUnqualifiedClassname);
    if (clazz != null) return clazz.getQualifiedName();
    return null;
  }


  /**
   * Run through the list of import specs and see if the class was explicitly
   * (i.e. without '*') imported.
   */
  private String getExplicitImport() {
    String[] imports = mContext.getImportSpecs();
    for(int i=0; i<imports.length; i++) {
      //FIXME this does not cover inner classes
      String impo = lastSegment(imports[i]);
      if (imports[i].equals(mUnqualifiedClassname)) {
        return imports[i];
      }
    }
    return null;
  }

  private static String lastSegment(String s) {
    int lastDot = s.lastIndexOf(".");
    if (lastDot == -1) return s;
    return s.substring(lastDot+1);
  }

  private static String firstSegment(String s) {
    int lastDot = s.indexOf(".");
    if (lastDot == -1) return s;
    return s.substring(0,lastDot);
  }

}
