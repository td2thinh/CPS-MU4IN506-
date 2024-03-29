package cps.ast;

import cps.interfaces.IParamContext;
import cps.interfaces.IRand;

public class SRand implements IRand{
	private final String sensorId;
	
	
	public SRand(String sensorId) {
		this.sensorId = sensorId;
	}


	public String getSensorId() {
		return sensorId;
	}


	@Override
	public Object eval(IParamContext context) {
		return sensorId;
	}

}
