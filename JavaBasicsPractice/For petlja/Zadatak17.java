package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak17 {

	public static void main(String[] args) {

		// proizvod brojeva od 1-n koji nisu deljivi sa a
		
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi broj do kog zelis racunanje ");
		int n = s.nextInt();
		System.out.println(" Unesi vrednost a");
		int a = s.nextInt();
		int proizvod = 1;
		for (int i = 1; i <= n; i++) {
			if (i % a != 0)
				proizvod = proizvod * i;
			System.out.println(i);
		}
	}

}
