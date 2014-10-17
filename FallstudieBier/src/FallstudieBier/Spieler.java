package FallstudieBier;


public class Spieler {
	private String name;
	private int umsatz_akt;
	private int umsatz_ges;
	private float kontostand;
	private boolean ist_am_zug;
	private int range;
	Lager meinLager;
	Supermarkt[] supermarkt;
	Biergarten[] biergarten;
	Brauerei[] brauerei;
	DauerLieferant dauerLieferant;
	Einmaliger_Lieferant einmaligerLieferant;
	Skilltree[] skilltree; 
	
	public Spieler(String pName, Supermarkt[] supermarkt, Biergarten[] biergarten, Brauerei[] brauerei,
				DauerLieferant dauerLieferant,	Einmaliger_Lieferant einmaligerLieferant){
		
		range = 5;
		
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

}
