package Conditions;

import java.util.Scanner;

public class BoucleWhile {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int  age = 0;
		
		while(age <= 0) {
			System.out.print("Entrez votre age : ");
			age = clavier.nextInt();
			if (age < 0) {
				System.out.print("La saisie doit être un nombre positif\n");
			}
		}
		System.out.println("Vous avez " + age + " ans");
	}

}
