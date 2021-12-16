package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_4 {
	
	static Scanner longeur = new Scanner(System.in);
	static Scanner largeur = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Saisir la longeur : ");
		int lo = longeur.nextInt();
		System.out.print("Saisir la largeur : ");
		int la = largeur.nextInt();
		System.out.print("Le périmètre = " + (2 * (lo + la)));

	}

}
