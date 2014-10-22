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
					"Profit erh�hen", 200, 10, 2);
			// weitere Skills hinzuf�gen; M�ssen wir bereden wie die konkret
			// hei�en
		}

		if (Name.equals("Forschung")) {
			Skill skill1 = wurzel.addChild("Kessel verbessern",
					"Kapazit�t erh�hen", 100, 500, 1);
		}
		if (Name.equals("Marketing")) {
			Skill skill1 = wurzel.addChild("besserer Geschmack",
					"Profit erh�hen", 200, 10, 2);
		}

	}

	private void setSkill(Skill skill, float Kontostand, Spieler spieler) {
		int pr�f = skill.setSkill(true, (int) Kontostand);
		if (pr�f == -1) {
			System.out.println("Nicht genug Cash"); // Ausgabe an GUI
		} else if (pr�f == -2) {
			System.out.println("Parent nicht geskilled"); // Ausgabe an GUI
		} else {

			spieler.setKontostand(spieler.getKontostand() - pr�f);
			switch (skill.getAttribut()) {
			case "incKap":
				//Kapazit�t erh�hen
				break;
			case "kapKo":
				//Kapazit�t und Kosten erh�hen
				break;
			case "incRange":
				//Range erh�hen
				break;
			case "incFKap":
				//Kapazit�t erh�hen
				break;
			case "decCost":
				//Kosten senken
				break;
			
			}

		}

	}

}
