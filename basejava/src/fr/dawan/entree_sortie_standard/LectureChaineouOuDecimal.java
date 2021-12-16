package fr.dawan.entree_sortie_standard;

import java.util.Scanner;

public class LectureChaineouOuDecimal {

	static Scanner clavierDouble = new Scanner(System.in);
	static Scanner clavierChaine = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double var1 = 0.0;
		String chaine = "";
		
		System.out.print("Entrez un nombre réel : ");
		var1 = clavierDouble.nextDouble();
		System.out.print("Entrez un nom : ");
		chaine = clavierChaine.nextLine();
		
		System.out.println(var1 + " " + chaine);
	}

}
