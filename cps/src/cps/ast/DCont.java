package cps.ast;

import cps.interfaces.ICont;
import cps.interfaces.IDirs;
import cps.interfaces.IParamContext;

public class DCont implements ICont{
	private int jumps;
	private IDirs direction;

	
	
	public DCont(int jumps, IDirs direction) {
		super();
		this.jumps = jumps;
		this.direction = direction;
	}



	public int getJumps() {
		return jumps;
	}



	public void setJumps(int jumps) {
		this.jumps = jumps;
	}



	public IDirs getDirection() {
		return direction;
	}



	public void setDirection(IDirs direction) {
		this.direction = direction;
	}



	@Override
	public Object eval(IParamContext context) {
		// TODO Auto-generated method stub
		return null;
	}
}
