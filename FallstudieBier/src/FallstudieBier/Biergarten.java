package FallstudieBier;

public class Biergarten extends Standort{
	
	private int kapazitaet;
	private int preis;
	private int id;
	private int laufzeit = 0;

	
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
			if(angebot < spieler[i].getBiergartenAngebot()){
				if(spieler[i].getKontostand() > preis){	
					gewinnerID = i;
					angebot = spieler[i].getBiergartenAngebot();
					}
			}
			spieler[i].setAnbgebotBiergarten(0);
		}
		if(gewinnerID != 10){
			System.out.println(gewinnerID);
			spieler[gewinnerID].zuschlagBiergarten(5, gewinnerID, preis, angebot);
			laufzeit = 12;
		}
	}
	
	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
	
	public void minusLaufzeit(){
		laufzeit--;
	}
	
	
}
