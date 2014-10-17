package FallstudieBier;


public class Lager {
	private int kapazitaet;
	private int rohstoffe;
	private int bier;
	
	
	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}

	public int getRohstoffe() {
		return rohstoffe;
	}

	public void setRohstoffe(int rohstoffe) {
		this.rohstoffe = rohstoffe;
	}

	public int getBier() {
		return bier;
	}

	public void setBier(int bier) {
		this.bier = bier;
	}


	
	public void Lager(){
		kapazitaet = 2000;
		rohstoffe = 1000;
		bier = 500;
	}
}
