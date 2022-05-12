
public class Feuille<T> implements BinTree<T> {

	public boolean estVide() {
		return true;
	}

	public T racine() {
		throw new IllegalArgumentException("C'est une feuille");
	}

	public BinTree<T> sad() {
		throw new IllegalArgumentException("C'est une feuille");
	}

	public BinTree<T> sag() {
		throw new IllegalArgumentException("C'est une feuille");
	}

	public int hauteur() {
		return 0;
	}

	public int taille() {
		return 0;
	}

	// implémentation de la méthode préfixe() pour une Feuille
	public String prefixe() {
		return "<>";
	}

	// implementation de la methode infixe() pour une Feuille
	public String infixe() {
		return "<>";
	}

	// implementation de la méthode postfixe() pour une Feuille
	public String postfixe() {
		return "<>";
	}

	public void recursifPrefixe() {
	}

	public void recursifInfixe() {
	}

	public void recursifPostfixe() {
	}

}
