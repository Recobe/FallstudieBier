package FallstudieBier;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
		List<Vertrag> vertraege0 = new ArrayList<Vertrag>();
		List<Vertrag> vertraege1 = new ArrayList<Vertrag>();
		
		Simulation sim = new Simulation();
		
		sim.start(spielerName);
		supermarkt = sim.getSupermarkt();
		spieler = sim.getSpieler();
		

		
		supermarkt[sID].ausschreiben();
		
		spieler[0].setSupermarktAngebot(angebot0);
		spieler[1].setSupermarktAngebot(angebot1);
		
		supermarkt[sID].auswerten();
		
		vertraege0 = spieler[0].getVertraege();
		vertraege1 = spieler[1].getVertraege();
		
		//Ergebnisse
		//System.out.println("Spieler0: " + spieler[0].getKostenProZug() + " " + spieler[0].getFlaschenProZug());
		//System.out.println("Spieler1: " + spieler[1].getKostenProZug() + " " + spieler[1].getFlaschenProZug());
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
		//____________________________________________________________________
		
	}

}
