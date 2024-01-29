package cps.ast;

import cps.interfaces.IGather;
import cps.interfaces.IParamContext;

public class RGather implements IGather{
	private final String sensorId;
	private final IGather gather;
	public RGather(String sensorId, IGather gather) {
		this.sensorId = sensorId;
		this.gather = gather;
	}
	public String getSensorId() {
		return sensorId;
	}
	public IGather getGather() {
		return gather;
	}
	@Override
	public Object eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
}
