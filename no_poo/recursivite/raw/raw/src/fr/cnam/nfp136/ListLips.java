package fr.cnam.nfp136;

public interface ListLips<T extends Comparable<T>> {
	ListLips<T> cons(T e);

	T head();

	ListLips<T> tail();

	boolean estVide();

	int longueur();

	boolean member(T x);
}
