/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.ebayopensource.vjet.eclipse.vjetv;

/* 
 * $Id: VJETVRunner.java, Feb 24, 2010, 7:05:38 PM, liama. Exp$
 *
 * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
 * This software program and documentation are copyrighted by Ebay 
 * Technologies.
 */

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * Class/Interface description
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class VJETVRunner implements IApplication {

    private final static String SEPERATOR = File.separator;

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
     */
    @Override
    public Object start(IApplicationContext context) throws Exception {

        ClassLoader orginalLoader = Thread.currentThread()
                .getContextClassLoader();

        // Step1. Prepare runtime class path, involving DSFPrebuild and so on.
        URL url = this.getClass().getProtectionDomain().getCodeSource()
                .getLocation();
        File coreJarFile = new File(url.getFile());
        String installFolderPath = coreJarFile.getAbsolutePath();
        installFolderPath = installFolderPath.substring(0, installFolderPath
                .lastIndexOf(File.separator));
        File installFolder = new File(installFolderPath);
        File[] files = installFolder.listFiles();
        ArrayList<URL> fileURL = new ArrayList<URL>();
        for (int i = 0; i < files.length; i++) {
            fileURL.add(files[i].toURL());
        }

        
        //Step3 run VJETV
        try {
            URLClassLoader classLoader = new URLClassLoader(fileURL
                    .toArray(new URL[] {}));
            Thread.currentThread().setContextClassLoader(classLoader);
            Class entry = classLoader
                    .loadClass("org.ebayopensource.dsf.jstojava.cml.vjetv.core.HeadLessValidationEntry");
            Object vjetvEntry = entry.newInstance();
            Method runVjetvMethod = entry.getMethod("runVjetv", String[].class);
            runVjetvMethod.setAccessible(true);
            Map contextArguments = context.getArguments();
            Object o = contextArguments
                    .get(IApplicationContext.APPLICATION_ARGS);
            String[] args = (String[]) o;
            if (args[0].equalsIgnoreCase("-showlocation")) {
                String[] actualArgs = new String[args.length - 1];
                System.arraycopy(args, 1, actualArgs, 0, actualArgs.length);
                runVjetvMethod.invoke(vjetvEntry, new Object[] { actualArgs });
            } else {
                runVjetvMethod.invoke(vjetvEntry, new Object[] { args });
            }
        } catch (Exception e) {
        } finally {
            Thread.currentThread().setContextClassLoader(orginalLoader);
        }
        return null;
    }

    /**
     * Get VjoJavaLib.jar and VjoJavaLibResource.jar
     * 
     * @param fileName
     *            {@link String}
     * @param folder
     *            {@link File}
     * @return {@link File}
     */
    private static File getFileFromFolder(String fileName, File folder) {
        File[] folders = folder.listFiles();
        for (int i = 0; i < folders.length; i++) {
            File versionFolder = folders[i];
            if (versionFolder.isDirectory()) {
                File[] files = versionFolder.listFiles();
                for (int j = 0; j < files.length; j++) {
                    File javaFolder = files[j];
                    if (javaFolder.isDirectory()) {
                        File[] desFiles = javaFolder.listFiles();
                        for (int w = 0; w < desFiles.length; w++) {
                            if (desFiles[w].getName()
                                    .equalsIgnoreCase(fileName)) {
                                return desFiles[w];
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        File s = new File("C:/Eric/views/View_RA/v3jars/v4/VjoJavaLib");
        File v = getFileFromFolder("VjoJavaLib.jar", s);
        System.out.println(v.getAbsolutePath());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.equinox.app.IApplication#stop()
     */
    @Override
    public void stop() {
    }
}
