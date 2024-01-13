package OOPTekrar;

public class Sedan extends Car{
	private int bagajHacmi;
	 private final int  MOTOR=45;
	
	public Sedan(int yil, int bagaj) {
		super(yil);
		System.out.println("şimdi de sedan çalıştı");
		this.bagajHacmi=bagaj;
	}
	
	@Override
	public void ilerle() {
		System.out.println("Sedan araç ilerledi");
	
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hizGoster() {
		// TODO Auto-generated method stub
		
	}
	

}
