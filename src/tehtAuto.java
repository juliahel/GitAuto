public class tehtAuto {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto("Toyota", "Corolla", 10);
		
		auto1.merkki = "Volvo";
		auto1.malli = "V70";
		auto1.bensanMaara = 10;
		
		auto1.NaytaTiedot();
		auto1.Kiihdyta();
		auto1.NaytaTiedot();
		auto1.Tankkaa(6);
		auto1.NaytaTiedot();
		
		auto2.NaytaTiedot();
	}

}

class Auto{
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public Auto() {
		merkki="";
		malli="";
		bensanMaara=0;
	}
	
	public Auto(String merkki, String malli, int bensanMaara) {
		this.merkki = merkki;
		this.malli = malli;
		this.bensanMaara = bensanMaara;
	}
	
	public void Jarruta() {
		System.out.println("Auto jarruttaa");
	}
	public void Kiihdyta() {
		if(bensanMaara > 0) {
		System.out.println("Auto kiihtyy");
		bensanMaara = bensanMaara - 1;
		}
		else{
			System.out.println("Bensa lopussa, autoa ei voi kiihdyttää. Tankkaa auto.");
		}
	}
	public void Tankkaa(int x) {
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + x);
		bensanMaara = bensanMaara + x;
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);
	}
	
	public void NaytaTiedot() {
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara);
	}
}