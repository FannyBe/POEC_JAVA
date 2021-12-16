package Exercices_Base_Java;

import java.util.Scanner;	

public class Exercice_2 {
	
	static Scanner clavier = new Scanner(System.in);
	//static Scanner clavier2 = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		System.out.print("Entrer le premier nombre : ");
		int nb1 = clavier.nextInt();
		System.out.print("Entrer le deuxième nombre : ");
		int nb2 = clavier.nextInt();
		
		
		System.out.println(nb1 + " x " + nb2 + " = "  + nb1*nb2);
		
	}

}
