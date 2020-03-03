import java.util.Scanner;

public class Zadatak3 {
	public static void main(String[] args) {
		/*
		 * Program trazi da se ispisuju reci, dok se ne unese rec stop, i onda ispise
		 * sve unete reci do tog trenutka
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite rec po zelji ");
		String rec = "";
		String SumaReci = "";
		while (!rec.equals("stop")) {
			rec = s.nextLine();
			rec = rec.toLowerCase();
			System.out.println(" Unesite nove reci ");
			SumaReci = SumaReci + rec + "";
		}
		System.out.println(SumaReci);
	}
}