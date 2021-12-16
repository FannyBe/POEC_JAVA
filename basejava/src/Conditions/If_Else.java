package Conditions;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int nbr = 0;
		
		System.out.print("Entrez un nombre : ");
		
		nbr = clavier.nextInt();
		
		if (nbr > 0) {
			System.out.println("Le nombre est positif");
		} else if (nbr == 0) {
			System.out.println("Le nombre est égal à zéro");
		} else {
			System.out.println("Le nombre est négatif");
		}
	}

}
