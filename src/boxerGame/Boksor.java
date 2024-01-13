package boxerGame;

import java.util.Random;

public class Boksor {
	private String name;
	private int guc;
	private int saglik;
	private int savunma;
	private int siklet;
	public Random rnd = new Random();
	 
	public Boksor(String name, int saglik, int savunma, int siklet) {

		this.name = name;
		this.saglik = saglik;
		this.savunma = savunma;
		this.siklet = siklet;
		this.guc= (int) this.setGuc(saglik);
	}
	
	public int atak(Boksor rakip) {
		System.out.println("----------");
		System.out.println(this.getName() + "  => " + rakip.getName() + " e " + this.getGuc() + " güç ile atak yaptı");
		if (rakip.savunma()) {
			System.out.println(rakip.getName() + " gelen atağı savurdu");
			return rakip.getSaglik();
		}

		if (rakip.getSaglik() - this.getGuc() < 0) {
			return 0;
		}

		return rakip.getSaglik() - this.getGuc();

	}

	public boolean savunma() {
		int rndNumber = rnd.nextInt(99) + 1;
		return rndNumber >= this.savunma;
	}

	public String getName() {
		return name;
	}

	public int getGuc() {
		return guc;
	}

	public double setGuc(int saglik) {
		double guc = saglik * 0.3;
		return this.guc = (int) guc;
	}

	public int getSaglik() {
		return saglik;
	}

	public int getSavunma() {
		return savunma;
	}

	public int getSiklet() {
		return siklet;
	}

	public void setSaglik(int saglik) {
		this.saglik = saglik;
	}

	

}
