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
	
	public int angebot_machen(){
		int menge;
		
		return menge;
	}
	
	public Spieler angebot_auswerten(){
		Spieler partner;
	}
}
