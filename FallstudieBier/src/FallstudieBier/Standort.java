package FallstudieBier;

public class Standort {
	
	protected int pox_x;
	protected int pos_y;
	protected String name;
	protected Spieler besitzer;
	protected Spieler[] spieler;
	
		public Standort(int pox_x, int pox_y, String name){
			this.pos_y = pos_y;
			this.pox_x = pox_x;
			this.name = name;

		
		}

		public int getPox_x() {
			return pox_x;
		}

		public void setPox_x(int pox_x) {
			this.pox_x = pox_x;
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
		
}
