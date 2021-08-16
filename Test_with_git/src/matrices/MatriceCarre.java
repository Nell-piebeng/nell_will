package matrices;

public class MatriceCarre {

	public static void main(String[] args) {
		Integer[][] matrice_carre = { {5, 3},
				   					  {-1, 4},
				   					};
		
		double resultat = 0;
		
		resultat = matrice_carre[0][0] * matrice_carre[1][1] - (matrice_carre[1][0] * matrice_carre[0][1]);
		
		System.out.println("Soit la matrice :");
		for(Integer[] a:matrice_carre) {
			for(int b:a) {
				System.out.print(b+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n \nle determinant de la matrice est :"+resultat);
	}
	

}
