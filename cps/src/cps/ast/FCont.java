package cps.ast;

import cps.interfaces.IBase;
import cps.interfaces.ICont;
import cps.interfaces.IParamContext;

public class FCont implements ICont{
	private final IBase base ;
	private final double distance;
	
	
	
	public FCont(IBase base, double distance) {
		super();
		this.base = base;
		this.distance = distance;
	}



	public IBase getBase() {
		return base;
	}



	public double getDistance() {
		return distance;
	}



	@Override
	public Object eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
