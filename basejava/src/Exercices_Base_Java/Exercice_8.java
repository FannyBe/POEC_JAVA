package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_8 {

	static Scanner note1 = new Scanner(System.in);
	static Scanner note2 = new Scanner(System.in);
	static Scanner note3 = new Scanner(System.in);
	static Scanner note4 = new Scanner(System.in);
	static Scanner note5 = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Saisir la note de la matière n°1 : ");
		int n1 = note1.nextInt();
		System.out.print("Saisir la note de la matière n°2 : ");
		int n2 = note2.nextInt();
		System.out.print("Saisir la note de la matière n°3 : ");
		int n3 = note3.nextInt();
		System.out.print("Saisir la note de la matière n°4 : ");
		int n4 = note4.nextInt();
		System.out.print("Saisir la note de la matière n°5 : ");
		int n5 = note5.nextInt();
		
		int somme = n1 + n2 + n3 + n4 + n5;
		int moyenne = (n1 + n2 + n3 + n4 + n5)/5;
		double pourcentage = somme / 5;
		
		System.out.println("Total = " + somme + "\nMoyenne = " + moyenne + "\nPourcentage = " + pourcentage + " %");
	}

}
