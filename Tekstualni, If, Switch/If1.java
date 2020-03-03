package vezbanja;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		
		//Program govori da li je uneseni broj pozitivan,negativan ili nula

		Scanner s = new Scanner(System.in);
		System.out.println( " Unesite jedan broj ");
		float broj = s.nextFloat();
		if (broj == 0) {
			System.out.println(" Broj koji ste uneli ima vrenost nula ");
		} else if (broj > 0) {
			System.out.println(" Broj je pozitivan ");
		} else {
			System.out.println(" Broj je negativan ");
		}

	}

}
