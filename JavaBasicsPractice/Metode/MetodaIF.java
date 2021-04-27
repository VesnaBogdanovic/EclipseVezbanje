package metode;

import java.util.Scanner;

//Za ucitan broj bodova sa tastature (0-5) ispisati uspjeh. Ispis se izvodi u metodi.
public class MetodaIF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj bodova 0-5");
		double a = input.nextDouble();
		uspeh(a);

	}

	static void uspeh(double a) {
		if (a >= 4.5 && a <= 5) {
			System.out.println("Odlican uspeh");
		} else if (a >= 3.5 && a < 4.5) {
			System.out.println("Vrlo dobar uspeh");
		} else if (a >= 2.5 && a < 3.5) {
			System.out.println("Dobar uspeh");
		} else if (a >= 1.5 && a < 2.5) {
			System.out.println("Dovoljan uspeh");
		} else if (a >= 0 && a < 1.5) {
			System.out.println("Nedovoljan uspeh");
		} else {
			System.out.println("Niste uneli broj od 0-5,unesite opet");
		}

	}
}
