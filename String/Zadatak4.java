import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ako je broj deljiv sa 3 ispisati fizz, sa 5 pisem fuzz, 15 pisem fizz i buzz
		 * primer: 1,2,fizz,4,buzz, .... da radi za prvih n brojeva
		 */

		for (int i = 0; i < 16; i++) {
			String str = "";
			if (i % 3 == 0)
				str = str + "Fizz";
			if (i % 5 == 0)
				str = str + "Buzz";
			if (str.isEmpty())
				str = str + i;
			System.out.println(str);
		}
	}
}