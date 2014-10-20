package FallstudieBier;

public class EinmaligerLieferant extends Lieferant {

	private int kapazitaet;
	Spieler[] spieler = new Spieler[4];

	public EinmaligerLieferant(String name) {
		super(name);		
	}
	
	public void ausschreiben(){
		for (int i = 0; i < spieler.length; i++) {
			spieler[i].ELieferantAusschreibung(kapazitaet);
		}
	}
	
	public void auswerten(){
		int gewinnerID = 10;
		int angebot = 0;
		for(int i=0; i < spieler.length; i++){
			if(angebot < spieler[i].getELieferantAngebot()){
				if(spieler[i].getKontostand() > spieler[i].getELieferantAngebot()){	
					gewinnerID = i;
					angebot = spieler[i].getELieferantAngebot();
					}
			}
		spieler[i].setELieferantAngebot(0);
		}
	if(gewinnerID != 10){
		System.out.println(gewinnerID);
		spieler[gewinnerID].zuschlagELieferant(kapazitaet, angebot);
	}
}

	
	// Getter und Setter
	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
	
	public void setSpieler(Spieler[] spieler){
		this.spieler = spieler;
	}
}
