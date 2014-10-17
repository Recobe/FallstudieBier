package FallstudieBier;

import static org.junit.Assert.*;

import org.junit.Test;

public class BiergartenTest {

	@Test
	public void test() {
		//Anpassbare Variablen
		String[] spielerName = {"Jan", "Christian", null, null};
		int angebot0 = 1;
		int angebot1 = 400;
		int bID = 1;
		//______________________________________________________
		Biergarten[] biergarten = new Biergarten[10];
		Spieler[] spieler = new Spieler[2];
		Brauerei[] brauerei = new Brauerei[2];
		
		
		Simulation sim = new Simulation();
		
		sim.start(spielerName);
		biergarten = sim.getBiergaerten();
		spieler = sim.getSpieler();
		brauerei = sim.getBrauerei();
		
		//Werte vor dem Ändern
		System.out.println("Spieler0:" + spieler[0].getKontostand() + " " + spieler[0].getFlaschenProZug() + " " + brauerei[0].getRange());
		System.out.println("Spieler1:" + spieler[1].getKontostand() + " " + spieler[1].getFlaschenProZug() + " " + brauerei[1].getRange());
		//___________________________________
		
		biergarten[bID].ausschreiben();
		
		spieler[0].setAngebotBiergarten(angebot0);
		spieler[1].setAngebotBiergarten(angebot1);
		
		biergarten[bID].auswerten();
		
		//Werte nach dem Test
		System.out.println("Spieler0:" + spieler[0].getKontostand() + " " + spieler[0].getFlaschenProZug() + " " + brauerei[0].getRange());
		System.out.println("Spieler1:" + spieler[1].getKontostand() + " " + spieler[1].getFlaschenProZug() + " " + brauerei[1].getRange());
		//___________________________________
				
		
		
		
	}

}
