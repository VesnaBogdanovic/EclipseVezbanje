package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak35 {

	public static void main(String[] args) {
		// napisati trougao kao sa slike, sa zeljenim brojem redova

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi vrednost n ");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("x ");
			}
			System.out.println();
		}

	}

}
