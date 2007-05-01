/*
 * Copyright 2007 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 *
 * @created Apr 30, 2007 
 * @author wseyler
 */


package org.pentaho.pms.ui.tree;

import java.util.List;

import org.pentaho.pms.jface.tree.ITreeNode;
import org.pentaho.pms.schema.PhysicalColumn;

/**
 * @author wseyler
 *
 */
public class PhysicalColumnTreeNode extends ConceptTreeNode {
  PhysicalColumn physicalColumn;
  String locale;
  /**
   * @param parent
   */
  public PhysicalColumnTreeNode(ITreeNode parent) {
    super(parent);
  }

  /**
   * @param node
   * @param physicalColumn
   * @param locale
   */
  public PhysicalColumnTreeNode(ITreeNode parent, PhysicalColumn physicalColumn, String locale) {
    this(parent);
    this.physicalColumn = physicalColumn;
    this.locale = locale;
  }

  /* (non-Javadoc)
   * @see org.pentaho.pms.ui.tree.ConceptTreeNode#createChildren(java.util.List)
   */
  protected void createChildren(List children) {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see org.pentaho.pms.jface.tree.ITreeNode#getName()
   */
  public String getName() {
    // TODO Auto-generated method stub
    return physicalColumn.getName(locale);
  }

}
