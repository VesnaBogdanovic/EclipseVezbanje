package metode;

/*Metod povrsina racuna i ispisuje povrsinu pravougaonika
Pozvati 3 puta metod za iz main.*/
public class Metoda7 {

	public static void main(String[] args) {
		System.out.println(povrsina(2, 3));
		System.out.println(povrsina(4, 6));
		System.out.println(povrsina(3, 9));

	}

	public static int povrsina(int a, int b) {
		return a * b;
	}
}
