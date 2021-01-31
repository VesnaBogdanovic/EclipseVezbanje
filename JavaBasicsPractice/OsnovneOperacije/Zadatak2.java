package vezbanja;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

//Ucitati 2 cela broja i naci im zbir,razliku proizvod i kolicnik

		System.out.println(" Unesite 2 cela broja ");
		Scanner s = new Scanner(System.in);
		float broj1 = s.nextFloat();
		float broj2 = s.nextFloat();
		float zbir = broj1 + broj2;
		float razlika = broj1 - broj2;
		float proizvod = broj1 * broj2;
		System.out.println(" Zbir 2 uneta broja je: " + zbir);
		System.out.println(" Razlika 2 uneta broja je : " + razlika);
		System.out.println(" Proizvod 2 uneta broja je :" + proizvod);
		float kolicnik;
		if (broj2 != 0) {
			kolicnik = broj1 / broj2;
			System.out.println(" Kolicnik 2 uneta broja je " + kolicnik);
		} else {
			System.out.println("Ne mozete deliti sa nulom");
		}

	}
}
