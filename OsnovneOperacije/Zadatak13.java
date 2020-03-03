package Zadatak_1_0204;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
// Program racuna koliko ima brojeva od k do n ( ukljucujuci i njih )deljivih sa brojem 3

		Scanner s = new Scanner(System.in);
		System.out.println("Program radi ispis prirodnih brojeva deljivih sa 3 od k do n");
		int k, n;
		System.out.print(" Unesite od kog broja zelite da pocnete : ");
		k = s.nextInt();
		System.out.print("Unesite do kog broja zelite da zavrsite : ");
		n = s.nextInt();

		while (k <= n) {
			if (k % 3 == 0) {
				System.out.println(k);
			}

			k = k + 1;
		}

	}
}
