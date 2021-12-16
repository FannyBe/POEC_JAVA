package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_12 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Entrez une lettre de l'alphabet : ");
		String s = clavier.next();
		char a = s.charAt(0);
		
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
			System.out.print(a + " est une voyelle");
		} else {
			System.out.print(a + " est une consonne");
		}
			
	}

}
