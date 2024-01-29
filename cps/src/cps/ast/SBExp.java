package cps.ast;

import cps.interfaces.IBExp;
import cps.interfaces.IParamContext;

public class SBExp implements IBExp {
	private final String sensorId;
	public SBExp(String sensorId) {
		super();
		this.sensorId = sensorId;
	}
	public String getSensorId() {
		return sensorId;
	}
	
	@Override
	public Object eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
