/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.common.state;

import org.eclipse.vjet.dsf.common.context.Direction;
import org.eclipse.vjet.dsf.common.exceptions.DsfExceptionHelper;
import org.eclipse.vjet.kernel.stage.BaseStage;

public abstract class BaseState extends BaseStage<StateId> 
	implements IState {
	
	private Direction m_direction = Direction.UNDEFINED;
	
	//
	// Constructor
	//
	protected BaseState(final StateId id){
		super(id);
	}
	
	//
	// API
	//
	public Direction getDirection(){
		return m_direction;
	}
	
	//
	// Protected
	// 
	protected void setDirection(final Direction direction){
		if (direction == null){
			DsfExceptionHelper.chuck("direction cannot be null");
		}
		m_direction = direction;
	}
}
