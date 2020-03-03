package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak29 {

	public static void main(String[] args) {
		// Aritmeticka sredina neparnih brojeva od k do n

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite od kog broja zelite pocetak intervala ");
		int k = s.nextInt();
		System.out.println("Unesite kojim brojem zelite interval da se zavrsi");
		int n = s.nextInt();
		int brojac = 0;
		int suma = 0;
		int as = 0;

		for (int i = k; i <= n; i++) {
			if (i % 2 != 0) {
				brojac = brojac + 1;
				suma = suma + i;
			}
			{
				as = suma / brojac;
			}

		}
		System.out.println(" Aritmeticka sredina je :" + as);

	}

}
