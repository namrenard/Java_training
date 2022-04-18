package fr.cnam.nfp136;

public class Factoriel2 {
	/**
	 * Implémentation itérative du calcul de la factorielle. @ param n entier
	 * naturel
	 * 
	 * @return n!
	 * @throws Exception en cas de valeur négative
	 */
	public static int factoriel2(int n) throws Exception {
		if (n >= 0) {
			int resultat = 1;
			for (int i = 2; i <= n; i++) { // itération
				resultat *= i;
			}
			return (resultat);
		} else {
			throw (new Exception("Bad parameter value n=" + n + ":n must be positive."));
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println("factoriel2(" + i + ") = " + factoriel2(i));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
