package cps.ast;

import java.util.ArrayList;

import cps.interfaces.ICont;
import cps.interfaces.IParamContext;

public class ECont implements ICont {
	
	public ECont() {
	}
	
	@Override
	public ArrayList<IParamContext> eval(IParamContext context) {
		
		return new ArrayList<IParamContext> ();
	}
}
