package iteration;

import java.util.Scanner;

public class Table_multiplication {

	public static void main(String[] args) {
		int resultat = 0;
		int n ;
		//on recupere n
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1 ; i<=100000 ; i++) {
			resultat = n * i;
			System.out.println(n+" * "+i+" = "+resultat);
		}

	}

}
