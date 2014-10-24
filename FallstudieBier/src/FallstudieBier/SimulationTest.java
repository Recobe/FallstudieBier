package FallstudieBier;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SimulationTest {

	@Test
	public void test() {
		
		// Spielstart
		Simulation sim = new Simulation();
		String[] spieler = {"Jan", "Oskar", "Christian", null};
		sim.start(spieler);
		Spieler[] alleSpieler = sim.getSpieler();
		Spieler jan = alleSpieler[0];
		Spieler oskar = alleSpieler[1];
		Spieler christian = alleSpieler[2];
		
		// Runde 1
		System.out.println("--- RUNDE 1 ---");
		
		// Jan kauft 100 Rohstoffe
		System.out.println("Jans Kontostand: " + jan.getKontostand() + " Jans Rohstoffe " + jan.getRohstoffe());
		jan.setKontostand(jan.getKontostand() - sim.getDLieferant().liefern(100));
		jan.einlagern(100, "Rohstoffe");
		System.out.println("Jan kauft "+ 100 + " Rohstoffe");
		System.out.println("Jans Kontostand: " + jan.getKontostand() + " Jans Rohstoffe " + jan.getRohstoffe());
		
		// Oskar skillt Forschung 1
		System.out.println("Oskars Kontostand: " + oskar.getKontostand() + " Oskars Kapazität " + oskar.getBrauereiKap(1));
		System.out.println("Oskar skillt Forschung 1");
		oskar.getSkilltree()[1].setSkill( 5, oskar.getKontostand(), oskar);
		System.out.println("Oskars neuer Kontostand: " + oskar.getKontostand() + " Oskars Kapazität " + oskar.getBrauereiKap(1));
		
		// Christian skillt Marketing 1
		System.out.println("Christians Kontostand: " + christian.getKontostand() + " Christians Kapazität " + christian.getBrauereiKap(1));
		System.out.println("Christian skillt Marketing 1");
		oskar.getSkilltree()[2].setSkill( 9, christian.getKontostand(), christian);
		System.out.println("Christians neuer Kontostand: " + christian.getKontostand() + " Christians Kapazität " + christian.getBrauereiKap(1));

		
		
		
		sim.naechsteRunde();
		// Runde 2
		System.out.println("--- RUNDE 2 ---");
		
		
		// Vorgehen falls Ausschreibung (zufällig) vorhanden
		if (sim.getSupermarktNr() != 100) {
			System.out.println("Supermarktausschreibung!");
			
			// Jan bietet 1 Flasche
			jan.setSupermarktAngebot(1);
			
			// Oskar bietet 400 Flaschen
			oskar.setSupermarktAngebot(400);
			
			// Christian bietet 350 Flaschen
			christian.setSupermarktAngebot(350);
			
			// Auswerten der Angebote
			Supermarkt[] supermaerkte = sim.getSupermarkt();
			supermaerkte[sim.getSupermarktNr()].auswerten();
			
			List<Vertrag> vertraege0 = new ArrayList<Vertrag>();
			List<Vertrag> vertraege1 = new ArrayList<Vertrag>();
			List<Vertrag> vertraege2 = new ArrayList<Vertrag>();
			vertraege0 = jan.getVertraege();
			vertraege1 = oskar.getVertraege();
			vertraege2 = christian.getVertraege();
			
			
			//Ergebnisse
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
			for (int i = 0; i < vertraege2.size(); i++) {
				Vertrag tmp = vertraege2.get(i);
				System.out.println(tmp.getFlaschenProZug());
				System.out.println(tmp.getKostenProZug());
			}
		}
		
		if (sim.getBiergartenNr() != 100) {
			System.out.println("Biergartenauschreibung!");
			
			// Jan bietet 450 Flaschen
			jan.setAngebotBiergarten(450);
			
			// Oskar bietet 300 Flaschen
			oskar.setAngebotBiergarten(300);
			
			// Christian bietet 500 Flaschen
			christian.setAngebotBiergarten(500);
			
			// Auswerten der Angebote
			Biergarten[] biergaerten = sim.getBiergaerten();
			biergaerten[sim.getBiergartenNr()].auswerten();
			
			List<Vertrag> vertraege0 = new ArrayList<Vertrag>();
			List<Vertrag> vertraege1 = new ArrayList<Vertrag>();
			List<Vertrag> vertraege2 = new ArrayList<Vertrag>();
			vertraege0 = jan.getVertraege();
			vertraege1 = oskar.getVertraege();
			vertraege2 = christian.getVertraege();
			
			
			//Ergebnisse
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
			for (int i = 0; i < vertraege2.size(); i++) {
				Vertrag tmp = vertraege2.get(i);
				System.out.println(tmp.getFlaschenProZug());
				System.out.println(tmp.getKostenProZug());
			}
		}
		
		
		
		
		
	}

}
