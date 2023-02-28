package simulator.model;

import org.json.JSONObject;
import simulator.misc.Vector2D;

public abstract class Body {
	protected String id;
	protected String gid;
	protected Vector2D v;
	protected Vector2D f;
	protected Vector2D p;
	//protected Vector2D a;
	protected double m;
	
	//FALTA ACELERACION...
	Body(String id, String gid, Vector2D v, Vector2D p, double m) {
		if(id == null ||  id.trim().length() <= 0) { 
			throw new IllegalArgumentException("id debe contener al menos un caracter distinto del espacio en blanco");		
		}
		else this.id = id;
		
		if(gid == null ||  gid.trim().length() <= 0) { 
			throw new IllegalArgumentException("gid debe contener al menos un caracter distinto del espacio en blanco");		
		}
		else this.gid = gid;
		
		setVelocity(v);
		
		this.f = new Vector2D();
		
		if(p == null) {
			throw new IllegalArgumentException("El vector de posicion no puede ser nulo");		
		}
		else this.p = p;
		
		if(m < 0) {
			throw new IllegalArgumentException("La masa debe ser positiva");		
		}
		else this.m = m;
		
		
	}


	public String getId() {
		return id;
	}


	public String getGid() {
		return gid;
	}


	public double getMass() {
		return m;
	}


	public Vector2D getPosition() {
		return p;
	}


	public Vector2D getVelocity() {
		return v;
	}
	
	public void setVelocity(Vector2D v) {
		if(v == null) {
			throw new IllegalArgumentException("El vector de velocidad no puede ser nulo");		
		}
		else this.v = v;
	}
	
	/*public void setAcceleration(Vector2D a) {
		this.a = a;
	}*/


	public Vector2D getForce() {
		return f;
	}


	void addForce(Vector2D f) {
		 this.f = this.f.plus(f);
	}

	
	void resetForce() {
		this.f = new Vector2D();
	}

	
	abstract void advance(double dt);
	
	
	/*public int hashCode() {
		return 0;
	}*/
	
	
	public boolean equals(Object o) {
		Body bod = (Body) o;
		return (id.equals(bod.getId()));
	}


	public JSONObject getState() {
		JSONObject json = new JSONObject();
		json.put("id", getId());
		json.put("m", getMass());
		json.put("p", getPosition());
		json.put("v", getVelocity());
		json.put("f", getForce());
		return json;
	}


	public String toString() {
		return getState().toString();
	}
	
	
}
