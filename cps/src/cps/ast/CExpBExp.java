package cps.ast;

import cps.interfaces.IBExp;
import cps.interfaces.ICExp;
import cps.interfaces.IParamContext;

public class CExpBExp implements IBExp {
	private final ICExp cexpr;
	public CExpBExp(ICExp expr) {
		this.cexpr = expr;
	}
	public ICExp getExpr1() {
		return cexpr;
	}
	
	@Override
	public Boolean eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
