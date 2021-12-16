package Exercices_Base_Java;

import java.util.Scanner;
import java.util.Random;

public class Exercice_19 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		Random random = new Random();
		int r = random.nextInt(1001);
		
		if (r == 0) {
			r = 1;
		}
		
		int c = 1;
		System.out.print("Entrez un nombre entre 1 et 1000 : ");
		int saisie = clavier.nextInt();
		
		while (saisie != r) {
			if (saisie < r) {
				System.out.println("Votre nombre est trop petit");
				System.out.print("Entrez un nombre entre 1 et 1000 : ");
				saisie = clavier.nextInt();
				c++;
			} else {
				System.out.println("Votre nombre est trop grand");
				System.out.print("Entrez un nombre entre 1 et 1000 : ");
				saisie = clavier.nextInt();
				c++;
			}
		}
		System.out.println("Bravo! Vous avez trouvé en " + c + " essais!");
	//	System.out.println(r);
		

	}

}
