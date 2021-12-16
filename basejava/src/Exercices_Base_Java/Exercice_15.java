package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_15 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Saisir un nombre : ");
		String saisie = clavier.next();
		
		int i = saisie.length()	;
		
		System.out.println("Premier chiffre = " + saisie.charAt(0));
		System.out.println("Dernier chiffre = " + saisie.charAt(i - 1));
		
			
		} 

	}
