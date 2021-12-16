package Exercices_Base_Java;

import java.util.Scanner;

public class Exercice_8_1 {

	static Scanner cote = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Saisir le côté d'un triangle : ");
		int c = cote.nextInt();
		double s = (Math.sqrt(3)/4 * c*c);
		
		System.out.print("La surface du triangle = " + s);
	}

}
