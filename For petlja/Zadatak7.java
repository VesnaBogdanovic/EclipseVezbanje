package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
	
//Ispis n brojeva unazad
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite od kog broja zelite brojanje");
		int n = s.nextInt();
		for ( int i=n; i>=1; i-- ) {System.out.println(i);}
	}

}
