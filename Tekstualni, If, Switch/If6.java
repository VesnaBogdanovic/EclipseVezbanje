package Predavanja;

import java.util.Scanner;

public class If6 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ucitava 1 broj.Ispisati da li je paran ili ne Da li je
		 * broj deljiv istovremeno sa 2 i 7 Da li je deljiv i sa 2 i sa 7, samo sa 2 ili
		 * samo sa 7
		 */
		System.out.println("Uneti broj");
		Scanner sc = new Scanner(System.in);

		int x;
		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("Broj je paran");
		} else {
			System.out.println("Broj je neparan");
		}

		if (x % 2 == 0 && x % 7 == 0) {
			System.out.println("Broj je deljiv sa 2 i 7");
		}
		if (x % 7 == 0) {
			System.out.println("Broj je deljiv sa  7");
		}
	}
}
