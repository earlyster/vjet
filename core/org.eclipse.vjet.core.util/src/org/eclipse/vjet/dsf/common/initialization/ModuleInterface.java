package org.eclipse.vjet.dsf.common.initialization;

public interface ModuleInterface {

	/** This returns the initialization manager for the module.  Multiple
	 * calls should return the same instance.
	 * 
	 * @return InitializationManagerInterface
	 */
	InitializationManagerInterface getInitializationManager();
}
