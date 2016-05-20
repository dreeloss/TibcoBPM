package com.example.expensebom02.bdsutil;

import java.util.Dictionary;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;


/**
 * Activator class, instantiated by OSGi framework. Keeps a note
 * of the containing bundle version.
 * 
 * Generated code in the EPackage(s) for this bundle will contain
 * a method that obtains and exposes the version number.
 */
public class BDSActivator implements BundleActivator {

    private static BundleContext context;

    private static String bundleVersion;

    static BundleContext getContext() {
        return context;
    }

    public void start(BundleContext bundleContext) throws Exception {
        context = bundleContext;
    }

    public void stop(BundleContext bundleContext) throws Exception {
        context = null;
    }

    public static String getBundleVersion() {
        if (getContext() != null) {
            if (bundleVersion == null) {
                Bundle bundle = getContext().getBundle();
                Dictionary<?, ?> headers = bundle.getHeaders();
                Object bvValue = headers.get(Constants.BUNDLE_VERSION);
                if (bvValue != null) {
                    bundleVersion = (String) bvValue;
                }
            }
        } else {
            bundleVersion = null;
        }
        return bundleVersion;
    }
}
