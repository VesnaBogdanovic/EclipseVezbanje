package vezbanja;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		// Ispisati 3 broja, naci sumu prva 2, i razliku treceg i prvog

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite 3 broja ");
		int broj1 = s.nextInt();
		int broj2 = s.nextInt();
		int broj3 = s.nextInt();
		int suma = broj1 + broj2;
		int razlika = broj3 - broj1;
		System.out.println(" Suma prva 2 broja je " + suma);
		System.out.println(" Razlika treceg i prvog broja je " + razlika);

	}

}
