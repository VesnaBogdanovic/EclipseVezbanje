package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		System.out.println("Unesite do kog broja zelite brojanje");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 3; i <= n; i++) {
			System.out.println(i);
		}
	}
}
