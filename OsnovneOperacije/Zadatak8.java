package vezbanja;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		/* Ucitati 2 cela broja i naci im zbir,razliku proizvod i kolicnik.Ispisati one
		 rezultate koji su trocifreni */

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite 2 broja ");
		int broj1 = s.nextInt();
		int broj2 = s.nextInt();
		int zbir = broj1 + broj2;
		int razlika = broj1 - broj2;
		int proizvod = broj1 * broj2;
		if (zbir > 99 && zbir < 1000) {
			System.out.println(" Zbir 2 uneta broja je : " + zbir);
		}
		if (razlika > 99 && razlika < 1000) {
			System.out.println(" Razlika 2 uneta broja je : " + razlika);
		}
		if (proizvod > 99 && proizvod < 1000) {
			System.out.println(" Proizvod 2 uneta broja je: " + proizvod);
		}
		if (broj2 != 0) {
			int kolicnik = broj1 / broj2;
			if (kolicnik > 99 && kolicnik < 1000) {
				System.out.println("Kolicnik 2 uneta broja je :" + kolicnik);
			}
		} else {
			System.out.println(" Nije moguce deliti sa nulom ");
		}
	}
}
