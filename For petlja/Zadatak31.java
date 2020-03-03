package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak31 {

	public static void main(String[] args) {
		// Aritmeticka sredina parnih brojeva od k-n

		Scanner s = new Scanner(System.in);
		System.out.println("Unesi broj od kog zelis da interval pocne");
		int k = s.nextInt();
		System.out.println(" Unesi broj kojim zelis da se interval zavrsi ");
		int n = s.nextInt();
		int suma = 0;
		int brojac = 0;
		int as = 0;

		for (int i = k; i <= n; i++) {
			if (i % 2 == 0)
				suma = suma + i;
			brojac = brojac + 1;
		}
		as = suma / brojac;
		System.out.println(" Od broja " + k + " do broja " + n + " aritmeticka sredina parnih brojeva je : " + as);
	}
}
