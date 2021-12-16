package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_21 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		int[] tab = new int[5];
		
		int i = 0;
		
		do {
		System.out.print("Saisir donnée n°" + (i+1) + " : ");
		tab[i] = clavier.nextInt();
		i++;
		} while (i < tab.length);
			
		i = 0;
		while (i < tab.length - 1) {
		System.out.print(tab[i] + " ");
		i++;
		}
		System.out.print(tab[tab.length - 1]);
		
		/*
		System.out.print("Saisir donnée n°1 : ");
		
		tab[0] = clavier.nextInt();
		
		System.out.print("Saisir donnée n°2 : ");
		tab[1] = clavier.nextInt();
		
		System.out.print("Saisir donnée n°3 : ");
		tab[2] = clavier.nextInt();
		
		System.out.print("Saisir donnée n°4 : ");
		tab[3] = clavier.nextInt();
		
		System.out.print("Saisir donnée n°5 : ");
		tab[4] = clavier.nextInt();
		

		System.out.print(tab[0] + " " + tab[1] + " " + tab[2] + " " + tab[3] + " " + tab[4] + " ");
	*/
	}

}
