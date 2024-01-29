package cps.ast;

import cps.interfaces.ICExp;
import cps.interfaces.IParamContext;
import cps.interfaces.IRand;

public class EQCexp implements ICExp{
	private IRand rand1;
	private IRand rand2;
	public EQCexp(IRand rand1, IRand rand2) {
		
		this.rand1 = rand1;
		this.rand2 = rand2;
	}
	
	public IRand getRand1() {
		return rand1;
	}
	public void setRand1(IRand rand1) {
		this.rand1 = rand1;
	}
	public IRand getRand2() {
		return rand2;
	}
	public void setRand2(IRand rand2) {
		this.rand2 = rand2;
	}
	
	@Override
	public Boolean eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}

}
