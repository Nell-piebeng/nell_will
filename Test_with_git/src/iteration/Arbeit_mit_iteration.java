package iteration;

import java.util.Scanner;

public class Arbeit_mit_iteration {

	public static void main(String[] args) {
		int n = 0;
		/*
		 * for-sckleife:
		 * le nomde de tour est definit des la base
		 */
		for(int i = 0; i < 5; i++ ) {
			System.out.println(i+"ieme tour -----Bonjour Nelly et Blondelle");
		}
		
		/*
		* while et le do/while-schleife
		* boucle a conditions. le nombre de tour est determine par une condition
		*/
		
		while(n > 0) {
			System.out.println("wilfried");
		}
		
		
		do {
			System.out.println("wilfried");
		} while(n > 0);  // ne pas oublir le ; dans ce cas
		
		
		/*
		 * demander une valeur entre 0 et 5. tant que la valeur n'est pas dans cette inztervalle
		 * faut lui redemander
		 */
		
		/*
		 * R
		 * -infini--------0      5------+infini
		 */
		Scanner sc = new Scanner (System.in);
		int nelly = 0;
		do {
			System.out.println("Entrez une valeur entre o et 5");
			nelly = sc.nextInt();
		} while(nelly > 5 || nelly < 0); // || ou , && et
		
		System.out.println("Youpi tu as mis une bonne valeur");
		
		
		
		
		
	}

}
