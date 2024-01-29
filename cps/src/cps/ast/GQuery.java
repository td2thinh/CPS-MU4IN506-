package cps.ast;

import cps.interfaces.ICont;
import cps.interfaces.IGather;
import cps.interfaces.IParamContext;
import cps.interfaces.IQuery;

public class GQuery implements IQuery{
	private final IGather gather;
	private final ICont continuation;
	
	public GQuery(IGather gather, ICont continuation) {
		super();
		this.gather = gather;
		this.continuation = continuation;
	}
	public IGather getGather() {
		return gather;
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
