package FallstudieBier;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
	int month = 8;
	Supermarkt[] supermarkt = new Supermarkt[15];
	Biergarten[] biergarten = new Biergarten[10];
	Brauerei[] brauerei;
	DauerLieferant dauerLieferant;
	EinmaligerLieferant einmaligerLieferant;
	int anzSpieler = 0;
	Spieler[] spieler;
	int biergartenNr = 100;
	int supermarktNr = 100;
	boolean eLieferant = false;
	int[] reihenfolge;
	
	public void start(String[] spielerName){
		for (int i = 0; i < 4; i++) {
			if(spielerName[i] != null){
				anzSpieler = anzSpieler + 1;
			}
		}
		
		brauerei = new Brauerei[anzSpieler];
		spieler = new Spieler[anzSpieler];
		
		int[] posX = {5, 10, 15, 5, 10, 15, 5, 10, 15, 5, 10, 15, 5, 10, 15 };
		int[] posY = {5, 5, 5, 10, 10, 10, 15, 15, 15, 20, 20, 20, 25, 25, 25};
		for(int i = 0; i < 15; i++){
			int kaufkraft = (int) (Math.random()*2000 + 500);
			float maxpreis = (float) (Math.random()*2 + 1);
			supermarkt[i] = new Supermarkt(kaufkraft, maxpreis,posX[i], posY[i], "Supermarkt" + i);
		}
		
		for(int i = 0; i < 10; i++){
			int kapazitaet = (int) (Math.random()*2000 + 500);
			int preis = (int) (Math.random()*5000 + 1000);
			biergarten[i] = new Biergarten(kapazitaet, preis, posX[i] - 2, posY[i] - 2, "Biergarten" + i, i);
		}
		
		for(int i = 0; i < anzSpieler; i++){
			int[] posXx = { 7, 12, 7, 12};
			int[] posYy = { 7, 7, 22, 22}; 
			brauerei[i] = new Brauerei(500, posXx[i], posYy[i], "Brauerei" + spielerName[i]);
		}
		
		dauerLieferant = new DauerLieferant("Hopfen Hopp AG");
		
		einmaligerLieferant = new EinmaligerLieferant("FreshField GmbH");
		
		for(int i = 0; i < anzSpieler; i++){
			spieler[i] = new Spieler(spielerName[i], supermarkt, biergarten, brauerei, dauerLieferant, einmaligerLieferant, i);
		}
		
		for(int i=0; i<10; i++){
			biergarten[i].setSpieler(spieler);
		}
		
		for(int i=0; i<15; i++){
			supermarkt[i].setSpieler(spieler);
		}
		
		einmaligerLieferant.setSpieler(spieler);
		
		for(int i = 0; i < anzSpieler; i++){
			brauerei[i].setSpieler(spieler[i]);
		}
	
	}
	
	public void naechsteRunde(){
	//Muss noch implementiert werden... Ich hab keine Lust mehr^^
		biergartenNr = 100;
		supermarktNr = 100;
		eLieferant = false;
		
		if(month == 12){
			month = 1;
		}
		else{
			month++;
		}
		
		dauerLieferant.pricing(month);
		
		for (int i = 0; i < anzSpieler; i++) {
			brauerei[i].herstellen();
		}
		
		for (int i = 0; i < anzSpieler; i++) {
			spieler[i].vertragErfuellen();
		}
		
		for (int i = 0; i < biergarten.length; i++) {
			if((int)(Math.random()*21) == 20 && biergarten[i].isVergeben() == false){
				biergarten[i].ausschreiben();
				biergartenNr = i;
				break;
			}
		}	
		
		for (int i = 0; i < supermarkt.length; i++) {
			if((int)(Math.random()*21) == 20 && supermarkt[i].isVergeben() == false){
				supermarkt[i].ausschreiben();
				supermarktNr = i;
				break;
			}
		}
		
		if((int)(Math.random()*3) == 2 ){
				einmaligerLieferant.setKapazitaet((int)(Math.random()*1500)+500);
				einmaligerLieferant.ausschreiben();
				eLieferant = true;
		}
		
		dauerLieferant.pricing(month);
		
		
		//Ich hoffe ich habe hier nichts vergessen :D
	}
	
	public void reihenfolge() {
		switch(anzSpieler) {
		case 2:
			reihenfolge = new int[2];
			reihenfolge[0] = 1;
			reihenfolge[1] = 2;
					if(spieler[0].getKontostand() > spieler[1].getKontostand()) {
						int c = reihenfolge[0];
						reihenfolge[0] = reihenfolge[1];
						reihenfolge[1] = c;
					}
			break;
		/*case 3:
			reihenfolge = new int[3];
			reihenfolge[0] = 1;
			reihenfolge[1] = 2;
			reihenfolge[2] = 3;

			for(int i = 1; i < reihenfolge.length; i++) {
				for(int j = 0; j < reihenfolge.length-1; j++) {
					if(spieler[j].getKontostand() > spieler[j+1].getKontostand()) {
						int c = reihenfolge[j];
						reihenfolge[j] = reihenfolge[j+1];
						reihenfolge[j+1] = c;
					}
				}
			}
		case 4:
			reihenfolge = new int[4];
			reihenfolge[0] = 1;
			reihenfolge[1] = 2;
			reihenfolge[2] = 3;
			reihenfolge[3] = 4;

			for(int i = 1; i < reihenfolge.length; i++) {
				for(int j = 0; j < reihenfolge.length-1; j++) {
					if(spieler[j].getKontostand() > spieler[j+1].getKontostand()) {
						int c = reihenfolge[j];
						reihenfolge[j] = reihenfolge[j+1];
						reihenfolge[j+1] = c;
					}
				}
			}*/
		}
	}
	
	public Biergarten[] getBiergaerten(){
		return biergarten;
	}
	
	public boolean isELieferant(){
		return eLieferant;
	}
	
	public int getBiergartenNr() {
		return biergartenNr;
	}
	
	public int getSupermarktNr() {
		return supermarktNr;
	}
	
	public Spieler[] getSpieler(){
		return spieler;
	}
	
	public Brauerei[] getBrauerei(){
		return brauerei;
	}

	public Supermarkt[] getSupermarkt() {
		// TODO Auto-generated method stub
		return supermarkt;
	}
	
	public DauerLieferant getDLieferant(){
		return dauerLieferant;
	}
	
	public Lager getLager(int i){
		return spieler[i].getLager();
	}
	
	public EinmaligerLieferant getEinmaligerL(){
		return einmaligerLieferant;
	}
	
	public int getAnzahlSpieler() {
		return anzSpieler;
	}
	
	public int getMonat() {
		return month;
	}

}
