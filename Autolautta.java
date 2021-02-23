package tehtava2_1;

public class Autolautta extends Laiva {
	
	final int kapasiteetti;
	int matkustajamaara;
	int ajoneuvomaara;
	
	/*
	 * @param kapasiteetti Autolautan henkilökapasiteetti
	 */
	public Autolautta(String nimi, double pituus, double syvays, double nopeus, int kapasiteetti) {
		super(nimi, pituus, syvays, nopeus);
		this.kapasiteetti = kapasiteetti;
	}
	
	public double getKapasiteetti() {
		return kapasiteetti;
	}
	
	/*
	 * @param matkustajamaara Henkilömatkustaja, vie kapasiteettia 1
	 * @param ajoneuvomaara Automatkustaja, vie kapasiteettia 10
	 */
	public void setMatkustajat(int matkustajamaara, int ajoneuvomaara) {
		if (matkustajamaara + (10 * ajoneuvomaara) > kapasiteetti) {
			System.out.println(nimi + ": Liikaa matkustajia, jätä joku rannalle!");
		} else {
			this.matkustajamaara = matkustajamaara;
			this.ajoneuvomaara = ajoneuvomaara;
			System.out.println(nimi + ": Kaikki matkustajat kyydissä.");
		}
	}
}
