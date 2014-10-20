package FallstudieBier;

import static org.junit.Assert.*;

import org.junit.Test;

public class EinmaligerLieferantTest {

	@Test
	public void test() {
		//Anpassbare Variablen
		String[] spielerName = {"Jan", "Christian", null, null};
		int angebot0 = 1;
		int angebot1 = 400;
		int bID = 1;
	//______________________________________________________
		EinmaligerLieferant einmaligerL;
		Spieler[] spieler = new Spieler[2];
		Brauerei[] brauerei = new Brauerei[2];
		
		Simulation sim = new Simulation();
		
		sim.start(spielerName);
		einmaligerL = sim.getEinmaligerL();
		spieler = sim.getSpieler();
		brauerei = sim.getBrauerei();
		
	//Werte vor dem Ändern
		System.out.println("Spieler0:" + spieler[0].getKontostand() + " " + spieler[0].getRohstoffe());
		System.out.println("Spieler1:" + spieler[1].getKontostand() + " " + spieler[1].getRohstoffe());
	//___________________________________
		
		einmaligerL.setKapazitaet((int) (Math.random()*2000 + 200));
		
		einmaligerL.ausschreiben();
		
		spieler[0].setELieferantAngebot(angebot0);
		spieler[1].setELieferantAngebot(angebot1);
		
		einmaligerL.auswerten();
		
	//Werte nach dem Test
		System.out.println("Spieler0:" + spieler[0].getKontostand() + " " + spieler[0].getRohstoffe());
		System.out.println("Spieler1:" + spieler[1].getKontostand() + " " + spieler[1].getRohstoffe());
	//___________________________________
	}

}
