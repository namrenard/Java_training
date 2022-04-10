package fr.cnam.nfp136;

import java.util.Scanner;

/**
 * 
 * @author Nicolas Renard
 * @version 1.0
 */

public class Fibonacci {

	/**
	 * Implémentation de la suite de Fibonacci de manière recursive ou itérative.
	 * 
	 * @param n entier naturel
	 * @return n!
	 * @throws Exception avec une valeur négative
	 */

	public static int fibonacciR(int n) throws Exception {
		if (n > 1) {
			return (fibonacciR(n - 1) + fibonacciR(n - 2)); // appel récursif
		} else if (n == 1) {
			return 1;// fin de la récursion
		} else if (n == 0) {
			return 0;
		} else {
			throw (new Exception("Bad parameter value n=" + n + ":n must be positive."));
		}
	}

	public static int fibonacciI(int n) throws Exception {
		int result = 0;
		if (n == 0) {
			return (result);
		} else if (n >= 1) {
			result += 1;
			for (int i = 2; i <= n; i++) { // itération
				result += ();
			}
			return (result);
		} else {
			throw (new Exception("Bad parameter value n=" + n + ":n must be positive."));
		}
	}

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Evaluez la suite de Fibonacci : [1] Récursif ? [2] Itératif ?");
		int user = console.nextInt();

		switch (user) {
		case 1:
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("factoriel1(" + i + ") = " + fibonacciR(i));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			console.close();
			break;
		case 2:
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("factoriel1(" + i + ") = " + fibonacciI(i));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			console.close();
			break;
		default:
			System.err.println("Erreur, Faites un choix : 1 ou 2.");
			console.close();
		}

	}

}
