package FallstudieBier;


public class Skilltree {
	private String name;
	
	public Skill wurzel;
	
	
	
	
	public Skilltree(String name){
		wurzel = new Skill(this, null, "Wurzelknoten", "", 0, 100, 0);
		wurzel.setSkill(true, 0);
		this.name = name;
	}
	
}
