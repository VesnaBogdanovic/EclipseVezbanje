package vezbanja;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
	/* Napisati program za simulaciju rada kalkulatora prema tabeli :
	 *  k (y) ;  '+' (c =a+b;); '-' (c=a-b); '*' (c=a*b); '/' (c=a/b);
	 */
Scanner s = new Scanner (System.in);
System.out.println( " Unesite 2 broja po zelji i zeljenu operaciju ");	
float broj1 = s.nextFloat();
float broj2 = s.nextFloat();
float c;
String operacija = s.nextLine();
switch ( operacija) { 

case "+" : c=broj1+broj2; System.out.println(  broj1 + operacija + broj2 + "=" + c );
break;

case "-" : c= broj1-broj2; System.out.println( broj1+operacija+broj2 + "=" + c );
break;
case "*" : c=broj1*broj2; System.out.println( broj1 + operacija + broj2 + "=" + c);
break;

case "/" :  
	if (broj2 != 0 ) {c = broj1/broj2; System.out.println( broj1 + operacija + broj2 + "=" + c);}
	F
else { System.out.println( " Ne mozete deliti sa nulom ");}
break;

default : System.out.println( " Niste uneli tacnu operaciju ");
break;
}
	}
}	