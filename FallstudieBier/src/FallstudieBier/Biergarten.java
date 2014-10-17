package FallstudieBier;

public class Biergarten extends Standort{
	
	private int kapazitaet;
	private int preis;
	
	public Biergarten(int kapazität, int preis,  int pos_x, int pos_y, String name){
		super(pos_x, pos_y, name);
		this.preis = preis;
		this.kapazitaet = kapazität;
	}

	public void ausschreiben(){
		for(int i=0; i < spieler.length; i++){
			spieler[i].biergartenAusschreibung(name, preis);
		}
	}
	
	public void auswerten(){
		int gewinnerID;
		int angebot = 0;
		for(int i=0; i < spieler.length; i++){
			if(angebot < spieler[i].getBiergartenAngebot()){
				gewinnerID = i;
				angebot = spieler[i].getBiergartenAngebot();
			}
		}
	}
	
	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
	
	
	
}
