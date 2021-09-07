package array;

import java.util.Scanner;

public class Compzter {

	public static void main(String[] args) {
		
		//Arraylist
		//tabelle vierge mais avec definition de la taille
		Integer[] tabelle_of_int = new Integer[5];
		//tabelle vierge sans definition de la taille
		Integer[] int_array;
		//tablle avec initialisation des parametres
		Integer[] tabelle = {2,3,4,5};
		
		//tabelle bidementionelle avec definition de la taille
		Integer[][] bidimentionel = new Integer[5][4];
		Integer[][][] bidimentionel_vierge;
		Integer[][] bidemention_initialisation = { {4, 5, 5,7},
												   {4, 8, 7, 2},
												   {11, 5, 8, 9}  
												   };
		
		
		//affichage taille dtable mono
		System.out.println("taille du tableau : "+ tabelle.length);
		//Afichage des element du mono
		System.out.println("element a l'indice 0 : "+tabelle[0]);
		//affectation monodimensionel
		tabelle[2] = 9;
		//parcourir tous les elemnt du mono a l'aide d'une boucle
		for (int index = 0 ; index <= tabelle.length - 1 ; index++) {
			System.out.println("element a l'indice "+index+ " : "+tabelle[index]);
		}
		
		//affectation matrice bidirectionelle
		bidimentionel[0][3] = 6;
		bidimentionel[2][2] = 7;
		
		//afficher la taille
		System.out.println("nombre de ligne tableau bi : "+ bidemention_initialisation.length);
		System.out.println("nombre de colonne tableau bi : "+ bidemention_initialisation[0].length);
		
		//afficher les elements d'unn tableau
		System.out.println("element a ligne 1 colone 2: "+bidemention_initialisation[1][2]);
		
		//parcourir tous les elemnt du bi a l'aide d'une boucle
		for (int nrLigne = 0 ; nrLigne < bidemention_initialisation.length; nrLigne++) {
			for(int nrColone = 0; nrColone < bidemention_initialisation[0].length; nrColone++) {
				System.out.print(bidemention_initialisation[nrLigne][nrColone]+"\t");
			}
			System.out.println();
		}
		
		// decouverte de la boucle foreach avec le monodimentionel
		
		int index = 0;
		for(int a:tabelle) {
			System.out.println("element a l'indice "+index+"  : "+ a);
			index++;
		}
		
		//foreach avec du bidimentionel
		 for(Integer[] a :bidemention_initialisation) {
			 for(int b :a) {
				 System.out.print(b+"\t");
			 }
			 System.out.println();
		 }
		
		

	}

}
