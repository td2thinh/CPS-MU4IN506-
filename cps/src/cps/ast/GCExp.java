package cps.ast;

import cps.interfaces.ICExp;
import cps.interfaces.IParamContext;
import cps.interfaces.IRand;

public class GCExp implements ICExp{
	
	private final IRand rand1;
	private final IRand rand2;
	
	public GCExp(IRand rand1, IRand rand2) {
		super();
		this.rand1 = rand1;
		this.rand2 = rand2;
	}
	public IRand getRand1() {
		return rand1;
	}
	public IRand getRand2() {
		return rand2;
	}
	@Override
	public Boolean eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
}