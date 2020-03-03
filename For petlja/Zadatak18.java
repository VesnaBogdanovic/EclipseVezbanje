package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak18 {

	public static void main(String[] args) {

		// proizvod brojeva 1-n cija je cifra 3
		
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi broj do kog zelis proizvod");
		int n = s.nextInt();
		int proizvod = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 10 == 3)
				proizvod = proizvod * i;
		}
	}

}
