package simulator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.json.JSONObject;

public class PhysicsSimulator {

	private double dt = 0;
	private double ta = 0;
	private ForceLaws leyes;
	private Map<String,BodiesGroup> mp;
	List <String> listaId;
	
	public PhysicsSimulator(double dt, ForceLaws leyes) {
		if(dt >=0) {
			this.dt = dt;
		} else {
			throw new IllegalArgumentException("El valor del tiempo real por paso tiene que ser mayor o igual que 0");
		}
		if(leyes != null) {
		this.leyes = leyes;
		}else {
			throw new IllegalArgumentException("El valor de las leyes no puede ser NULL");
		}
	}
		
	public void advance() {
		
		for(String clave : listaId) {
			mp.get(clave).advance(this.dt);
		}
		this.ta =+ this.dt;
	}	
	public void addGroup(String id) {
		if(!mp.containsKey(id)) {
			mp.put(id, new BodiesGroup(id, leyes));
		}
		else {
			throw new IllegalArgumentException("Ya existe un BodyGroup con ese id");
		}
	}
	public void addBody(Body b) {
		
	}
	public void setForceLaws(String id, ForceLaws f) {
		
	}
	public JSONObject getState() {
		
		return null;
	}
	public String toString() {
		
		return null;
	}
	
}
