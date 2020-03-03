package vezbanjePetlje;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		// Ispisivanje prirodnih brojeva unazad

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi vrednost n ");
		int n = s.nextInt();
		int i = n;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
	}

}
