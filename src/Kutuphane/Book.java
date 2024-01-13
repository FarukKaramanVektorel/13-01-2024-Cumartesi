package Kutuphane;

public class Book extends Materyal {
	private String kitapAdi;
	private String yazar;
	private String yayinEvi;
	private String isbn;
	private static int adet;

	public Book(String kitapAdi,int sayfaAdedi, String yazar, String yayinEvi,String isbn) {
		super(sayfaAdedi);
		this.kitapAdi=kitapAdi;
		this.isbn=isbn;
		this.yayinEvi=yayinEvi;
		this.yazar=yazar;
		this.adet++;
		
	}

	public String getYazar() {
		return yazar;
	}

	public String getYayinEvi() {
		return yayinEvi;
	}

	public String getIsbn() {
		return isbn;
	}

	public static int getAdet() {
		return adet;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	

	@Override
	public void read() {
		System.out.println(this.getKitapAdi()+" adlı kitap okunuyor...");
		
	}
	

}
