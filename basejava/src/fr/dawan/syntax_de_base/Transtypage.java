package fr.dawan.syntax_de_base;

public class Transtypage {

	public static void main(String[] args) {
		// Transtypage implicite : concerne le passage d'un type inf�rieur vers un type sup�rieur
		int i = 42;
		double d = i;
		System.out.println(d);
		
		//Transtypage explicite (cast)
		//Passage d'un type sup�rieur vers un type inf�rieur implique de faire un cast
		// Cast : concerne les conversions de type compatibles
		int i1 = 123;
		short s = (short) i1;
		
		double d1 = 44.95;
		int i2 = (int) d1;
				
		//Perte de pr�cision : il faut que le type qui re�oit la valeur ai la capacit� de contenir cette valeur
		//

	}

}
