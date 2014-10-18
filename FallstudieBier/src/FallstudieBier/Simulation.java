package FallstudieBier;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
	int month = 8;
	Supermarkt[] supermarkt = new Supermarkt[15];
	Biergarten[] biergarten = new Biergarten[10];
	Brauerei[] brauerei;
	DauerLieferant dauerLieferant;
	Einmaliger_Lieferant einmaligerLieferant;
	int anzSpieler = 0;
	Spieler[] spieler;
	
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
		
		einmaligerLieferant = new Einmaliger_Lieferant("FreshField GmbH");
		
		for(int i = 0; i < anzSpieler; i++){
			spieler[i] = new Spieler(spielerName[i], supermarkt, biergarten, brauerei, dauerLieferant, einmaligerLieferant);
		}
		
		for(int i=0; i<10; i++){
			biergarten[i].setSpieler(spieler);
		}
		
		for(int i=0; i<15; i++){
			supermarkt[i].setSpieler(spieler);
		}
		
		einmaligerLieferant.setSpieler(spieler);
	
	}
	
	public void naechsteRunde(){
	//Muss noch implementiert werden... Ich hab keine Lust mehr^^
		if(month == 12){
			month = 1;
		}
		else{
			month++;
		}
		
		for (int i = 0; i < anzSpieler; i++) {
			brauerei[i].herstellen();
		}
		
		for (int i = 0; i < anzSpieler; i++) {
			spieler[i].vertragErfuellen();
		}
		
		for (int i = 0; i < biergarten.length; i++) {
			if((int)(Math.random()*21) == 20 && biergarten[i].isVergeben() == false){
				biergarten[i].ausschreiben();
				break;
			}
		}	
		
		for (int i = 0; i < supermarkt.length; i++) {
			if((int)(Math.random()*21) == 20 && supermarkt[i].isVergeben() == false){
				supermarkt[i].ausschreiben();
				break;
			}
		}
		
		if((int)(Math.random()*3) == 2 ){
				einmaligerLieferant.ausschreiben();
		}
		
		
		//Ich hoffe ich habe hier nichts vergessen :D
	}
	
	public Biergarten[] getBiergaerten(){
		return biergarten;
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
	
	public Einmaliger_Lieferant getEinmaligerL(){
		return einmaligerLieferant;
	}

}
