package FallstudieBier;

public class Supermarkt extends Standort{

	private int kaufkraft;
	private float maxpreis;
	
	public Supermarkt(int kaufkraft, float maxpreis, int pos_x, int pos_y, String name){
		super(pos_x, pos_y, name);
		this.kaufkraft = kaufkraft;
		this.maxpreis = maxpreis;
	}

	public int getKaufkraft() {
		return kaufkraft;
	}

	public void setKaufkraft(int kaufkraft) {
		this.kaufkraft = kaufkraft;
	}

	public float getMaxpreis() {
		return maxpreis;
	}

	public void setMaxpreis(float maxpreis) {
		this.maxpreis = maxpreis;
	}
	
	public void ausschreiben(){
		for(int i=0; i < spieler.length; i++){
			spieler[i].supermarktAusschreibung(kaufkraft);
		}
	}
	
	public void auswerten(){
		int gewinnerID = 10;
		int angebot = 0;
		for(int i=0; i < spieler.length; i++){
			if(angebot < spieler[i].getSupermarktAngebot()){
				if(spieler[i].getKontostand() > spieler[i].getSupermarktAngebot()){	
					gewinnerID = i;
					angebot = spieler[i].getSupermarktAngebot();
				}
			}
			spieler[i].setSupermarktAngebot(0);
		}
		if(gewinnerID != 10){
			System.out.println("Das Supermarkt-Angebot geht an: " + gewinnerID);
			spieler[gewinnerID].zuschlagSupermarkt(kaufkraft, angebot);
		}
	}
}
