package fr.cnam.nfp136;

public class ListePleine<T extends Comparable<T>> implements ListLips<T> {

	private T element;
	private ListLips<T> next;

	// constructeur de liste non vide
	public ListePleine(T e1, ListLips<T> s1) {
		element = e1;
		next = s1;
	}

	public ListLips<T> cons(T e) {
		return new ListePleine<T>(e, this);
	}

	public T head() {
		return element;
	}

	public ListLips<T> tail() {
		return next;
	}

	public boolean estVide() {
		return false;
	}

	public int longueur() {
		return 1 + next.longueur();
	}

	public boolean member(T x) {
		if (x.compareTo(element) == 0) {
			return true;
		} else {
			return next.member(x);
		}
	}

	public int compareTo(T o) {
		//
		return 0;
	}
}
