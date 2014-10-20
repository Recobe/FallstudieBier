package FallstudieBier;

import static org.junit.Assert.*;

import org.junit.Test;

public class DauerLieferantTest {

	@Test
	public void test() {
		//Anpassbare Variablen
				int monat = 9;
				int spielerID = 0;
				//_______________
				
				Spieler[] spieler = new Spieler[2];
				DauerLieferant dauerL;
				Lager lager;
				
				Simulation sim = new Simulation();
				String[] spielerName = {"Jan", "Christian", null, null};
				sim.start(spielerName);
				spieler = sim.getSpieler();
				dauerL = sim.getDLieferant();
				//lager = sim.getLager(spielerID);
				
				//Ausgabe vor dem Verändern
				System.out.println(spieler[spielerID].getKontostand());
				System.out.println(spieler[spielerID].getRohstoffe());
				//____________________

				
				dauerL.pricing(monat);
				spieler[spielerID].dLiefern(500);
				
				
				
				//Ausgabe der Ergebnisse
				System.out.println(spieler[spielerID].getKontostand());
				System.out.println(spieler[spielerID].getRohstoffe());
				//____________________
	}

}
