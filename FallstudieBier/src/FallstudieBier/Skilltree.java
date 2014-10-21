package FallstudieBier;

public class Skilltree {
	// public Skill wurzel;
	public String Name = "";

	public Skilltree(String Name) {
		this.Name = Name;
		Skill wurzel = new Skill(this, null, "Wurzelknoten", "", 0, 100, 0);
		wurzel.setSkill(true, 0);

		if (Name.equals("Herstellung")) {
			Skill skill1 = wurzel.addChild("besserer Prozess",
					"Profit erhöhen", 200, 10, 2);
			// weitere Skills hinzufügen; Müssen wir bereden wie die konkret
			// heißen
		}

		if (Name.equals("Forschung")) {
			Skill skill1 = wurzel.addChild("Kessel verbessern",
					"Kapazität erhöhen", 100, 500, 1);
		}
		if (Name.equals("Marketing")) {
			Skill skill1 = wurzel.addChild("besserer Geschmack",
					"Profit erhöhen", 200, 10, 2);
		}

	}

	private void setSkill(Skill skill, float Kontostand, Spieler spieler) {
		int prüf = skill.setSkill(true, (int) Kontostand);
		if (prüf == -1) {
			System.out.println("Nicht genug Cash"); // Ausgabe an GUI
		} else if (prüf == -2) {
			System.out.println("Parent nicht geskilled"); // Ausgabe an GUI
		} else {

			spieler.setKontostand(spieler.getKontostand() - prüf);
			switch (skill.getAttribut()) {
			case "incKap":
				//Kapazität erhöhen
				break;
			case "kapKo":
				//Kapazität und Kosten erhöhen
				break;
			case "incRange":
				//Range erhöhen
				break;
			case "incFKap":
				//Kapazität erhöhen
				break;
			case "decCost":
				//Kosten senken
				break;
			
			}

		}

	}

}
