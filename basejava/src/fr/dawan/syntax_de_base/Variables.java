package fr.dawan.syntax_de_base;

/* zone memoire qui va contenir une valeur typée
 * 8 types sur Java :
 *  - entiers : byte(1o), 
 *  - caractère : char(2o)
 *  - boolean
 *  - flottants : float(4o), double(8o)
 * 
 * Types complexes :
 * 	- Objets
 *  - Tableaux
 *  - Strings
 *  - Classes
 */

public class Variables {

	public static void main(String[] args) {
		// Type caractère : char
		char c = 'a';
		
		// Type entier : byte, short, int, long
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
		//on peut forcer une valeur littéral à être interprétée comme un entier long en suffixant la valeur par L ou l
		long l2 = 100L;
				
		//Pour plus de lisibilité, il est également possible de séparer les milliers par _
		long l3 = 1_000_000_000;
		System.out.println("le contenu de l3 : " + l3);
		
		// Types à virgules flottante (décimal) : float, double
		double d = 5;
		System.out.println("le contenu de d : " + d);
		
		// Pour float, il FAUT indiquer F à la fin
		float f = 0.5F;
		System.out.println("le contenu de f : " + f);
		
		// Type booléen
		boolean bool = true;
		
		// Types complexes
		String chaine = "Dawan";
		int[] tab = {200, 300, 400};
	}

}
