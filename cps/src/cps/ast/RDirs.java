package cps.ast;

import java.util.ArrayList;
import java.util.List;

import cps.interfaces.IDir;
import cps.interfaces.IDirs;
import cps.interfaces.IParamContext;

public class RDirs implements IDirs{
	private IDir direction;
	private IDirs directions;

	
	
	public RDirs(IDir direction, IDirs directions) {
		super();
		this.direction = direction;
		this.directions = directions;
	}
	public IDir getDirection() {
		return direction;
	}
	public void setDirection(IDir direction) {
		this.direction = direction;
	}
	public IDirs getDirections() {
		return directions;
	}
	public void setDirections(IDirs directions) {
		this.directions = directions;
	}	
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Direction> eval(IParamContext context) {
		Direction dirEval = (Direction) this.direction.eval(context);
		ArrayList<Direction> listDirs = (ArrayList<Direction>) this.directions.eval(context); 
		listDirs.add(dirEval);
		return listDirs;
	}
}