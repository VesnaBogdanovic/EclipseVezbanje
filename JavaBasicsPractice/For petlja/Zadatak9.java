package vezbanjeForrPetlje;

public class Zadatak9 {

	public static void main(String[] args) {
		
		// suma neparnih prirodnih brojeva 1-5

		int suma = 0;

		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0)
				suma = suma + i;
		}

		System.out.println("suma je : " + suma);

	}

}
