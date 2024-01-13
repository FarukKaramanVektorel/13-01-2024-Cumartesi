package Kutuphane;

public abstract class Materyal implements IReaded{
	private int sayfaAdedi;
	private static int adet;
	
	public Materyal(int sayfaAdedi) {
		this.sayfaAdedi=sayfaAdedi;
		this.adet++;
	}
	public static int getAdet() {
		return adet;
	}
	public int getSayfaAdedi() {
		return sayfaAdedi;
	}

}
