package simulator.model;

import java.util.Iterator;
import java.util.List;
import simulator.misc.Vector2D;

public class MovingTowardsFixedPoint implements ForceLaws {
	
	Vector2D c;
	double g;
	
	public MovingTowardsFixedPoint (Vector2D c, double g) {
		if(c == null || g >0) {
			throw new IllegalArgumentException() ;
		}
		this.c = c;
		this.g = g;
	}

	@Override
	public void apply(List<Body> bs) {
		Iterator<Body> it = bs.iterator();
		Body bi;
		Vector2D fc;

	}

}
