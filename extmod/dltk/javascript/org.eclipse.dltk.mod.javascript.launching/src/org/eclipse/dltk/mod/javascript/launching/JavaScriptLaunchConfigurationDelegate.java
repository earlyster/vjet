package org.eclipse.dltk.mod.javascript.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.dltk.mod.javascript.core.JavaScriptNature;
import org.eclipse.dltk.mod.launching.AbstractScriptLaunchConfigurationDelegate;
import org.eclipse.dltk.mod.launching.IInterpreterRunner;
import org.eclipse.dltk.mod.launching.InterpreterConfig;

public class JavaScriptLaunchConfigurationDelegate extends
		AbstractScriptLaunchConfigurationDelegate {

	protected void runRunner(ILaunchConfiguration configuration,
			IInterpreterRunner runner, InterpreterConfig config,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		if (runner instanceof IConfigurableRunner){
			IJavaScriptInterpreterRunnerConfig runnerConfig = getConfig();
			if (runnerConfig!=null){
				IConfigurableRunner rc=(IConfigurableRunner) runner;
				rc.setRunnerConfig(runnerConfig);
			}
		}
		runner.run(config, launch, monitor);
	}
	
	public IJavaScriptInterpreterRunnerConfig getConfig(){
		return null;
	}

	

	public String getLanguageId() {
		return JavaScriptNature.NATURE_ID;
	}
}
