package FallstudieBier;

public class Biergarten extends Standort{
	
	private int kapazitaet;
	private int preis;
	private int id;

	
	public Biergarten(int kapazität, int preis,  int pos_x, int pos_y, String name, int id){
		super(pos_x, pos_y, name);
		this.preis = preis;
		this.kapazitaet = kapazität;
		this.id = id;
		
	}

	public void ausschreiben(){
		for(int i=0; i < spieler.length; i++){
			spieler[i].biergartenAusschreibung(name, preis, id);
		}
	}
	
	public void auswerten(){
		int gewinnerID = 10;
		int angebot = 0;
		for(int i=0; i < spieler.length; i++){
			if(angebot > spieler[i].getBiergartenAngebot()){
				gewinnerID = i;
				angebot = spieler[i].getBiergartenAngebot();
			}
		}
		spieler[gewinnerID].erhoeheRange(5, gewinnerID);
	}
	
	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
	
	
	
}
