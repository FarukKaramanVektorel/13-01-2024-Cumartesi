package Kutuphane;

public class Reader {
	private String name;
	
	public Reader(String name) {
		this.name=name;
		
	}
	
	public void read(Materyal mat) {
		mat.read();
	}
	
	public void write(Materyal mat) {
		if(mat instanceof IWrited) {
			((IWrited) mat).write();
		}
		
	}

}
