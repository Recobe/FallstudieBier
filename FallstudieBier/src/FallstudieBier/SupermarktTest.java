package FallstudieBier;

import static org.junit.Assert.*;

import org.junit.Test;

public class SupermarktTest {

	@Test
	public void test() {
		Supermarkt[] supermarkt = new Supermarkt[15];
		Spieler[] spieler = new Spieler[2];
		Brauerei[] brauerei = new Brauerei[2];
		
		Simulation sim = new Simulation();
		String[] spielerName = {"Jan", "Christian", null, null};
		sim.start(spielerName);
		supermarkt = sim.getSupermarkt();
		spieler = sim.getSpieler();
		
		supermarkt[0].ausschreiben();
		
		spieler[0].setSupermarktAngebot(800);
		spieler[1].setSupermarktAngebot(400);
		
		supermarkt[0].auswerten();
		
		
	}

}
