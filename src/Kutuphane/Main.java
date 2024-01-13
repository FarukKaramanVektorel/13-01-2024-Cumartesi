package Kutuphane;

public class Main {

	public static void main(String[] args) {
		NoteBook defter1 = new NoteBook(80, "Hatıra Defteri");
		NoteBook defter2 = new NoteBook(150, "Yazılım notları Defteri");

		Book b1 = new Book("Hacı Murat", 80, "Tolstoy", "Destek", "TO-4568-785-9542");
		Book b2 = new Book("Java", 80, "Tolstoy", "Destek", "TO-4568-785-9543");
		Book b3 = new Book("Python", 80, "Tolstoy", "Destek", "TO-4568-785-9544");
		Book b4 = new Book("C#", 80, "Tolstoy", "Destek", "TO-4568-785-9545");

		Materyal[] m = { defter1, defter2, b1, b2, b3, b4 };
		Reader r = new Reader("Abdullah Kaya");
System.out.println(Materyal.getAdet());
System.out.println(Book.getAdet());
System.out.println(NoteBook.getAdet());
		for (Materyal materyal : m) {
			r.read(materyal);
			r.write(materyal);

		}

	}

}
