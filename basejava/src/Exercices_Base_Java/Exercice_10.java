package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_10 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Entrez nombre 1 : ");
		int nb1 = clavier.nextInt();
		System.out.print("Entrez nombre 2 : ");
		int nb2 = clavier.nextInt();
		System.out.print("Entrez nombre 3 : ");
		int nb3 = clavier.nextInt();
		
		if (nb1 >= nb2 && nb1 >= nb3) {
			System.out.print("Le maximum est : " + nb1);
		} else if (nb2 >= nb1 && nb2 >= nb3) {
			
			System.out.print("Le maximum est : " + nb2);
		} else {
			System.out.print("Le maximum est : " + nb3);
		}

	}

}
