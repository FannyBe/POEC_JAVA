package Conditions;

import java.util.Scanner;

public class BoucleDoWhile {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int  age = 0;

		do {
			System.out.print("Entrez votre âge : ");
			age = clavier.nextInt();
		} while (age <= 0);
		
		System.out.println("Vous avez " + age + " ans");
	}

}
