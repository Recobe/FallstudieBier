package FallstudieBier;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BiergartenTest {

	@Test
	public void test() {
		//Anpassbare Variablen
		String[] spielerName = {"Jan", "Christian", null, null};
		int angebot0 = 401;
		int angebot1 = 400;
		int bID = 1;
		//______________________________________________________
		Biergarten[] biergarten = new Biergarten[10];
		Spieler[] spieler = new Spieler[2];
		Brauerei[] brauerei = new Brauerei[2];
		List<Vertrag> vertraege0 = new ArrayList<Vertrag>();
		List<Vertrag> vertraege1 = new ArrayList<Vertrag>();
		
		Simulation sim = new Simulation();
		
		sim.start(spielerName);
		biergarten = sim.getBiergaerten();
		spieler = sim.getSpieler();
		brauerei = sim.getBrauerei();


		biergarten[bID].ausschreiben();
		
		spieler[0].setAngebotBiergarten(angebot0);
		spieler[1].setAngebotBiergarten(angebot1);
		
		biergarten[bID].auswerten();
		
		vertraege0 = spieler[0].getVertraege();
		vertraege1 = spieler[1].getVertraege();
		
		//Werte nach dem Test
		//System.out.println("Spieler0:" + spieler[0].getKontostand() + " " + spieler[0].getFlaschenProZug() + " " + brauerei[0].getRange());
		//System.out.println("Spieler1:" + spieler[1].getKontostand() + " " + spieler[1].getFlaschenProZug() + " " + brauerei[1].getRange());
		for (int i = 0; i < vertraege0.size(); i++) {
			Vertrag tmp = vertraege0.get(i);
			System.out.println(tmp.getFlaschenProZug());
			System.out.println(tmp.getKostenProZug());
		}
		for (int i = 0; i < vertraege1.size(); i++) {
			Vertrag tmp = vertraege1.get(i);
			System.out.println(tmp.getFlaschenProZug());
			System.out.println(tmp.getKostenProZug());
		}
		//___________________________________
				
		
		
		
	}

}
