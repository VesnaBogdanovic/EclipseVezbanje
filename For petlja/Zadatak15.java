package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {

		// Suma brojeva od k-n koji su deljivi sa a
		
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite broj kojim zelite poceti");
		int k = s.nextInt();
		System.out.println(" Unesite sa kojim brojem zelite da zavrsite ");
		int n = s.nextInt();
		System.out.println(" Unesite vrednost a ");
		int a = s.nextInt();
		int suma = 1;
		for (int i = k; i <= n; i++)
			if (i % a == 0) {
				suma = suma + i;
			}
		System.out.println(" Suma od broja " + k + " do broja " + n + " je : " + suma);

	}

}
