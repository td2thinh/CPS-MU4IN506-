package cps.ast;

import cps.interfaces.IBExp;
import cps.interfaces.IParamContext;

public class OrBExp implements IBExp {
	private final IBExp expr1;
	private final IBExp expr2;
	public OrBExp(IBExp expr1, IBExp expr2) {
		super();
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	public IBExp getExpr1() {
		return expr1;
	}
	public IBExp getExpr2() {
		return expr2;
	}
	@Override
	public Boolean eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
