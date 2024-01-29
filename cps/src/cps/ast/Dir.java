package cps.ast;

import cps.interfaces.IDir;
import cps.interfaces.IParamContext;

public class Dir implements IDir {
	
	private final Direction dir;
	
	public Dir(Direction dir) {
		this.dir=dir;
	}
	public Direction getDir() {
		return dir;
	}
	@Override
	public Direction eval(IParamContext context) {
		return dir;
	}
}
