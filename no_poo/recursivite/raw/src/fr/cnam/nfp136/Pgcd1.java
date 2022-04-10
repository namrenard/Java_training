package fr.cnam.nfp136;

public class Pgcd1 {

	/**
	 * Implémentation récursif du calcul du PGCD.
	 * <p>
	 * 
	 * @param n entier naturel
	 * @parma m entier naturel
	 * @return n, m!
	 * @throws Exception en cas de valeur non entier.
	 */

	public static int pgcd(int m, int n) {
		if (m == n) {
			return m; // fin de la recursion
		} else if (m < n) {
			return pgcd(m, n - m); // appel récursif à la méthode pgcd()
		} else {
			return pgcd(n, m - n); // appel récursif à la méthode pgcd()
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			for (int j = 1; j < i; j++) {
				try {
					System.out.println("pgcd1(" + i + ", " + j + ") = " + pgcd(i, j));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		}
	}

}
