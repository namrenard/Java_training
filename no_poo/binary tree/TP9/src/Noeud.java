import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Noeud<T extends Comparable<T>> implements BinTree<T> {
	private T root;
	private BinTree<T> left;
	private BinTree<T> right;

// Definition d'un constructeur dont les paramètres sont de type BinTree<T>
	public Noeud(T r, BinTree<T> g, BinTree<T> d) {
		root = r;
		left = g;
		right = d;
	}

	public boolean estVide() {
		return false;
	}

	public T racine() {
		return root;
	}

	public BinTree<T> sad() {
		return right;
	}

	public BinTree<T> sag() {
		return left;
	}

	public int hauteur() {
		int g = left.hauteur();
		int d = right.hauteur();
		int res = (g > d ? g : d);
		return 1 + res;
	}

	public int taille() {
		return 1 + left.taille() + right.hauteur();
	}

// implementation de la methode prefixe() pour un Noeud
	public String prefixe() {
		return "<" + root + "," + left.prefixe() + "," + right.prefixe() + ">";
	}

// implementation de la méthode infixe() pour un Noeud
	public String infixe() {
		return "<" + left.infixe() + "," + root + "," + right.infixe() + ">";
	}

// implementation de la methode postfixe() pour un Noeud
	public String postfixe() {
		return "<" + left.postfixe() + "," + right.postfixe() + "," + root + ">";
	}

// implémentation de manière recusif la méthode prefixe
	public void recursifPrefixe() {
		System.out.println(root);
		if (left != null) {
			left.recursifPrefixe();
		}
		if (right != null) {
			right.recursifPrefixe();
		}
	}

	// implémentation de manière recursif la méthode infixe
	public void recursifInfixe() {
		if (left != null) {
			left.recursifInfixe();
		}
		System.out.println(root);
		if (right != null) {
			right.recursifInfixe();
		}
	}

	// implémentation de manière recursif la méthode postfixe
	public void recursifPostfixe() {
		if (right != null) {
			right.recursifPostfixe();
		}
		if (left != null) {
			left.recursifPostfixe();
		}
		System.out.println(root);
	}

	/* Exo3 : parcours profondeur prefixe iteratif avec pile */
	public void profondeurPrefixe(BinTree o) {
		if (o.estVide()) {
			return;
		}
		Stack pile = new Stack();
		pile.add(o.racine());
		while (!pile.isEmpty()) {
			pile.add(o.sad());
			pile.pop();
			System.out.println(o.racine() + " ");
			if (o.sad() != null) {
				pile.add(o.sad());
			}
			if (o.sag() != null) {
				pile.add(o.sag());
			}
		}
	}

	/* Exo4 parcours largeur iteratif avec file d'attente */
	public void largeur(BinTree o) {
		if (o == null) {
			return;
		}
		Queue file = new LinkedList(); // creation de la file
		file.add(o.racine()); // ajout de l'arbre dedans
		while (!file.isEmpty()) { // parcours de l'arbre
			file.peek();
			file.poll();
			System.out.print(file + "");
			if (o.sad() != null) {
				file.add(o.sad());
			}
			if (o.sag() != null) {
				file.add(o.sag());
			}
		}
		System.out.print("parcours en largeur :" + file.element());

	}

	public boolean Recherche(BinTree A, T e) {
		if (A.estVide()) {
			return false;
		} else {
			A = new Noeud(root, left, right);
			if (root == e) {
				return true;
			} else if (e < A.sag()) {
				return Recherche(left, e);
			} else {
				return Recherche(right, e);
			}
		}
	}

	public static void main(String[] args) {
		BinTree<Integer> a0 = new Feuille<Integer>();
		BinTree<Integer> a2 = new Noeud<Integer>(2, a0, a0);
		BinTree<Integer> a4 = new Noeud<Integer>(4, a0, a0);
		BinTree<Integer> a7 = new Noeud<Integer>(7, a0, a0);
		BinTree<Integer> a01 = new Noeud<Integer>(0, a2, a7);
		BinTree<Integer> a1 = new Noeud<Integer>(1, a01, a4);
		/* exo 1 */
		// Methode recursifprefixe()
		System.out.println("Le parcours récursif en mode prefixe pour l'arbre" + a1 + ".");
		a1.recursifPrefixe();
		// Methode recursifpostfixe()
		System.out.println("Le parcours récursif en mode postfixe pour l'arbre" + a1 + ".");
		a1.recursifPostfixe();
	}

	/* Exo 2 */
	// test valeur dans l'arbre binaire.
	public int chercherValeur(int x, BinTree<Integer> a) {
		while (a != null && x != a.racine()) {
			if (x < a.racine()) {
				chercherValeur(x, a.sag());
			} else {
				chercherValeur(x, a.sad());
			}
		}
		return a.racine();
	}

	// rechercher min et max
	public int minMax(int x, BinTree<Integer> a) {
		if (a != null) {
			if (a.racine() < x) {
				return minMax(x, a.sag());
			} else {
				return minMax(x, a.sad());
			}
		}
		return x;
	}
}