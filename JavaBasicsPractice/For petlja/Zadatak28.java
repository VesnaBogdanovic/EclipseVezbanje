package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak28 {

	public static void main(String[] args) {
		// Naci sumu u intervalu od a do b deljivih sa 5 i koliko ih ima

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite od kog broja zelite da zapocne interval ");
		int a = s.nextInt();
		System.out.println(" Unesite kojim brojem zelite interval da se zavrsi ");
		int b = s.nextInt();
		int brojac = 0;
		int suma = 0;

		for (int i = a; i <= b; i++) {
			if (i % 5 == 0) {
				suma = suma + i;
				brojac = brojac + 1;
			}
		}
		System.out.println("Suma brojeva u unetom intervalu je : " + suma + " , a ima ih : " + brojac);

	}

}
