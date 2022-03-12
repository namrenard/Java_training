package application_bancaire;

public abstract class Compte {
	
	static int nombreDeCompteAyantEteOuverts = 0;
	private float solde;
	private int numero;
	
	public int getNombreDeCompteAyantEteOuvert() {
		return nombreDeCompteAyantEteOuverts;
	}
	public Compte() {
		nombreDeCompteAyantEteOuverts++;
		this.solde=0.0f;
		this.numero=nombreDeCompteAyantEteOuverts;
	}
	
	public float getSolde() {
		return solde;
	}
	public int getNumero() {
		return numero;
	}
	public float crediter(float somme) {
		solde = solde + somme; 
		return solde;
	}
	public float retirer(float somme) {
		solde = solde - somme;
		return solde;
	}
	
	
}
