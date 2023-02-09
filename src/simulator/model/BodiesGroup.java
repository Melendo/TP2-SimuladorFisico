package simulator.model;

import java.util.List;

public class BodiesGroup {

	private String id;
	private ForceLaws fl;
	private List<Body> bs;
	
	BodiesGroup(String id, ForceLaws fl){
		if(id == null ||  id.trim().length() <= 0) { 
			throw new IllegalArgumentException("id debe contener al menos un caracter distinto del espacio en blanco");		
		}
		else this.id = id;
		if(fl == null ) { 
			throw new IllegalArgumentException("ForceLaws no puede ser NULL");		
		}
		else this.fl = fl;
	}

	public String getId() {
		return id;
	}

	public void setFl(ForceLaws fl) {
		this.fl = fl;
	}
	
}
