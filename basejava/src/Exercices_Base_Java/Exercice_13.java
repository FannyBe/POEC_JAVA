package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_13 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Saisir un nombre n : ");
		int n = clavier.nextInt();
		int i = 1;
		
		System.out.print("Les nombres impairs de 1 à " + n + " sont : ");
		while (i <= n) {
	//		for (i = 1; (i % 2) != 0 ; i++) {
	//			System.out.print(i + " ");
			if ((i % 2) != 0) {
				System.out.print(i + " ");
				i++;
			} else {
			i++;
			}
		}
	}
}
