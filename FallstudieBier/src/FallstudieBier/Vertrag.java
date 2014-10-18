package FallstudieBier;

public class Vertrag {

	private int laufzeit;
	private int flaschenProZug;
	private float kostenProZug;
	private String typ;
	private Spieler spieler;
	private Biergarten biergarten;
	private Supermarkt supermarkt;
	
	
	public Vertrag( int absatzmenge, float preisMtl,  String sorte, Spieler spieler, Biergarten biergarten, Supermarkt supermarkt){
		this.laufzeit = 12;
		this.flaschenProZug = absatzmenge;
		this.kostenProZug = preisMtl;
		this.typ = sorte;
		this.spieler = spieler;
		this.biergarten = biergarten;
		this.supermarkt = supermarkt;
	}
	
	public Spieler getSpieler() {
		return spieler;
	}

	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}

	public Biergarten getBiergarten() {
		return biergarten;
	}

	public void setBiergarten(Biergarten biergarten) {
		this.biergarten = biergarten;
	}

	public Supermarkt getSupermarkt() {
		return supermarkt;
	}

	public void setSupermarkt(Supermarkt supermarkt) {
		this.supermarkt = supermarkt;
	}


	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	public int getFlaschenProZug() {
		return flaschenProZug;
	}

	public void setFlaschenProZug(int absatzmenge) {
		this.flaschenProZug = absatzmenge;
	}

	public float getKostenProZug() {
		return kostenProZug;
	}

	public void setKostenProZug(float preisMtl) {
		this.kostenProZug = preisMtl;
	}


	public String getTyp() {
		return typ;
	}

	public void setTyp(String sorte) {
		this.typ = sorte;
	}
	
	
}
