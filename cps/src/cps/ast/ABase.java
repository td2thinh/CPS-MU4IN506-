package cps.ast;


import cps.interfaces.IBase;
import cps.interfaces.IParamContext;

public class ABase implements IBase {
	private final Position position;
	
	public ABase(Position position) {
		// TODO Auto-generated constructor stub
		this.position=position;
	}
	
	@Override
	public Object eval(IParamContext context) {
		context.setPosition(position);
		return null;
	}
}