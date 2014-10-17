package FallstudieBier;


public class Lieferant {
	
protected String name;
	
	
	// Constructor
	public Lieferant(String name) {
		super();
		this.name = name;		
	}	
	
	// Weitere Getter und Setter
	public String getName() {
		return name;
	}

	
	
	// toString
	@Override
	public String toString() {
		String s = name;
		return s;
	}

}
