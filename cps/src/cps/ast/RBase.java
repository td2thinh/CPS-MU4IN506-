package cps.ast;

import cps.interfaces.IBase;
import cps.interfaces.IParamContext;

public class RBase implements IBase {
	public RBase() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object eval(IParamContext context) {
		// TODO Auto-generated method stub
		return context.getPosition();
	}
	
}
