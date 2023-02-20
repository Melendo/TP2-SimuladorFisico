package simulator.factories;

import org.json.JSONObject;

import simulator.misc.Vector2D;
import simulator.model.Body;
import simulator.model.MovingBody;

public class MovingBodyBuilder extends Builder<Body> {

	public MovingBodyBuilder() {
		super("mv_body", "Moving body");
	}

	@Override
	protected Body createInstance(JSONObject data) {
		String id = data.getString("id");
		String gid = data.getString("gid");
		Vector2D p = new Vector2D(data.getJSONArray("p").getDouble(0), data.getJSONArray("p").getDouble(1));
		Vector2D v = new Vector2D(data.getJSONArray("v").getDouble(0), data.getJSONArray("v").getDouble(1));
		double m = data.getDouble("m");
		
	    return new MovingBody(id, gid, p, v, m);
	}

}
