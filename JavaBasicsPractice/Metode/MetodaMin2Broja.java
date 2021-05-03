package metode;

//Napisati metodu koja nalazi minimum od 2 broja
public class MetodaMin2Broja {

	public static void main(String[] args) {
		min(2, 2);
		min(2, 3);
		min(3, 2);

	}

	static double min(double a, double b) {
		double min = 0;
		if (a > b) {
			min = b;
			System.out.println("Minimum je " + min);

		} else if (b > a) {
			System.out.println("Minimum je " + min);
			min = a;
		} else {
			System.out.println("Jednaki su");

		}
		return min;
	}
}
