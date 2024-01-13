package OOPTekrar;

public abstract class Car implements ICar{
	private int yil;
	private String color;
	private String marka;
	private int nonStaticAdet;
	private static int adet;
	
	
	public Car(int yil) {
		adet++;
		nonStaticAdet++;
		this.yil=yil;
		System.out.println("şimdide burası çalıştı");
	}
	public int getNonStaticAdet() {
		return nonStaticAdet;
	}
	public String getColor() {
		return color;
	}public String getMarka() {
		return marka;
	}public int getYil() {
		return yil;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public void setYil(int yil) {
		if(yil<1980) {
			this.yil=1980;
		}else if(yil>2024){
			this.yil=2024;
		}else {
			this.yil = yil;
		}
		
	}
	public static int getAdet() {
		return adet;
	}
	
	
	
	

}
