package boxerGame;

public class Main {

	public static void main(String[] args) {				
		Boksor b1=new Boksor("Muhammed Ali",  100, 20, 110);
		Boksor b2=new Boksor("Mike Tyson",  100, 20, 115);
		Musabaka m=new Musabaka(b1, b2);
		m.roundBasla();
	}

}
