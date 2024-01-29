package cps.ast;

import cps.interfaces.IParamContext;
import cps.interfaces.IRand;

public class CRand implements IRand{
	private  double randConst;

	public CRand(double randConst) {
		super();
		this.randConst = randConst;
	}

	public double getRandConst() {
		return randConst;
	}
	
	public void setRandConst(double randConst) {
		this.randConst = randConst;
	}

	@Override
	public Object eval(IParamContext context) {
		return randConst;
	}
	

}
