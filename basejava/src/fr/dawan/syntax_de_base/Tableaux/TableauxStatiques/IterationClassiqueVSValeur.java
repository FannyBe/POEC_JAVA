package fr.dawan.syntax_de_base.Tableaux.TableauxStatiques;

public class IterationClassiqueVSValeur {

	public static void main(String[] args) {
		
		int[] tab = {100, 200, 300, 10};
		int[] tab1 = {100, 200, 300, 10};
		
		System.out.println("It�ration classique");
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}	
		// on ne peux pas modifier les valeurs avec le for each, uniquement lire
		System.out.println("It�ration sur un ensemble de valeur");
		for(int element: tab1) {
			System.out.println(element);
		}
	}

}
