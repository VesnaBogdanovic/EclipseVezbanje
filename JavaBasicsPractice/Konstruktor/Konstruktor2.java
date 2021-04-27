package konstruktor;

/*Ispisati tekst www.znanje.org - Obrazovni sajt u jednom redu a u slijedecem abc tutorijali - 
Prirucnici za pocetnike. Ispis izvrsiti u konstruktoru.*/
public class Konstruktor2 {
	Konstruktor2() {
		System.out.println("www.znanje.org-Obrazovni sajt");
		System.out.println("abc tutorijali");
	}

	public static void main(String[] args) {
		Konstruktor2 obj = new Konstruktor2();
	}

}
