package Exercices_Base_Java;

public class Exercice_3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		
		System.out.println("Avant l'�change : a = " + a + ", b = " + b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("Apr�s l'�change : a = " + a + ", b = " + b);

	}

}
