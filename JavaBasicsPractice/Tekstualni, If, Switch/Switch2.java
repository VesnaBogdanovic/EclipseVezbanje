package vezbanja;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
	/*Napisati program koji za upisano samoglasnik (veliko slovo)ispisuje redni broj samoglasnika u abecedi, 
	 * prema sledecem : 'a' (1) 'e' (5) 'i'(9) 'o'(15) 'u' (20)
	 */
Scanner s = new Scanner (System.in);
System.out.println(" Unesite 1 od samoglasnika velikim slovom (a,e,i,o,u) ");
String vokali = s.nextLine();
switch (vokali){
	case "A" : System.out.println( 1 );
	break;
	case "E" : System.out.println( 5);
	break;
	case "I" : System.out.println( 9 );
	break;
	case "O" : System.out.println( 15 );
	break;
	case "U" : System.out.println( 20);
	break;
	default : System.out.println( " Greska, niste uneli vokal ");
}
	
	}

}
