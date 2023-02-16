package simulator.model;

import org.json.JSONObject;

public class simulator {

	private double Trpp;
	private  ForceLaws leyes;
	
	public simulator(double Trpp, ForceLaws leyes) {
		if(Trpp>=0) {
		this.Trpp = Trpp;
		} else {
			throw new IllegalArgumentException("El valor del Tiempo real por paso tiene que ser mayor o igual que 0");
		}
		if(leyes != null) {
		this.leyes = leyes;
		}else {
			throw new IllegalArgumentException("El valor de las leyes no puede ser NULL");
		}
	}
		
	public void advance() {
		
	}	
	public void addGroup(String id) {
		
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
