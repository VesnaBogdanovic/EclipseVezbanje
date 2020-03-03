package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak27 {

	public static void main(String[] args) {
		// Napisati program da nadje proizvod prirodnih brojeva od a do b djeljivih sa l i koliko ih ima.

		Scanner s = new Scanner(System.in);
		System.out.println("Unesi broj od kog zelis da se krene ");
		int a = s.nextInt();
		System.out.println("Unesi broj kojim zelis da se zavrsi ");
		int b = s.nextInt();
		System.out.println(" Unesi vrednost l ");
		int l = s.nextInt();
		int brojac = 0;
		int pr = 1;

		for (int i = a; i <= b; i++) {
			if (i % l == 0)
				pr = pr * i;
			brojac = brojac + 1;
		}
		System.out.println(" proizvod je : " + pr + " , a ima ih : " + brojac);

	}

}
