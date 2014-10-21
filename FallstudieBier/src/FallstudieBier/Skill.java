package FallstudieBier;

public class Skill {

	private String Name = "";
	private double Wert;
	private boolean geskilled = false;
	private int id;
	private Skilltree Skilltree;
	private Skill parent;
	private Skill[] child;
	private String Attribut ="";
	private int Preis;

	public Skill(Skilltree Skilltree, Skill parent, String Name, String Attribut, int Preis, double Wert,
			int id) {
		this.Skilltree = Skilltree;
		this.parent = parent;
		this.Name = Name;
		this.Wert = Wert;
		this.id = id;
		this.Attribut= Attribut;
		this.Preis = Preis;

	}

	public int getPreis() {
		return Preis;
	}

	public String getAttribut() {
		return Attribut;
	}

	public boolean checkSkilled() {
		if (parent == null) {
			return true;
		} else {

			if (parent.getGeskilled()) {
				return true;
			} else {
				return false;
			}
		}

	}

	public Skill addChild(String Name, String Attribut, int Preis, double Wert, int nr) {
		Skill skill = new Skill(Skilltree, this, Name, Attribut, Preis, Wert, nr);
		id += 1;
		return skill;

	}

	public int setSkill(boolean skillen, int cash) {
		if (checkSkilled() == true) {
			if (skillen == true) {
				if (cash >= Preis) {
					geskilled = true;
					return Preis;
				}
				else{
					return -1; //Nicht genug Cash
				}
			}
		}
		return -2; //Parent nicht geskilled
		
	}

	public boolean isGeskilled() {
		return geskilled;
	}

	public boolean getGeskilled() {
		return geskilled;
	}

	public void setGeskilled(boolean geskilled) {
		this.geskilled = geskilled;
	}

	public String getName() {
		return Name;
	}

	public double getWert() {
		return Wert;
	}

}
