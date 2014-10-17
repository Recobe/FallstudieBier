package FallstudieBier;

public class Vertrag {

	private int laufzeit;
	private int absatzmenge;
	private float preisMtl;
	private float preisEinml;
	private String sorte;
	
	public Vertrag(int laufzeit, int absatzmenge, float preisMtl, float preisEinml, String sorte){
		this.laufzeit = laufzeit;
		this.absatzmenge = absatzmenge;
		this.preisMtl = preisMtl;
		this.preisEinml = preisEinml;
		this.sorte = sorte;
	}

	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	public int getAbsatzmenge() {
		return absatzmenge;
	}

	public void setAbsatzmenge(int absatzmenge) {
		this.absatzmenge = absatzmenge;
	}

	public float getPreisMtl() {
		return preisMtl;
	}

	public void setPreisMtl(float preisMtl) {
		this.preisMtl = preisMtl;
	}

	public float getPreisEinml() {
		return preisEinml;
	}

	public void setPreisEinml(float preisEinml) {
		this.preisEinml = preisEinml;
	}

	public String getSorte() {
		return sorte;
	}

	public void setSorte(String sorte) {
		this.sorte = sorte;
	}
	
	
}
