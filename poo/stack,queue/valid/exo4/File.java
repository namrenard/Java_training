interface File<T> {
	boolean est_FileVide();
	File<T> enfiler(T e);
	T getPremier();
	File<T> defiler();
}
//Réalisation d'une file avec un tableau de taille fixe
class FileTableau<T> implements File<T> {
	private T[] contenu ; // Tableau d'accueil de la file
	private int maxi ; // Nombre maxi d'éléments du tableau contenu
	private int longueur = 0 ; // Taille de la file
	private int iTete = 0 ; // Indice de tête initialisé à 0
	private int iPlaceQueue = 0; // Indice de la première place libre en queue
	public FileTableau(T[] tab){
		contenu = tab; // Tableau passé au constructeur
		maxi = contenu.length; // Taille maximale de la file
	}
	public boolean est_FileVide()
	{
		return longueur == 0;
	}
	public FileTableau<T> enfiler(T e) {
		if (longueur == maxi) {
		throw new IllegalArgumentException("File Pleine !");
		} else {
		iPlaceQueue = iPlaceQueue % maxi;
		contenu[iPlaceQueue] = e;
		iPlaceQueue++;
		longueur++;
		return this;
		}
	}
	public T getPremier() {
		if (this.est_FileVide()) {
		throw new IllegalArgumentException("File Vide");
		}else {
		return contenu[iTete];
		}
	}
	public File<T> defiler() {
		if (this.est_FileVide()) {
		throw new IllegalArgumentException("File Vide");
		} else {
		iTete++;
		iTete = iTete % maxi;
		longueur--;
		return this ;
		}
	}
}