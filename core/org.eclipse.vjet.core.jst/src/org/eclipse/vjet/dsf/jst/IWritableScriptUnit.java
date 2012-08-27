package org.eclipse.vjet.dsf.jst;

import java.util.List;

import org.eclipse.vjet.dsf.jst.declaration.JstBlock;

public interface IWritableScriptUnit extends IScriptUnit {

	void setType(IJstType type);
	void setSyntaxRoot(JstBlock block);
	void setJstBlockList(List<JstBlock> blocks);
	void setProblems(List<IScriptProblem> probs);
	
}
