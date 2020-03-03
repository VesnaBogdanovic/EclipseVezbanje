package Zadatak_1_0204;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {

		// Program racuna sumu parnih brojeva i proizvod neparnih brojeva od 0-n

		int i, n;
		int suma = 0, proizvod = 1;
		Scanner s = new Scanner(System.in);
		System.out.print(" Unesite broj za racunanje sume i proizvoda ");
		n = s.nextInt();

		for (i = 0; i <= n; i++) {
			if (i % 2 == 0)
				suma = suma + i;

			else
				proizvod = proizvod * i;
		}
		System.out.println(" Suma parnih brojeva je: " + suma);
		System.out.println(" Proizvod neparnih brojeva je: " + proizvod);
	}
}