package metode;

//Ispisati tekst abc tutorijali u metodu i pozvati 5 puta metodu ispisa iz main-a
public class Metoda2 {

	public static void main(String[] args) {
		myMethod();

	}

	static void myMethod() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("abc tutorijali");
		}

	}

}
