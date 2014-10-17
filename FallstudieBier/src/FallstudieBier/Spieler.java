package FallstudieBier;


public class Spieler {
	private String name;
	private int umsatz_akt;
	private int umsatz_ges;
	private float kontostand;
	private boolean ist_am_zug;
	private int flaschenProZug = 0;
	private int kostenProZug = 0;

	private Lager meinLager;
	private Supermarkt[] supermarkt;
	private Biergarten[] biergarten;
	private Brauerei[] brauerei;
	private DauerLieferant dauerLieferant;
	private Einmaliger_Lieferant einmaligerLieferant;
	private Skilltree[] skilltree = new Skilltree[3]; 
	

	private int angebotBiergarten = 0;
	private int angebotSupermarkt = 0;
	
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
		
		kontostand = 6000;
		
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
	

	public void biergartenAusschreibung(String name2, int preis, int id) {
		// TODO Auto-generated method stub
		System.out.println(name2 +  " " + preis + " " + id);
		//Weitergeben an GUI!
	}

	public int getBiergartenAngebot() {
		// TODO Auto-generated method stub
		return angebotBiergarten;
	}
	
	
	public void setAnbgebotBiergarten(int pAngebot){
		// Wird von GUI aufgerufen
		angebotBiergarten = pAngebot;
	}

	public void zuschlagBiergarten(int i, int ID, int preis, int flaschenProZug) {
		// TODO Auto-generated method stub
		brauerei[ID].erhoeheRange(i);
		kontostand = kontostand - preis;
		this.flaschenProZug += flaschenProZug;
	}
	
	public float getKontostand(){
		return kontostand;
	}
	
	public void supermarktAusschreibung(int pMenge){
		System.out.println(pMenge);		
		//Weitergabe an GUI
	}

	public int getSupermarktAngebot() {
		// TODO Auto-generated method stub
		return angebotSupermarkt;
	}
	
	
	public void setSupermarktAngebot(int pAngebot){
		// Wird von GUI aufgerufen
		angebotSupermarkt = pAngebot;
	}

	public void zuschlagSupermarkt(int i, int kosten) {
		// TODO Auto-generated method stub
		flaschenProZug = flaschenProZug + i;
		kostenProZug = kostenProZug + kosten;
	}
}
