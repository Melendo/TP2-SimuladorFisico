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
	protected Body createInstance(JSONObject data){
		if(!data.has("id")) throw new IllegalArgumentException("Id no puede ser nulo en MovingBody");		
		String id = data.getString("id");
				
		if(!data.has("gid")) throw new IllegalArgumentException("Gid no puede ser nulo en MovingBody");
		String gid = data.getString("gid");
		
		if(!data.has("p") || data.getJSONArray("p").length() != 2) throw new IllegalArgumentException("La posicion no puede ser nula en MovingBody");
		Vector2D p = new Vector2D(data.getJSONArray("p").getDouble(0), data.getJSONArray("p").getDouble(1));
		
		if(!data.has("v") || data.getJSONArray("v").length() != 2) throw new IllegalArgumentException("Velocidad no puede ser nula en MovingBody");
		Vector2D v = new Vector2D(data.getJSONArray("v").getDouble(0), data.getJSONArray("v").getDouble(1));
		
		double m = data.getDouble("m");
		
		return new MovingBody(id, gid, p, v, m);
		
	}

}
