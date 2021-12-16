package fr.dawan.syntax_de_base;

public class ConstanteReglesDeNommage {

	public static void main(String[] args) {
		
		// Les constantes doivent être écrites en MAJUSCULE pour les différencier des autres variables
		final int VIES_MAX = 15;
		System.out.println("Nombres de vies max : " + VIES_MAX);
		
		// Les noms de variables peuvent commencer par une lettre
		int val = 15;
		
		// Les noms de variables peuvent commencer par un underscore
		String _val = "underscore";
		
		// Les noms de variables peuvent commencer par un $
		double $val3 = 5.0;
		
		
		
	}

}
