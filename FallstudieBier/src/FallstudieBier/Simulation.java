package FallstudieBier;

public class Simulation {
	int month;
	Supermarkt[] supermarkt;
	Biergarten[] biergarten;
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
			biergarten[i] = new Biergarten(kapazitaet, preis, posX[i] - 2, posY[i] - 2, "Biergarten" + i);
		}
		
		for(int i = 0; i < anzSpieler; i++){
			int[] posXx = { 7, 12, 7, 12};
			int[] posYy = { 7, 7, 22, 22}; 
			brauerei[i] = new Brauerei(500, posXx[i], posYy[i], "Brauerei" + spielerName[i]);
		}
		
		dauerLieferant = new DauerLieferant("Hopfen Hopp AG");
		
		einmaligerLieferant = new Einmaliger_Lieferant("FreshField GmbH");
		
		for(int i = 0; i < anzSpieler; i++){
			spieler[i] = new Spieler(spielerName[i], supermarkt, biergarten, brauerei,
					 dauerLieferant, einmaligerLieferant);
		}
	}

}
