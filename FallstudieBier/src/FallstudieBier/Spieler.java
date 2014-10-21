package FallstudieBier;

import java.util.ArrayList;
import java.util.List;


public class Spieler {
	private String name;
	private int umsatz_akt;
	private int umsatz_ges;
	private float kontostand;
	private boolean ist_am_zug;
	//private int flaschenProZug = 0;
	//private float kostenProZug = 0;

	private Lager meinLager;
	private Supermarkt[] supermarkt;
	private Biergarten[] biergarten;
	private Brauerei[] brauerei;
	private DauerLieferant dauerLieferant;
	private EinmaligerLieferant einmaligerLieferant;
	private Skilltree[] skilltree = new Skilltree[3]; 
	private List<Vertrag> vertraege = new ArrayList<Vertrag>();
	

	private int angebotBiergarten = 0;
	private int angebotSupermarkt = 0;
	private int angebotELieferant = 0;
	
//Konstruktor	
	public Spieler(String pName, Supermarkt[] supermarkt, Biergarten[] biergarten, Brauerei[] brauerei,
				DauerLieferant dauerLieferant,	EinmaligerLieferant einmaligerLieferant){
		

		
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
//_____________________________________________________________________________________	

//Einlagern	
	public void einlagern(int pMenge, String pTyp){
			if(pTyp.equals("Bier")){
				if(meinLager.getKapazitaet() > meinLager.getBier() + meinLager.getRohstoffe() + pMenge){
					int neuerBestand = meinLager.getBier()+pMenge;
					meinLager.setBier(neuerBestand);
				}
				else{
					int neuerBestand = meinLager.getBier() + (meinLager.getKapazitaet() - meinLager.getBier() - meinLager.getRohstoffe());
					meinLager.setBier(neuerBestand);
				}
			}
			else if(pTyp.equals("Rohstoffe")){
				if(meinLager.getKapazitaet() > meinLager.getBier() + meinLager.getRohstoffe() + pMenge){
					int neuerBestand = meinLager.getRohstoffe()+pMenge;
					meinLager.setRohstoffe(neuerBestand);
				}
				else{
					System.out.println("Hier");
					int neuerBestand = meinLager.getRohstoffe() + (meinLager.getKapazitaet() - meinLager.getBier() - meinLager.getRohstoffe());
					meinLager.setRohstoffe(neuerBestand);
				}
			}
			else if(pTyp.equals("Kapazitaet")){
				int neuerBestand = meinLager.getKapazitaet()+pMenge;
				meinLager.setKapazitaet(neuerBestand);
			}
	}
//______________________________________________________________________________
	


	//Biergarten_______________________________________________________________________
	public void biergartenAusschreibung(String name2, int preis, int id) {
		// TODO Auto-generated method stub
		System.out.println(name2 +  " " + preis + " " + id);
		//Weitergeben an GUI!
	}

	public int getBiergartenAngebot() {
		// TODO Auto-generated method stub
		return angebotBiergarten;
	}
	
	
	public void setAngebotBiergarten(int pAngebot){
		// Wird von GUI aufgerufen
		angebotBiergarten = pAngebot;
	}

	public void zuschlagBiergarten(int i, int ID, int preis, int flaschenProZug, Biergarten bierg) {
		// TODO Auto-generated method stub
		brauerei[ID].erhoeheRange(i);
		kontostand = kontostand - preis;
		//this.flaschenProZug += flaschenProZug;
		Vertrag vertrag = new Vertrag(flaschenProZug, 0, "Biergarten", this, bierg, null);
		vertraege.add(vertrag);
	}
//___________________________________________________________________________________	


//___________________________________________________________________________________
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

	public void zuschlagSupermarkt(int i, int kosten, Supermarkt superm) {
		// TODO Auto-generated method stub
		//flaschenProZug = flaschenProZug + i;
		//kostenProZug = kostenProZug - kosten;
		Vertrag vertrag = new Vertrag(i, -kosten, "Biergarten", this, null, superm);
		vertraege.add(vertrag);
	}
//_____________________________________________________________________________________

//DauerhafterLieferant
	public void dLiefern(int pMenge){
		//Wird von GUI aufgerufen!
		float kosten = dauerLieferant.liefern(pMenge);
		kontostand -= kosten;
		einlagern(pMenge, "Rohstoffe");
	}
//____________________________________________________________________

//Einmaliger Lieferant
	public void ELieferantAusschreibung(int pMenge) {
		// TODO Auto-generated method stub
		System.out.println(pMenge);		
		//Weitergabe an GUI
	}
	
	public int getELieferantAngebot() {
		// TODO Auto-generated method stub
		return angebotELieferant;
	}
	
	public void setELieferantAngebot(int pAngebot){
		// Wird von GUI aufgerufen
		angebotELieferant = pAngebot;
	}
	
	public void zuschlagELieferant(int kapazitaet, int angebot) {
		// TODO Auto-generated method stub
		kontostand -= angebot;
		einlagern(kapazitaet, "Rohstoffe");
	}
//________________________________________________________________________
	
//Get und Set
	public Lager getLager(){
		return meinLager;
	}

	
	public float getKontostand(){
		return kontostand;
	}
	public void setKontostand(float kontostand) {
		this.kontostand = kontostand;
	}
	
	public int getX(int i){
		return brauerei[i].getPox_x();
	}
	
	public int getY(int i){
		return brauerei[i].getPos_y();
	}
	
	public int getRange(int i){
		return brauerei[i].getRange();
	}
	
	public int getRohstoffe(){
		return meinLager.getRohstoffe();
	}
	
	public int getBier(){
		return meinLager.getBier();
	}

	public List<Vertrag> getVertraege() {
		return vertraege;
	}

	public void vertragErfuellen() {
		// TODO Auto-generated method stub
		for (int i = 0; i < vertraege.size(); i++) {
			Vertrag tmp = vertraege.get(i);
			if(tmp.getLaufzeit() != 0){
				if(tmp.getFlaschenProZug() < getBier() && tmp.getKostenProZug() < kontostand){
					kontostand -= tmp.getKostenProZug();
					einlagern(- tmp.getFlaschenProZug(), "Bier");
					tmp.setLaufzeit(tmp.getLaufzeit()-1);
				}
				else{
					tmp.setLaufzeit(0);
					if(tmp.getBiergarten() != null){
						tmp.getBiergarten().setVergeben(false);
					}
					else{
						tmp.getSupermarkt().setVergeben(false);
					}
				}
			}
			else{
				tmp.setLaufzeit(0);
				if(tmp.getBiergarten() != null){
					tmp.getBiergarten().setVergeben(false);
				}
				else{
					tmp.getSupermarkt().setVergeben(false);
				}
			}
		}
	}

		
}
