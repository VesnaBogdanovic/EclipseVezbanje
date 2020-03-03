package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak36 {

	public static void main(String[] args) {
		// Ispis trougla kao sa slike, sa zeljenim brojem redova

		Scanner s = new Scanner(System.in);

		System.out.print("Unesi n ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
