package fr.cnam.nfp136;

public class Personne implements Comparable<Personne> {

	String nom;
	float salaire;

	public Personne(String nom, float salaire) {
		this.nom = nom;
		this.salaire = salaire;
	}

	public int compareTo(Personne person2) {

		return nom.compareTo(person2.nom);
	}

	public static void main(String[] args) {
		ListLips<Personne> personn = new ListeVide<Personne>();
		Personne person1 = new Personne("Marc", 1000);
		Personne person2 = new Personne("Lucienne", 1500);
		personn = personn.cons(person1);
		personn = personn.cons(person2);
		System.out.println("Marc fait-il partie du personnel ? " + personn.member(person1));
		System.out.println("Lucienne fait-elle partie du personnel ? " + personn.member(person2));
		Personne person3 = new Personne("Lorie", 1400);
		System.out.println("Lorie fait-il partie du personnel ? " + personn.member(person3));
	}

}
