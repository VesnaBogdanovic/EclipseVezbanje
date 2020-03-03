package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak19 {

	public static void main(String[] args) {

	// Naci proizvod prirodnih brojeva u intervalu k-n, koji su deljivi sa 2 ,a ne sa 3

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi broj od kog zelis da se pocne");
		int k = s.nextInt();
		System.out.println(" Unesi broj sa kojim zelis da se zavrsi");
		int n = s.nextInt();
		int proizvod = 1;
		for (int i = k; i <= n; i++) {
			if (i % 2 == 0 && i % 3 != 0)
				proizvod = proizvod * i;
		}
		System.out.println(" Proizvod od broja " + k + " do broja " + n + " je : " + proizvod);

	}

}
