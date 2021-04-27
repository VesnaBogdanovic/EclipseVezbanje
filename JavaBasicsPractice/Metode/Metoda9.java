package metode;

//Kreirati metod koji racuna prizvod dva broja, vraca rezultat u main i udupla i ispisuje
public class Metoda9 {

	public static void main(String[] args) {
		int mnozi = proizvod(2, 4);
		int duplo = 2 * mnozi;
		System.out.println(duplo);

	}

	static int proizvod(int a, int b) {
		return a * b;
	}
}
