package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_9 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Entrez une ann�e AAAA : ");
		int a = clavier.nextInt();
		
		int d4, d100, m;
		
		d4 = a % 4;
		d100 = a % 100;
		m = a % 400;
		
		if ((d4 == 0 && d100 != 0) || (m == 0)) {
			System.out.println(a + " est une ann�e bissextile");
		} else
			System.out.println("Ann�e simple");

	}

}
