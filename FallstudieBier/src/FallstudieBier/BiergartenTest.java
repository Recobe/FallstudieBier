package FallstudieBier;

import static org.junit.Assert.*;

import org.junit.Test;

public class BiergartenTest {

	@Test
	public void test() {
		Biergarten[] biergarten = new Biergarten[10];
		Spieler[] spieler = new Spieler[2];
		
		Simulation sim = new Simulation();
		String[] spielerName = {"Jan", "Christian", null, null};
		sim.start(spielerName);
		biergarten = sim.getBiergaerten();
		spieler = sim.getSpieler();
		
		biergarten[0].ausschreiben();
	}

}
