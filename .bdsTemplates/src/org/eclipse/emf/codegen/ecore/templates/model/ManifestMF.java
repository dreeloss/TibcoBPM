package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.common.util.*;

public class ManifestMF
{
  protected static String nl;
  public static synchronized ManifestMF create(String lineSeparator)
  {
    nl = lineSeparator;
    ManifestMF result = new ManifestMF();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "Manifest-Version: 1.0" + NL + "Bundle-ManifestVersion: 2" + NL + "Bundle-Name: %pluginName" + NL + "Bundle-SymbolicName: ";
  protected final String TEXT_2 = ";singleton:=false" + NL + "Bundle-Version: ";
  protected final String TEXT_3 = NL + "Bundle-ClassPath: ";
  protected final String TEXT_4 = ".jar";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ", ";
  protected final String TEXT_7 = NL + "Bundle-Activator: ";
  protected final String TEXT_8 = "$Implementation";
  protected final String TEXT_9 = NL + "Bundle-Vendor: %providerName" + NL + "Bundle-Localization: plugin" + NL + "Bundle-Activator: ";
  protected final String TEXT_10 = NL + "Bundle-ActivationPolicy: lazy";
  protected final String TEXT_11 = NL + "Globaldata: ";
  protected final String TEXT_12 = NL + "Bundle-RequiredExecutionEnvironment: J2SE-1.5";
  protected final String TEXT_13 = NL + "Bundle-RequiredExecutionEnvironment: JavaSE-1.6";
  protected final String TEXT_14 = NL + "Export-Package: ";
  protected final String TEXT_15 = ";version=\"";
  protected final String TEXT_16 = "\",";
  protected final String TEXT_17 = ";version=\"";
  protected final String TEXT_18 = "\"";
  protected final String TEXT_19 = NL + "Require-Bundle: ";
  protected final String TEXT_20 = NL + "Import-Package: javax.xml.datatype;version=\"[1.3.0,2.0.0)\"," + NL + " javax.xml.parsers;version=\"[1.3.0,2.0.0)\"," + NL + " javax.xml.transform;version=\"[1.3.0,2.0.0)\"," + NL + " javax.xml.transform.sax;version=\"[1.3.0,2.0.0)\"," + NL + " javax.xml.transform.stream;version=\"[1.3.0,2.0.0)\"," + NL + " javax.xml.transform.dom;version=\"[1.3.0,2.0.0)\"," + NL + " javax.xml.validation;version=\"[1.3.0,2.0.0)\"," + NL + " org.osgi.framework;version=\"[1.4.0,2.0.0)\"," + NL + " org.eclipse.emf.common;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.common.notify;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.common.notify.impl;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.common.util;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.impl;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.plugin;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.resource;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.resource.impl;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.util;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.xmi;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.xmi.impl;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.xmi.util;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.xml.type;version=\"[0.0.0,3.0.0)\"," + NL + " org.eclipse.emf.ecore.xml.type.util;version=\"[0.0.0,3.0.0)\"," + NL + " org.xml.sax;version=\"[2.0.2,3.0.0)\"";
  protected final String TEXT_21 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2005-2007 IBM Corporation and others.
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
    // Get all the BDS custom annotations for the Manifest generation 
    EMap<String, String> bdsManifestDetails = genModel.getGenAnnotation("BDS-Manifest").getDetails();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genModel.getModelPluginID());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(bdsManifestDetails.get("version"));
    stringBuffer.append(TEXT_3);
    if (genModel.isRuntimeJar()) {
    stringBuffer.append(genModel.getModelPluginID());
    stringBuffer.append(TEXT_4);
    }else{
    stringBuffer.append(TEXT_5);
    }
    stringBuffer.append(TEXT_6);
    stringBuffer.append(bdsManifestDetails.get("binFolder"));
    if (genModel.hasModelPluginClass()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genModel.getQualifiedModelPluginClassName());
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genModel.getFeatureMapWrapperInterface().replaceFirst("BDSFeatureMap$","BDSActivator"));
    stringBuffer.append(TEXT_10);
    if (bdsManifestDetails.containsKey("Globaldata")) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(bdsManifestDetails.get("Globaldata"));
    }
    if (genModel.getComplianceLevel() == GenJDKLevel.JDK50_LITERAL) {
    stringBuffer.append(TEXT_12);
    } else if (genModel.getComplianceLevel() == GenJDKLevel.JDK60_LITERAL) {
    stringBuffer.append(TEXT_13);
    }
    Iterator<String> packagesIterator = genModel.getModelQualifiedPackageNames().iterator();
    stringBuffer.append(TEXT_14);
    while(packagesIterator.hasNext()) {
    stringBuffer.append(packagesIterator.next());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(bdsManifestDetails.get("version"));
    stringBuffer.append(TEXT_16);
    stringBuffer.append("\n ");
    }
    stringBuffer.append(bdsManifestDetails.get("bdsutilPackage"));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(bdsManifestDetails.get("version"));
    stringBuffer.append(TEXT_18);
    // Find all the references to foreign packages 
    String requireBundle = "";
    Iterator<GenPackage> requiredPluginIterator = genModel.getUsedGenPackages().iterator();
    ArrayList<String> processed = new ArrayList<String>();
    while(requiredPluginIterator.hasNext()) {
    GenModel usedGenModel = (GenModel)(requiredPluginIterator.next().eContainer());
    String pluginID = usedGenModel.getModelName();
    String usedVersion = usedGenModel.getGenAnnotation("BDS-Manifest").getDetails().get("version");
    if (!pluginID.startsWith("org.eclipse.") && genModel.getModelRequiredPlugins().contains(pluginID) && !processed.contains(pluginID)){
    if(!requireBundle.isEmpty()) { requireBundle += ",\n "; }
    requireBundle += pluginID + ";bundle-version=\"[" + usedVersion + "," + usedVersion + "]\"";
    processed.add(pluginID);
    }
    }
    if( !requireBundle.isEmpty() ) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(requireBundle);
    }
    stringBuffer.append(TEXT_20);
    stringBuffer.append(TEXT_21);
    return stringBuffer.toString();
  }
}
