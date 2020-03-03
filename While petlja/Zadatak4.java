package vezbanja;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

//pitam korisnika koliko brojeva zeli da sabiram i onda racunam zbir tih brojeva

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite koliko brojeva zelite sabrati");
		int n = s.nextInt();
		if (n > 0) {
			int br;
			int suma = 0;
			int i = 1;
			while (i < n) {

				System.out.println(" Unesite " + (i + 1) + " broj ");
				br = s.nextInt();
				i++;

				suma = suma + br;
			}
			System.out.println(" Suma unetih brojeva je : " + suma);
		} else {
			System.out.println(" Uneli ste negativan broj ");
		}
	}
}