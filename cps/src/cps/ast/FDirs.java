package cps.ast;

import java.util.Stack;

import cps.interfaces.IDir;
import cps.interfaces.IDirs;
import cps.interfaces.IParamContext;

public class FDirs implements IDirs{

	private IDir direction;
	
	public FDirs(IDir direction) {
		// TODO Auto-generated constructor stub
		this.direction = direction;
	}
	
	@Override
	public Object eval(IParamContext context) {
		Direction dir = (Direction) this.direction.eval(context);
		Stack<Direction> dirs = new Stack<>();
		dirs.add(dir);
		return dirs;
	}
	
}
