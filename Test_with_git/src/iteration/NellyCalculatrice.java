package iteration;

import java.util.Scanner;

public class NellyCalculatrice {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultat = 0;
		int n=0;
		int parametre1 = 0;
		int parametre2 = 0;
		String choix = "";
		do {
		System.out.println("************************************");
		System.out.println("Nelly Calculatrice");
		System.out.println("************************************");
		System.out.println("1-addition");
		System.out.println("2-soustration");
		System.out.println("3-multplication");
		System.out.println("4-division");
		System.out.println("reste de la division");
		System.out.println("************************************");
		
		n = 0;
		while(n < 1 || n > 5) {
			System.out.println("fait un choix entre 1-5");
			n = sc.nextInt();
			}
		System.out.println("entrer le parametre1");
		parametre1 = sc.nextInt();
		System.out.println("entrer le parametre2");
		parametre2 = sc.nextInt();
		
		//System.out.println("resultat: ");
		//if(n == 1) {
		switch(n) {
		case 1 : 
			// resultat:
			// 23
			// 10 + 13 = 23
			//System.out.println(resultat = parametre1 + parametre2 );
			resultat = parametre1 + parametre2;
			System.out.println( parametre1+ "+" +parametre2+ "=" +resultat);
			break;
			
		case 2 : 
			resultat = parametre1 - parametre2;
			System.out.println(parametre1+ "-" +parametre2+ "=" +resultat);
			break;
		case 3: 
			resultat = parametre1 * parametre2;
			System.out.println(parametre1+ "*" +parametre2+ "=" +resultat);
			break;
		case 4 : 
			if( parametre2==0){
			System.out.println("division impossible");
			}else { 
				resultat = parametre1 / parametre2;
				System.out.println(parametre1+ "/" +parametre2+ "=" +resultat);
			}
			break;
		case 5:
			resultat = parametre1 % parametre2;
			System.out.println(parametre1+ "%" +parametre2+ "=" +resultat);
			break;		
		}	
		System.out.println("veux tu continuer: J/N ");
		Scanner ne = new Scanner(System.in);
		choix = ne.nextLine();
		}while( choix.equalsIgnoreCase("J"));
		
		

	
		
	}

}
