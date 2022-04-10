package fr.cnam.nfp136;

public class Factoriel {
	/**
	 * Implémentation récursive du calcul de la factorielle.
	 * 
	 * @param n entier naturel
	 * @return n!
	 * @throws Exception en cas de valeur négative
	 */
	public static int factoriel1(int n) throws Exception {
		if (n > 1) {
			return (n * factoriel1(n - 1)); // appel récursif
		} else if ((n == 1) || (n == 0)) {
			return 1;// fin de la récursion
		} else {
			throw (new Exception("Bad parameter value n=" + n + ":n must be positive."));
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			try {
				System.out.println("factoriel1(" + i + ") = " + factoriel1(i));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
