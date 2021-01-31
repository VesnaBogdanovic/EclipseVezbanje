package vezbanja;

public class Zadatak3 {

	public static void main(String[] args) {
		// Prigram ispisuje koliko ima brojeva deljivih sa 3, od 9-250

		int i;
		i = 9;

		System.out.println(" Brojeva deljivih sa 3 0d 9-250 ima : ");
		while (i <= 250) {
			if (i % 3 == 0)
				System.out.println(i);
			i++;
		}

	}

}
