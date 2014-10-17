package FallstudieBier;

public class DauerLieferant extends Lieferant {
	
	private static float marktPreis = (float) 0.1;

	public DauerLieferant(String name) {
		super(name);
		
	}
	
	public static float liefern(int menge) {
		float kosten = menge * marktPreis;
		return kosten;
	}
	
	public void pricing(int monat) {
		if (monat == 8 || monat == 9) {
			marktPreis = (float) 0.1;
		} else {
			marktPreis *= 1.05;
		}
	}
	

}
