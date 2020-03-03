package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		
		// Ispis prirodnih brojeva od 1-n
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite do kog broja zelite brojanje");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}		      
	}
}