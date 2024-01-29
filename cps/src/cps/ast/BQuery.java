package cps.ast;

import cps.interfaces.IBExp;
import cps.interfaces.ICont;
import cps.interfaces.IGather;
import cps.interfaces.IParamContext;
import cps.interfaces.IQuery;

public class BQuery implements IQuery{
	private final IBExp expr;
	private final ICont continuation;
	
	public BQuery(IBExp expr, ICont continuation) {
		super();
		this.expr = expr;
		this.continuation = continuation;
	}
	public IBExp getExpression() {
		return expr;
	}
	public ICont getContinuation() {
		return continuation;
	}

	@Override
	public Object eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
