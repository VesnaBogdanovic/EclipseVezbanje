package vezbanja;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		// Trazi da se pogodi zamisljena rec, ali se ne zavrsava

	Scanner s = new Scanner ( System.in);
	String rec;
	String love = "pogodili ste rec";
	
	
	do { System.out.println( " Pogodite zamisljenu rec ");
	 rec = s.nextLine();
	switch ( rec.toLowerCase()) {
	case "love" :
		System.out.println(rec + " je zamisljena rec ");
	}
	} while (!rec.equals("kraj"));
	}

} 


