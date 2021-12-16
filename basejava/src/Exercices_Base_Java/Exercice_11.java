package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_11 {

	public static void main(String[] args) {
		
		Scanner claviernb = new Scanner(System.in);
		Scanner clavierch = new Scanner(System.in);
		
		System.out.print("Entrez nombre 1 : ");
		int nb1 = claviernb.nextInt();
		System.out.print("Entrez opérateur : ");
		String oper = clavierch.next();
		System.out.print("Entrez nombre 2 : ");
		int nb2 = claviernb.nextInt();
		
	//	System.out.print(nb1 + " " + oper + " " + nb2);
	
		char o = oper.charAt(0);
		
		switch(o) {
		case '+' : 
			System.out.println(nb1 + nb2);
			break;
		case '*' : 
			System.out.println(nb1 * nb2);
			break;
		case '/' : 
			System.out.println(nb1 / nb2);
			break;
		case '-' : 
			System.out.println(nb1 - nb2);
			break;
		}
	}

}
