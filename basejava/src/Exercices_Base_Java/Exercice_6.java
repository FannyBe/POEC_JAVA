package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_6 {
	
	static Scanner angle1 = new Scanner(System.in);
	static Scanner angle2 = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Saisir premier angle : ");
		int a1 = angle1.nextInt();
		System.out.print("Saisir deuxi�me angle : ");
		int a2 = angle2.nextInt();
		
		System.out.print("3�me angle = " + (180 - a1 - a2));

	}

}
