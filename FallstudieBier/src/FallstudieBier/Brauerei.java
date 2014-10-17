package FallstudieBier;

public class Brauerei extends Standort {

	private int kapazitaet;

	private Spieler spieler;
	
	public Brauerei(int kapazitaet,  int pos_x, int pos_y, String name){
		super(pos_x, pos_y, name);
		this.kapazitaet = kapazitaet;
		this.spieler = besitzer;
	}

	public void herstellen(int menge){
		spieler.einlagern(kapazitaet, "Bier");
		spieler.einlagern(-kapazitaet, "Rohstoffe");		
	}
	
	public int getKapazit�t() {
		return kapazitaet;
	}

	public void setKapazit�t(int kapazit�t) {
		this.kapazitaet = kapazit�t;
	}


	
	
}
