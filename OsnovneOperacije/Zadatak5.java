package vezbanja;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

//Ucitavam 2 broja, racunam im razliku,proizvod i sumu

		System.out.println("Unesite 2 broja po zelji");
		Scanner s = new Scanner(System.in);

		int broj1 = s.nextInt();
		int broj2 = s.nextInt();

		int razlika = broj1 - broj2;
		int suma = broj1 + broj2;
		int proizvod = broj1 * broj2;
		System.out.println("Suma 2 unesena broja je : " + suma);
		System.out.println(" Razlika 2 unesena broja je : " + razlika);
		System.out.println(" Proizvod 2 broja je : " + proizvod);

	}

}
