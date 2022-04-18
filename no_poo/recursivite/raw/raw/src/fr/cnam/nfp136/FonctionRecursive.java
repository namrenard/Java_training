package fr.cnam.nfp136;

import java.util.Scanner;

/**
 * 
 * @author Nicolas Renard
 * @version 1.0
 */

public class FonctionRecursive {

	/**
	 * Implémentation d'une fonction récursive pour retourner la somme des carrés
	 * des n premiers entiers positifs
	 * 
	 * @param n entier naturel positif
	 * @return n!
	 * @throws Exception en cas de valeurs négative
	 */

	public static int som_Prem_Ent(int n) throws Exception {
		while (n >= 2) {
			return ((n * n) + som_Prem_Ent(n - 1));
		}
		if (n == 1 || n == 0) {
			return 1;
		} else {
			throw (new Exception("Bad parameter value n=" + n + ":n must be positive."));
		}
	}

	public static int some_Prem_Ent2(int n) throws Exception {
		if (n >= 0) {
			int resultat = 0;
			for (int i = 1; i <= n; i++) { // itération
				resultat += (i * i);
			}
			return (resultat);
		} else {
			throw (new Exception("Bad parameter value n=" + n + ":n must be positive."));
		}
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println(
				"Choisissez la méthode de la somme des carrées de nombres positifs : [1] Récursif ? [2] Itératif ?");
		int user = console.nextInt();

		switch (user) {
		case 1:
			for (int i = 0; i < 6; i++) {
				try {
					System.out.println("som_Prem_Ent(" + i + ") = " + som_Prem_Ent(i));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			break;
		case 2:
			for (int i = 0; i < 6; i++) {
				try {
					System.out.println("som_Prem_Ent2(" + i + ") = " + some_Prem_Ent2(i));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			break;
		default:
			System.err.println("Erreur, Faites un choix : 1 ou 2.");
			console.close();
			break;

		}
	}

}
