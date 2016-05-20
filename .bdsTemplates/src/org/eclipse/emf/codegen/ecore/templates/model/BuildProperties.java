package org.eclipse.emf.codegen.ecore.templates.model;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import java.util.*;

public class BuildProperties
{
  protected static String nl;
  public static synchronized BuildProperties create(String lineSeparator)
  {
    nl = lineSeparator;
    BuildProperties result = new BuildProperties();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "bin.includes = ";
  protected final String TEXT_2 = ",\\" + NL + "               model/,\\";
  protected final String TEXT_3 = NL + "               icons/,\\";
  protected final String TEXT_4 = NL + "               META-INF/,\\";
  protected final String TEXT_5 = NL + "               tibco_plugin.xml,\\";
  protected final String TEXT_6 = NL + "               plugin.properties" + NL + "jars.compile.order = ";
  protected final String TEXT_7 = NL + "source.";
  protected final String TEXT_8 = " = ";
  protected final String TEXT_9 = NL + "output.";
  protected final String TEXT_10 = " = bin/";
  protected final String TEXT_11 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenModel genModel = (GenModel)argument;
    String pluginClassesLocation = genModel.isRuntimeJar() ? genModel.getModelPluginID()+".jar" : ".";
    List<String> sourceFolders = genModel.getModelSourceFolders();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(pluginClassesLocation);
    stringBuffer.append(TEXT_2);
    if (genModel.sameModelEditProject() || genModel.sameModelEditorProject()) {
    stringBuffer.append(TEXT_3);
    }
    if (genModel.isBundleManifest()) {
    stringBuffer.append(TEXT_4);
    }
    if (genModel.getRuntimePlatform() != GenRuntimePlatform.GWT) {
    stringBuffer.append(TEXT_5);
    }
    stringBuffer.append(TEXT_6);
    stringBuffer.append(pluginClassesLocation);
     boolean first=true; for (Iterator<String> i = sourceFolders.iterator(); i.hasNext();) { String sourceFolder = i.next(); if (i.hasNext()){sourceFolder +=",\\";} if (first) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(pluginClassesLocation);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(sourceFolder);
    first=false;} else {
    stringBuffer.append(sourceFolder);
    }}
    stringBuffer.append(TEXT_9);
    stringBuffer.append(pluginClassesLocation);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
