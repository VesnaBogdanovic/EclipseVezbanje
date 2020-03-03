package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak34 {
	public static void main(String[] args) {
		// Program za ispis trougla, velicine po zelji

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi broj za zeljenu velicinu trougla ");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("x");
			System.out.println();

		}
	}
}