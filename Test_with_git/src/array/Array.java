package array;

public class Array {

	public static void main(String[] args) {
		//Arraylist
		
		/*
		 * creation d'un array 
		 */
		
		//tabelle vierge mais avec definition de la taille
		Integer[] tab1 = new Integer[5];
		int[] tab2 = new int[5];
		
		//tablle avec initialisation des parametres
		Integer[] tab3 = {2,8,1,17};		
		
		//tabelle vierge sans definition de la taille
		Integer[] tab4 = tab3;
		
		/*
		 * initialisation de tab 4 
		 */
		tab4 = tab3;;
		
		/*
		 * affectation et recuperation de valeurs
		 * chaque case d'un array est repertorie par un numero. Les numero vont de 0 a la taille
		 * de l'array - 1
		 */
		
		//affectation de valeurs a tab1
		tab1[0] = 17;
		tab1[1] = 1;
		tab1[2] = 45;
		tab1[3] = 56;
		tab1[4] = 74;
		
		tab1[2] = tab1[4];
		tab1[3] = tab3[2];
		
		/*
		 * affichage du contenu de l'Array de facon classique/basique
		 */
		System.out.println(tab1[0]);
		System.out.println(tab1[1]);
		System.out.println(tab1[2]);
		System.out.println(tab1[3]);
		System.out.println(tab1[4]);
 		
		
		
		

	}

}
