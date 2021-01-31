package Zadatak_1_0204;

import java.util.Scanner;

public class PetljauPetlji {

	public static void main(String[] args) {
		// Program izbacuje sliku pravougaonika od zvedica, od k do n

		int k;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite pozitivnu vrednost k za zeljenu sirinu pravougaonika");
		k = s.nextInt();
		System.out.println("Unesite pozitivnu vrednost n za zeljenu visinu pravougaonika");
		n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
