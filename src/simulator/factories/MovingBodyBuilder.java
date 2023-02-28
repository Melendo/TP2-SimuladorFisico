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
	protected Body createInstance(JSONObject data){ //HAY QUE USAR HAS???
		String id = data.getString("id");
		if(id == null) throw new IllegalArgumentException("Id no puede ser nulo en MovingBody");
		
		String gid = data.getString("gid");
		if(gid == null) throw new IllegalArgumentException("Gid no puede ser nulo en MovingBody");
		
		Vector2D p = new Vector2D(data.getJSONArray("p").getDouble(0), data.getJSONArray("p").getDouble(1));
		if(p == null) throw new IllegalArgumentException("La posicion no puede ser nula en MovingBody");
		
		Vector2D v = new Vector2D(data.getJSONArray("v").getDouble(0), data.getJSONArray("v").getDouble(1));
		if(v == null) throw new IllegalArgumentException("Velocidad no puede ser nula en MovingBody");
		
		double m = data.getDouble("m");
		
		return new MovingBody(id, gid, p, v, m);
		
	}

}
