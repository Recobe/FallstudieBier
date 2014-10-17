package FallstudieBier;

import static org.junit.Assert.*;

import org.junit.Test;

public class SupermarktTest {
	
	@Test
	public void test() {
		//Anpassbare Variablen
		String[] spielerName = {"Jan", "Christian", null, null};
		int angebot0 = 400;
		int angebot1 = 401;
		int sID = 1;
		//__________________________________________________________________
		Supermarkt[] supermarkt = new Supermarkt[15];
		Spieler[] spieler = new Spieler[2];
		Brauerei[] brauerei = new Brauerei[2];
		
		Simulation sim = new Simulation();
		
		sim.start(spielerName);
		supermarkt = sim.getSupermarkt();
		spieler = sim.getSpieler();
		
		//Ausgabe vor Änderung
		System.out.println("Spieler0: " + spieler[0].getKostenProZug() + " " + spieler[0].getFlaschenProZug());
		System.out.println("Spieler1: " + spieler[1].getKostenProZug() + " " + spieler[1].getFlaschenProZug());
		//____________________________________________________________________
		
		supermarkt[sID].ausschreiben();
		
		spieler[0].setSupermarktAngebot(angebot0);
		spieler[1].setSupermarktAngebot(angebot1);
		
		supermarkt[sID].auswerten();
		
		//Ergebnisse
		System.out.println("Spieler0: " + spieler[0].getKostenProZug() + " " + spieler[0].getFlaschenProZug());
		System.out.println("Spieler1: " + spieler[1].getKostenProZug() + " " + spieler[1].getFlaschenProZug());
		//____________________________________________________________________
		
	}

}
