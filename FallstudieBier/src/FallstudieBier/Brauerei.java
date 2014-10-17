package FallstudieBier;

public class Brauerei extends Standort {

	private int kapazitaet;
	private int range;
	private Spieler spieler;
	
	public Brauerei(int kapazitaet,  int pos_x, int pos_y, String name){
		super(pos_x, pos_y, name);
		this.kapazitaet = kapazitaet;
		this.spieler = besitzer;
		range = 5;
	}

	public void herstellen(int menge){
		spieler.einlagern(kapazitaet, "Bier");
		spieler.einlagern(-kapazitaet, "Rohstoffe");		
	}
	
	public int getKapazitšt() {
		return kapazitaet;
	}

	public void setKapazitšt(int kapazitšt) {
		this.kapazitaet = kapazitšt;
	}
	
	public void erhoeheRange(int i){
		range = range + i;
	}
	
	
}
