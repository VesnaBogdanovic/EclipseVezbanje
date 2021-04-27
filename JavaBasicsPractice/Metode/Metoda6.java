package metode;

//Main poziva 3 puta metod ispis sume 2 broja upisana iz main,unosimo razlicite argumente ta 3 puta
public class Metoda6 {

	public static void main(String[] args) {
		System.out.println(suma(2, 4));
		System.out.println(suma(4, 4));
		System.out.println(suma(8, 8));
	}

	public static int suma(int x, int y) {
		return x + y;
	}
}
