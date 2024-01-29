package cps.ast;

import cps.interfaces.IGather;
import cps.interfaces.IParamContext;

public class FGather implements IGather{
	private final String sensorId;
	public FGather(String sensorId) {
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
