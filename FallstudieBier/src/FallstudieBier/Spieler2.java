package FallstudieBier;

public class Spieler2 {

	public static void main(String[] args) {
		Skilltree baum1 = new Skilltree();
		Skill skill1 = baum1.wurzel.addChild("Kessel verbessern", 500, 1);
		Skill skill2 = skill1.addChild("besserer Geschmack", 10, 2);
		skill1.setSkill(true);
		skill2.setSkill(true);
		System.out.println(skill2.checkSkilled());
		
		System.out.println(" Name:  "+skill1.getName()+"   Wert: "+skill1.getWert());
		System.out.println(" Name:  "+skill2.getName()+"   Wert: "+skill2.getWert());
		
		
		
	}

}
