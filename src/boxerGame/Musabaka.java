package boxerGame;

public class Musabaka {
	private Boksor b1;
	private Boksor b2;
	
	public Musabaka(Boksor b1, Boksor b2) {
		this.b1=b1;
		this.b2=b2;
	}
	
	public boolean kiloKontrolu() {
		boolean durum=(b1.getSiklet()-b2.getSiklet())<=10;
		boolean durum2=(b2.getSiklet()-b1.getSiklet())<=10;
		boolean donus=durum&&durum2;
		return donus;
	}
	public void roundBasla() {
		int raund=1;
		
		if(kiloKontrolu()) {
			while(b1.getSaglik()>0&&b2.getSaglik()>0) {
				if(!raundKontrol(raund)) {
					break;
				}
				System.out.println(RenkliYazi.BLUE+"====="+raund+". RAUND====="+RenkliYazi.RESET);
				b1.setSaglik(b2.atak(b1));
				b1.setGuc(b1.getSaglik());
				if(kazanan()) {
					break;
				}
				b2.setSaglik(b1.atak(b2));
				b2.setGuc(b2.getSaglik());
				if(kazanan()) {
					break;
				}
				spiker();
				raund++;
				
				
			}
		}else {
			System.out.println("Kilo farkından dolayı maç iptal");
		}
	}
	
	public boolean raundKontrol(int raund) {
		if(raund==13) {
			if(b1.getSaglik()<b2.getSaglik()) {
				System.out.println(RenkliYazi.GREEN+"Maçın kazananı "+b2.getName()+RenkliYazi.RESET);
			}else if(b1.getSaglik()>b2.getSaglik()) {
				System.out.println(RenkliYazi.GREEN+"Maçın kazananı "+b1.getName()+RenkliYazi.RESET);
			}else {
				System.out.println("Maç berabere bitti ");
			}
			return false;
		}
		return true;
		
		
	}
	
	public boolean kazanan() {
		if(b1.getSaglik()<=0) {
			System.out.println(RenkliYazi.GREEN+"Maçın kazananı "+b2.getName()+RenkliYazi.RESET);
			return true;
		}else if(b1.getSaglik()<=0) {
			System.out.println(RenkliYazi.GREEN+"Maçın kazananı "+b1.getName()+RenkliYazi.RESET);
			return true;
		}
		return false;
	}
	
	public void spiker() {
		System.out.println("------------");
		System.out.println(b1.getName()+RenkliYazi.RED+" Kalan Sağlık: "+b1.getSaglik()+RenkliYazi.RESET);
		System.out.println(b2.getName()+RenkliYazi.RED+" Kalan Sağlık: "+b2.getSaglik()+RenkliYazi.RESET);
	
	}
	

}
