package JustTrying;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		// Za unet broj 1-7, program salje poruku za odredjeni dan u nedelji

		System.out.println("Izaberi broj 1-7 da dobijes odredjeni dan u nedelji ");
		Scanner s = new Scanner(System.in);
		int dan = s.nextInt();

		switch (dan) {
		case 1:
			System.out.println("Hate Mondays");
			break;

		case 2:
			System.out.println("Annoy Tuesday");
			break;

		case 3:
			System.out.println("Annoy Wednesday");
			break;

		case 4:
			System.out.println("Smile Thursday");
			break;

		case 5:
			System.out.println("Love Friday");
			break;

		case 6:
			System.out.println("Enjoy Saturday");
			break;

		case 7:
			System.out.println("Damn Sunday");
			break;

		default:
			System.out.println("You havent picked a day correctly");
		}

	}

}
