package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_5 {

	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Saisir un nombre : ");
		int nb = clavier.nextInt();
		double square = Math.sqrt(nb);
		System.out.println("La racine carrée de " + nb + " = " + (int) square);
	}

}
