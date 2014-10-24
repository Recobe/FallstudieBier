package FallstudieBier;

public class Skilltree {
	// public Skill wurzel;
	public String Name = "";
	private Skill[] Skills = new Skill[12];

	public Skilltree(String Name) {
		this.Name = Name;
		Skill wurzel = new Skill(this, null, "Wurzelknoten", "", 0, 100, 0);
		wurzel.setSkill(true, 0);

		if (Name.equals("Herstellung")) {
			Skills [1] = wurzel.addChild("besserer Prozess",
					"Kosten senken", 200, 10, 1);
			// weitere Skills hinzufügen; Müssen wir bereden wie die konkret
			// heißen
		}

		if (Name.equals("Forschung")) {
			Skills[5]  = wurzel.addChild("Kessel verbessern",
					"Kapazität erhöhen", 100, 500, 5);
		}
		if (Name.equals("Marketing")) {
			Skill cSkill1 = wurzel.addChild("Plakate",
					"Range erhöhen", 1, 10, 9);
			Skill cSkill2 = cSkill1.addChild("Beispiel", "Beispiel", 100, 100, 10);
		}
		

	}

	public void setSkill(int id, float Kontostand, Spieler spieler) {
		
		int prüf = Skills[id].setSkill(true, (int) Kontostand);
		if (prüf == -1) {
			System.out.println("Nicht genug Cash"); // Ausgabe an GUI
		} else if (prüf == -2) {
			System.out.println("Parent nicht geskilled"); // Ausgabe an GUI
		} else {

			spieler.setKontostand(spieler.getKontostand() - prüf);
			switch (Skills[id].getAttribut()) {
			case "Kapazität erhöhen":
				spieler.skillenKapa((int)Skills[id].getWert());
				break;
			case "Range erhöhen":
				spieler.skillenRange((int)Skills[id].getWert());
				break;
			case "Kosten senken":
				spieler.skillKosten((int)Skills[id].getWert());
				break;
			}
			
			

		}

	}

}
