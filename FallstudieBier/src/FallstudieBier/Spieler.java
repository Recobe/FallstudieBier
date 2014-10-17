package FallstudieBier;


public class Spieler {
	private String name;
	private int umsatz_akt;
	private int umsatz_ges;
	private float kontostand;
	private boolean ist_am_zug;

	private Lager meinLager;
	private Supermarkt[] supermarkt;
	private Biergarten[] biergarten;
	private Brauerei[] brauerei;
	private DauerLieferant dauerLieferant;
	private Einmaliger_Lieferant einmaligerLieferant;
	private Skilltree[] skilltree; 
	
	private String aktBiergarten = "";
	private int preisBiergarten = 0;
	private int angebotBiergarten = 0;
	
	public Spieler(String pName, Supermarkt[] supermarkt, Biergarten[] biergarten, Brauerei[] brauerei,
				DauerLieferant dauerLieferant,	Einmaliger_Lieferant einmaligerLieferant){
		

		
		name = pName;
		meinLager = new Lager();
		this.supermarkt = supermarkt;
		this.biergarten = biergarten;
		this.brauerei = brauerei;
		this.dauerLieferant = dauerLieferant;
		this.einmaligerLieferant = einmaligerLieferant;
		
		skilltree[0] = new Skilltree("Herstellung");
		skilltree[1] = new Skilltree("Forschung");
		skilltree[2] = new Skilltree("Marketing");
		
	}
	
	public void einkaufen(int pMenge){
		float preis = DauerLieferant.liefern(pMenge);
		kontostand = kontostand - preis;
	}
	
	public void verkaufen(){
		
	}
	
	public void einlagern(int pMenge, String pTyp){
			if(pTyp.equals("Bier")){
				int neuerBestand = meinLager.getBier()+pMenge;
				meinLager.setBier(neuerBestand);	
			}
			else if(pTyp.equals("Rohstoffe")){
				int neuerBestand = meinLager.getRohstoffe()+pMenge;
				meinLager.setRohstoffe(neuerBestand);
			}
			else if(pTyp.equals("Kapazitaet")){
				int neuerBestand = meinLager.getKapazitaet()+pMenge;
				meinLager.setKapazitaet(neuerBestand);
			}
	}
	
	public void angebot_machen(){
		
	}

	public void biergartenAusschreibung(String name2, int preis) {
		// TODO Auto-generated method stub
		//Weitergeben an GUI!
		aktBiergarten = name2;
		preisBiergarten = preis;
	}

	public int getBiergartenAngebot() {
		// TODO Auto-generated method stub
		return angebotBiergarten;
	}
	
	public void setAnbgebotBiergarten(int pAngebot){
		// Wird von GUI aufgerufen
		angebotBiergarten = pAngebot;
	}

}
