package fr.dawan.syntax_de_base;

public class Transtypage {

	public static void main(String[] args) {
		// Transtypage implicite : concerne le passage d'un type inférieur vers un type supérieur
		int i = 42;
		double d = i;
		System.out.println(d);
		
		//Transtypage explicite (cast)
		//Passage d'un type supérieur vers un type inférieur implique de faire un cast
		// Cast : concerne les conversions de type compatibles
		int i1 = 123;
		short s = (short) i1;
		
		double d1 = 44.95;
		int i2 = (int) d1;
				
		//Perte de précision : il faut que le type qui reçoit la valeur ai la capacité de contenir cette valeur
		//

	}

}
