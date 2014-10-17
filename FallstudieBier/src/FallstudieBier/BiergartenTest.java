package FallstudieBier;

import static org.junit.Assert.*;

import org.junit.Test;

public class BiergartenTest {

	@Test
	public void test() {
		Biergarten[] biergarten = new Biergarten[10];
		Spieler[] spieler = new Spieler[2];
		Brauerei[] brauerei = new Brauerei[2];
		
		Simulation sim = new Simulation();
		String[] spielerName = {"Jan", "Christian", null, null};
		sim.start(spielerName);
		biergarten = sim.getBiergaerten();
		spieler = sim.getSpieler();
		
		biergarten[0].ausschreiben();
		
		spieler[0].setAnbgebotBiergarten(300);
		spieler[1].setAnbgebotBiergarten(400);
		
		biergarten[0].auswerten();
		
		brauerei = sim.getBrauerei();
		System.out.println(brauerei[1].getRange());
	}

}
