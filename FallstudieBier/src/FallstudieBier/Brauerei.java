package FallstudieBier;

public class Brauerei extends Standort {

	private int kapazitaet;
	private int range = 5;
	private Spieler spieler;
	//Kosten bitte beim Spieler dazuzählen, hier wird nur die Kapazitaet gespeichert!
	
	public Brauerei(int kapazitaet,  int pos_x, int pos_y, String name){
		super(pos_x, pos_y, name);
		this.kapazitaet = kapazitaet;
		//this.spieler = besitzer;
	}

	public void herstellen(){
		spieler.einlagern(-kapazitaet, "Rohstoffe");
		spieler.einlagern(kapazitaet, "Bier");		
	}
	
	public int getKapazität() {
		return kapazitaet;
	}

	public void setKapazität(int kapazität) {
		this.kapazitaet = kapazität;
	}
	
	public void erhoeheRange(int i){
		range = range + i;
	}
	
	public int getRange(){
		return range;
	}	
}
