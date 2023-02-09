package simulator.model;

import simulator.misc.Vector2D;

public class MovingBody extends Body {

	public MovingBody(String id, String gid, Vector2D v, Vector2D p, double m) {
		super(id, gid, v, p, m);
		
	}

	@Override
	void advance(double dt) {
		if(this.m == 0) {
			this.a = new Vector2D();
		}
		else {
			this.a = this.f.scale(1/m);
		}
		this.p = this.p.plus((this.v.scale(dt)).plus(this.a.scale(dt*dt/2)));
		this.v = this.v.plus(this.a.scale(dt));
	}

}
