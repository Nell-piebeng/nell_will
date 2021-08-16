package matrices;

public class ProduitDeMatriceCarre {
	
	public static void main(String[] args) {
		Integer[][] matrice_carreA = { {5, 3}, //0,0     0,1
					  				   {-1, 4},
					  				   {-1, 4}
									 };
		
		Integer[][] matrice_carreB = { {7, 2, 5}, // 0,0  
					  				   {-1, 2, 4}, // 1,0
					  				   {-1, 4, 11}
									 };
		
		int summe = 0;
		for(int i= 0; i < matrice_carreA.length ; i++) {
			for(int j = 0; j < matrice_carreB[0].length ; j++) {
				summe = 0;
				for(int k= 0; k < matrice_carreB.length ; k++) {
					summe += matrice_carreA[i][k] * matrice_carreB[k][j];
				}
				System.out.print(summe+"\t");
			}
			System.out.println();
		}
		
		/*
		 * i=0
		 * 		j=0
		 * 			k=0, k=1
		 * 		j=1
		 * 			k=0, k=1
		 * i=1
		 * 		j=0
		 * 			k=0, k=1
		 * 		j=1
		 * 			k=0, k=1
		 * 
		 */
	}
}
