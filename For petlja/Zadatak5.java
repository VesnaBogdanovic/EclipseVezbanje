package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		

		// Ispisati brojeve od 1-17 koji su deljivi sa a
		Scanner s = new Scanner ( System.in);
		System.out.println( " Unesi vrednost a ");
		int a = s.nextInt();
		int i;
		for (i = 1; i <= 17; i++) {
			if (i % a == 0) {
				System.out.println(i);
			break; }
			
		}
	}
	}


