package tehtava2_1;

public class Rahtilaiva extends Laiva {
	
	double kapasiteetti;
	double rahti;
	
	/*
	 * @param kapasiteetti Rahtilaivan kapasiteetti kontteina
	 */
	public Rahtilaiva(String nimi, double pituus, double syvays, double nopeus, double kapasiteetti) {
		super(nimi, pituus, syvays, nopeus);
		this.kapasiteetti = kapasiteetti;
	}
	
	public double getKapasiteetti() {
		return kapasiteetti;
	}
	
	public double getRahti() {
		return rahti;
	}
	
	// Asetetaan uusi rahti laivaan. Laivan tyhjentämiseksi asetettava rahdiksi 0.
	public void setRahti(double rahti) {
		if (rahti > kapasiteetti) {
			System.out.println(nimi + ": Rahti on liian suuri!");
		} else {
			this.rahti = rahti;
			System.out.println(nimi + ": Rahti lastattu.");
			
			// Nopeus muutetaan rahdinvaihdon yhteydessä
			double prosentti = rahti / kapasiteetti;
			setNopeus(getNopeus() - (prosentti * getNopeus()));
			
		}
	}
}
