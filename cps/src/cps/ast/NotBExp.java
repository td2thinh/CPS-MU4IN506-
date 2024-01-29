package cps.ast;

import cps.interfaces.IBExp;
import cps.interfaces.IParamContext;

public class NotBExp implements IBExp {
	private final IBExp expr;
	public NotBExp(IBExp expr) {
		super();
		this.expr = expr;
	}
	public IBExp getExpr1() {
		return expr;
	}
	
	@Override
	public Boolean eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
