package tehtava2_1;

public class Main {

	public static void main(String[] args) {
		
		// Luodaan autolautta ja rahtilaiva
		Autolautta laiva1 = new Autolautta("s/s Viking", 99.05, 3.8, 19.0, 90);
		Rahtilaiva laiva2 = new Rahtilaiva("MSC Oscar", 395.0, 5.5, 22.8, 20000.0);
		
		// Kokeillaan, kauanko matkan kulkeminen kestää laivojen ollessa lastaamattomat 
		System.out.println(laiva1.nimi + ": "+ laiva1.laskeKesto(30));
		System.out.println(laiva2.nimi + ": "+ laiva2.laskeKesto(30));
		
		// Kokeillaan asettaa laivoille ensin liikaa lastia, sitten sopiva määrä
		laiva1.setMatkustajat(83, 16);
		laiva1.setMatkustajat(23, 4);
	
		laiva2.setRahti(76000);
		laiva2.setRahti(16000);
		
		/* Rahtilaivan nopeus muuttuu lastaamisen seurauksena:
		 * jokainen täysi kymmenesosa kapasiteetista laskee laivan nopeutta 10%
		 */
		System.out.println(laiva2.nimi + ": "+ laiva2.laskeKesto(30));
		
	}
	
}
