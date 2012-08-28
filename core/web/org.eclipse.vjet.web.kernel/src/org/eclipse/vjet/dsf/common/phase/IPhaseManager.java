/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.common.phase;

import org.eclipse.vjet.kernel.stage.IStageManager;

public interface IPhaseManager extends IStageManager<PhaseId>{
	IPhase start();
	IPhase next(final IPhase currentStage);
	
	IPhaseManager add(PhaseId phaseId);
	IPhaseManager add(final IPhase phase);
}
