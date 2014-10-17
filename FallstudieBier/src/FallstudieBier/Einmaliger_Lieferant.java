package FallstudieBier;

public class Einmaliger_Lieferant extends Lieferant {

	private int kapazitaet;
	private String[] gebote = {"0,0", "0,0", "0,0", "0,0"};

	public Einmaliger_Lieferant(String name) {
		super(name);		
	}
	
	public void bieten(String spielerName, int gebot) {
		for (int i = 0; i < gebote.length; i++) {
				if (gebote[i].equals("0,0")) {
					gebote[i] = spielerName + "," + gebot;
					break;
				}
			
		}
	}
	
	public boolean auswerten(String spielerName){
		int betrag = 0;
		String gewinner = "";
		
		// Durchgehen der Gebote
		for (int i = 0; i < gebote.length; i++) {
			String[] split = gebote[i].split(",");
			
			// Ermitteln des Höchstbietenden
			if (Integer.parseInt(split[1]) > betrag) {
				betrag = Integer.parseInt(split[1]);
				gewinner = split[0];
			}
		}
		if (spielerName.equals(gewinner)) {
			return true;
		} else {
			return false;
		}
	}
	
	// Getter und Setter
	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
}
