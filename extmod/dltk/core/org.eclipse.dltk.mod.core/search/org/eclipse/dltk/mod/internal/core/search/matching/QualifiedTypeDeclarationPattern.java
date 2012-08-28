/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.mod.internal.core.search.matching;

import org.eclipse.dltk.mod.compiler.CharOperation;
import org.eclipse.dltk.mod.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.mod.core.search.SearchPattern;
import org.eclipse.dltk.mod.core.search.indexing.IIndexConstants;

public class QualifiedTypeDeclarationPattern extends TypeDeclarationPattern
		implements IIndexConstants {
	public char[] qualification;
	// PackageDeclarationPattern packagePattern;
	// public int packageIndex = -1;

	public QualifiedTypeDeclarationPattern(char[] qualification,
			char[] simpleName, char typeSuffix, int matchRule,
			IDLTKLanguageToolkit toolkit) {
		this(matchRule, toolkit);
		this.qualification = isCaseSensitive() ? qualification : CharOperation
				.toLowerCase(qualification);
		this.simpleName = (isCaseSensitive() || isCamelCase()) ? simpleName
				: CharOperation.toLowerCase(simpleName);
		this.typeSuffix = typeSuffix;
	}

	public QualifiedTypeDeclarationPattern(char[] qualification,
			int qualificationMatchRule, char[] simpleName, char typeSuffix,
			int matchRule, IDLTKLanguageToolkit toolkit) {
		this(qualification, simpleName, typeSuffix, matchRule, toolkit);
	}

	QualifiedTypeDeclarationPattern(int matchRule, IDLTKLanguageToolkit toolkit) {
		super(matchRule, toolkit);
	}

	public void decodeIndexKey(char[] key) {
		int slash = CharOperation.indexOf(SEPARATOR, key, 0);
		this.simpleName = CharOperation.subarray(key, 0, slash);
		int start = ++slash;
		if (key[start] == SEPARATOR) {
			this.pkg = CharOperation.NO_CHAR;
		} else {
			slash = CharOperation.indexOf(SEPARATOR, key, start);
			this.pkg = internedPackageNames.add(CharOperation.subarray(key,
					start, slash));
		}
		this.qualification = CharOperation.NO_CHAR;
		// Continue key read by the end to decode modifiers
		int last = key.length - 1;
		this.secondary = key[last] == 'S';
		if (this.secondary) {
			last -= 2;
		}
		this.modifiers = key[last - 1] + (key[last] << 16);
		decodeModifiers();
		// Retrieve enclosing type names
		start = slash + 1;
		last -= 2; // position of ending slash
		if (start == last) {
			this.enclosingTypeNames = CharOperation.NO_CHAR_CHAR;
		} else {
			int length = 0;
			int size = last - start;
			System.arraycopy(this.qualification, 0,
					this.qualification = new char[length + size], 0, length);
			// this.qualification[length] = '$';
			if (last == (start + 1) && key[start] == ZERO_CHAR) {
				this.enclosingTypeNames = ONE_ZERO_CHAR;
				this.qualification[length] = ZERO_CHAR;
			} else {
				this.enclosingTypeNames = CharOperation.splitOn('$', key,
						start, last);
				System.arraycopy(key, start, this.qualification, 0, size);
			}
		}
	}

	public SearchPattern getBlankPattern() {
		return new QualifiedTypeDeclarationPattern(R_EXACT_MATCH
				| R_CASE_SENSITIVE, getToolkit());
	}

	public boolean matchesDecodedKey(SearchPattern decodedPattern) {
		QualifiedTypeDeclarationPattern pattern = (QualifiedTypeDeclarationPattern) decodedPattern;
		switch (this.typeSuffix) {
		case TYPE_SUFFIX:
			switch (pattern.typeSuffix) {
			case TYPE_SUFFIX:
				break;
			default:
				return false;
			}
			break;
		case ANNOTATION_TYPE_SUFFIX:
			if (this.typeSuffix != pattern.typeSuffix)
				return false;
			break;
		}
		return matchesName(this.simpleName, pattern.simpleName)
				&& (this.qualification == null || pattern.matchesName(
						this.qualification, pattern.qualification));
	}

	protected StringBuffer print(StringBuffer output) {
		switch (this.typeSuffix) {
		case TYPE_SUFFIX:
			output.append("ClassDeclarationPattern: qualification<"); //$NON-NLS-1$
			break;
		case ANNOTATION_TYPE_SUFFIX:
			output.append("AnnotationTypeDeclarationPattern: qualification<"); //$NON-NLS-1$
			break;
		default:
			output.append("TypeDeclarationPattern: qualification<"); //$NON-NLS-1$
			break;
		}
		if (this.qualification != null)
			output.append(this.qualification);
		else
			output.append("*"); //$NON-NLS-1$
		output.append(">, type<"); //$NON-NLS-1$
		if (simpleName != null)
			output.append(simpleName);
		else
			output.append("*"); //$NON-NLS-1$
		output.append("> "); //$NON-NLS-1$
		return super.print(output);
	}
}
