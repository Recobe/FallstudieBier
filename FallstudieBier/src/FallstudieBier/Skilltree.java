package FallstudieBier;

public class Skilltree {
	// public Skill wurzel;
	public String Name = "";
	private Skill[] Skills = new Skill[13];

	public Skilltree(String Name) {
		this.Name = Name;
		Skill wurzel = new Skill(this, null, "Wurzelknoten", "", 0, 100, 0);
		wurzel.setSkill(true, 0);

		if (Name.equals("Herstellung")) {
			Skills [1] = wurzel.addChild("besserer Prozess",
					"Kosten senken", 4000, 10, 1);
			Skills [2] = Skills[1].addChild("Skill2", "Kosten senken", 8000, 20, 2);
			Skills [3] = Skills[2].addChild("Skill3", "Kosten senken", 12000, 30, 3);
			Skills [4] = Skills[2].addChild("Skill4", "Kosten senken", 12000, 30, 4);
			
		}

		if (Name.equals("Forschung")) {
			Skills[5]  = wurzel.addChild("Kessel verbessern",
					"Kapazit�t erh�hen", 4000, 50, 5);
			Skills[6] = Skills[5].addChild("Skill6", "Kapazit�t erh�hen", 8000, 150, 6);
			Skills[7] = Skills[6].addChild("Skill7", "Kapazit�t erh�hen", 12000, 500, 7);
			Skills[8] = Skills[6].addChild("Skill8", "Kapazit�t erh�hen", 15000, 1000, 8);
			
		}
		if (Name.equals("Marketing")) {
			Skills[9] = wurzel.addChild("Plakate",
					"Range erh�hen", 4000, 1, 9);
			Skills[10] = Skills[9].addChild("Skill10", "Range erh�hen", 8000, 1, 10);
			Skills[11] = Skills[10].addChild("Skill11", "Range erh�hen", 12000, 2, 11);
			Skills[12] = Skills[10].addChild("Skill12", "Range erh�hen", 12000, 2, 12);
			
		}
		

	}

	public void setSkill(int id, float Kontostand, Spieler spieler) {
		
		int pr�f = Skills[id].setSkill(true, (int) Kontostand);
		if (pr�f == -1) {
			System.out.println("Nicht genug Cash"); // Ausgabe an GUI
		} else if (pr�f == -2) {
			System.out.println("Parent nicht geskilled"); // Ausgabe an GUI
		} else {

			spieler.setKontostand(spieler.getKontostand() - pr�f);
			switch (Skills[id].getAttribut()) {
			case "Kapazit�t erh�hen":
				spieler.skillenKapa((int)Skills[id].getWert());
				break;
			case "Range erh�hen":
				spieler.skillenRange((int)Skills[id].getWert());
				break;
			case "Kosten senken":
				spieler.skillKosten((int)Skills[id].getWert());
				break;
			}
			
			

		}

	}

}
