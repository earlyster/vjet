/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.manifest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.declaration.JstObjectLiteralType;
import org.eclipse.vjet.dsf.jst.declaration.JstType;
import org.eclipse.vjet.dsf.jst.ts.JstTypeSpaceMgr;
import org.eclipse.vjet.dsf.jstojava.controller.JstParseController;
import org.eclipse.vjet.dsf.jstojava.loader.DefaultJstTypeLoader;
import org.eclipse.vjet.dsf.jstojava.parser.VjoParser;
import org.eclipse.vjet.dsf.ts.group.IGroup;
import org.eclipse.vjet.vjo.lib.TsLibLoader;

/**
 * This file will create types.txt
 * 
 * 
 */
public class CreateTypesList {

	private static String createManifest(Collection<IJstType> types) {

		StringBuilder sb = new StringBuilder();
		// TODO sort this
		for (IJstType type : types) {

			String fullName = type.getName();
			if (type instanceof JstObjectLiteralType) {
				System.out.println(type);
				fullName = type.getPackage().getName();
			}
			sb.append(fullName + "\n");

		}
		return sb.toString();

	}

	public static void main(String[] args) {
		// load in group

		JstParseController controller = new JstParseController(new VjoParser());
		JstTypeSpaceMgr ts = new JstTypeSpaceMgr(controller,
				new DefaultJstTypeLoader());
		ts.initialize();
		TsLibLoader.loadDefaultLibs(ts);

		IGroup<IJstType> group = ts.getTypeSpace().getGroup(
				TsLibLoader.getBrowserGroups()[0]);

		String manifest = CreateTypesList.createManifest(group.getEntities()
				.values());

		System.out.println(manifest);

	}

	public static void createManifest(File typestxt, Collection<IJstType> values) {
		// TODO Auto-generated method stub
		String manifestTxt = createManifest(values);
		FileWriter fos = null;
		try {
			fos = new FileWriter(typestxt);
			fos.append(manifestTxt);
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
