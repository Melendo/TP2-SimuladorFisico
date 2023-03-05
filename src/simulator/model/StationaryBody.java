package simulator.model;

import simulator.misc.Vector2D;

public class StationaryBody extends Body {

	public StationaryBody(String id, String gid, Vector2D p, double m) {
		
		super(id, gid, new Vector2D(), p, m);
		// TODO Auto-generated constructor stub
	}

	@Override
	void advance(double dt) {

	}

}
