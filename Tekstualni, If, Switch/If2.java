package vezbanja;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		// Program govori dobro jutro,dobar dan ili dobro vece, zavisno od doba dana
		
		Scanner s = new Scanner(System.in);
		System.out.println( " Unesite koliko je sati");
		float cas = s.nextFloat();
		if (cas >= 0 && cas <= 8) {
			System.out.println(" Dobro jutro ");
		} else if (cas >= 9 && cas <= 18) {
			System.out.println(" Dobar dan ");
		} else if (cas >= 19 && cas <= 23) {
			System.out.println(" Dobro vece ");
		} else {
			System.out.println(" Uneli ste pogresnu vrednost ");
		}
	}

}
