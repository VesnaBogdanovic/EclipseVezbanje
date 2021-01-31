package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak16 {

	public static void main(String[] args) {

		// Suma brojeva od a-b koji su deljivi sa 5
		
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite od kog broja zelite poceti ");
		int a = s.nextInt();
		System.out.println(" Unesite sa kojim brojem zelite zavrsiti ");
		int b = s.nextInt();
		int suma = 1;
		for (int i = a; i <= b; i++) {
			if (i % 5 == 0)
				suma = suma + i;
		}
		System.out.println(" Suma brojeva je : " + suma);

	}

}
