package Conditions;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
Scanner clavier = new Scanner(System.in);
		
		int jours;
		
		System.out.print("Entrez le numéro du jour : ");
		
		jours = clavier.nextInt();
		
		
/* Avec forêt d'if
		if (jours == 1) {
			System.out.print("Lundi");
			
		} else if (jours == 2) {
			System.out.print("Mardi");
			
		} else if (jours == 3) {
			System.out.print("Mercredi");
			
		} else if (jours == 4) {
			System.out.print("Jeudi");
			
		} else if (jours == 5) {
			System.out.print("Vendredi");
			
		} else if (jours == 6) {
			System.out.print("Samedi");
			
		} else if (jours == 7) {
			System.out.print("Dimanche");
			
		} else{
			System.out.print("Entrée invalide : saisir un nombre entre 1 et 7");
			
		}
		*/
		
	/*	switch(jours) {
		case 1 :
			System.out.println("Lundi");
			break;
		case 2 :
			System.out.println("Mardi");
			break;
		case 3 :
			System.out.println("Mercredi");
			break;
		case 4 :
			System.out.println("Jeudi");
			break;
		case 5 :
			System.out.println("Vendredi");
			break;
		case 6 :
			System.out.println("Samedi");
			break;
		case 7 :
			System.out.println("Samedi");
			break;
		default:
			System.out.println("Entrée invalide : saisir un nombre entre 1 et 7");
		}
*/
		switch(jours) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("Jour de la semaine");
			break;
		case 6 :
		case 7 :
			System.out.println("Week-end");
			break;
		default:
			System.out.println("Entrée invalide : saisir un nombre entre 1 et 7");
	}
	}
}
