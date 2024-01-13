package Kutuphane;

public class NoteBook extends Materyal implements IWrited{
	
	
	private String tur;
	private static int adet;
	public NoteBook(int sayfaAdedi,  String tur) {
		super(sayfaAdedi);
		this.adet++;
		this.tur = tur;
	}
	
	public String getTur() {
		return tur;
	}
	public static int getAdet() {
		return adet;
	}
	@Override
	public void read() {
		System.out.println(this.getTur()+" adlı defter okunuyor...");
		
	}
	@Override
	public void write() {
		System.out.println(this.getTur()+" adli deftere yazılıyor.");
		
	}
	
	
	

}
