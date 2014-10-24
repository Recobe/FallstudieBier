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
					"Kosten senken", 100, 10, 1);
			Skills [2] = Skills[1].addChild("Skill2", "Kosten senken", 200, 20, 2);
			Skills [3] = Skills[2].addChild("Skill3", "Kosten senken", 300, 30, 3);
			Skills [4] = Skills[2].addChild("Skill4", "Kosten senken", 400, 30, 4);
			
		}

		if (Name.equals("Forschung")) {
			Skills[5]  = wurzel.addChild("Kessel verbessern",
					"Kapazität erhöhen", 100, 10, 5);
			Skills[6] = Skills[5].addChild("Skill6", "Kapazität erhöhen", 200, 20, 6);
			Skills[7] = Skills[6].addChild("Skill7", "Kapazität erhöhen", 300, 30, 7);
			Skills[8] = Skills[6].addChild("Skill8", "Kapazität erhöhen", 400, 40, 8);
			
		}
		if (Name.equals("Marketing")) {
			Skills[9] = wurzel.addChild("Plakate",
					"Range erhöhen", 100, 1, 9);
			Skills[10] = Skills[9].addChild("Skill10", "Range erhöhen", 200, 1, 10);
			Skills[11] = Skills[10].addChild("Skill11", "Range erhöhen", 300, 2, 11);
			Skills[12] = Skills[10].addChild("Skill12", "Range erhöhen", 300, 2, 12);
			
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
