package OOPTekrar;

public class Main {
	
	public static void main(String[] args) {
		
		Sedan s=new Sedan(1999,55);
		HatcBack h=new HatcBack(0);
		HatcBack h1=new HatcBack(0);
		s.ilerle();
		h.ilerle();
		System.out.println(Car.getAdet());//2
		System.out.println(h.getNonStaticAdet());//
		Driver d=new Driver();
		Bisiklet b=new Bisiklet();
		d.aracSur(b);
		d.aracSur(h1);
		d.aracSur(s);
		
	
	
	
	}

}
