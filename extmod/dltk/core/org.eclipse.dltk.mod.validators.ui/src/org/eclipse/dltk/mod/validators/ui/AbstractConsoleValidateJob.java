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
package org.eclipse.dltk.mod.validators.ui;

import java.text.DateFormat;
import java.util.Date;

import org.eclipse.dltk.mod.validators.core.AbstractValidateJob;
import org.eclipse.dltk.mod.validators.core.IValidatorOutput;
import org.eclipse.osgi.util.NLS;

public abstract class AbstractConsoleValidateJob extends AbstractValidateJob {

	public AbstractConsoleValidateJob(String jobName) {
		super(jobName);
	}

	protected IValidatorOutput createOutput() {
		if (isConsoleRequired()) {
			return new ConsoleValidatorOutput(getConsoleName());
		}
		return super.createOutput();
	}

	protected String getConsoleName() {
		final String timestamp = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM).format(
				new Date(System.currentTimeMillis()));
		final String message = Messages.AbstractValidateSelectionWithConsole_dltkValidatorOutput;
		return NLS.bind(message, getName(), timestamp);
	}

	protected boolean isConsoleRequired() {
		return true;
	}
}
