package FallstudieBier;

public class Standort {
	
	protected int pos_x;
	protected int pos_y;
	protected String name;
	protected Spieler besitzer;
	protected Spieler[] spieler = new Spieler[4];
	
		public Standort(int pos_x, int pos_y, String name){
			this.pos_y = pos_y;
			this.pos_x = pos_x;
			this.name = name;

		
		}

		public int getPox_x() {
			return pos_x;
		}

		public void setPox_x(int pox_x) {
			this.pos_x = pox_x;
		}

		public int getPos_y() {
			return pos_y;
		}

		public void setPos_y(int pos_y) {
			this.pos_y = pos_y;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void setSpieler(Spieler[] spieler){
			this.spieler = spieler;
		}
		
}
