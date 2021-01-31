package Predavanja;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Korisniku kazem da unese bilo koji broj i onda sabiram cifre tog broja

		System.out.println(" Unesite broj ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int suma = 0;
		if (n < 0)
			n = n * (-1);

		while (n != 0) {
			int br = n % 10;
			suma = suma + br;
			n = n / 10;
			
		}
		System.out.println(" Suma cifara je : " + suma);
	}
}