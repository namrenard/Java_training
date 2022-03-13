package application_bancaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personne extends Compte{
	
	static int nombreDePersonneAyantExiste = 0;
	private String nom ;
	private String prenom ;
	private List <Compte> list ;
	
	
	public static int getNombreDePersonneAyantExiste() {
		return nombreDePersonneAyantExiste;
	}
	public Personne(String nom, String prenom) {
		nombreDePersonneAyantExiste++;
		this.nom = nom;
		this.prenom = prenom;
		this.list = new ArrayList <Compte>();
	}
	private String getNom() {
		return this.nom;
	}
	private String getPrenom() {
		return this.prenom;
	}
	public Compte ouvrirCompte() {
		Compte newcompte = new Compte();
		this.list.add(newcompte);
		System.out.println("Un nouveau compte a été ouvert pour "+ getNom() +" "+ getPrenom()+" .");
		System.out.println("Le numéro de compte attribué est "+ getNumero()+" .");
		return (newcompte);
	}
	public void fermerCompte(Compte leCompteAfermer) {
		this.list.remove(leCompteAfermer);
		return ;
	}
	public static void main (String [] args) {
		Scanner frappeclient = new Scanner (System.in);
		
		System.out.println("Bonjour, bienvenue sur l'application bancaire.");
		System.out.println("Veuillez indiquer votre nom. Merci");
		String clientN = frappeclient.next();
		System.out.println("Veuillez indiquer votre pr\u00e9nom. Merci");
		String clientP = frappeclient.next();
		Personne newclient = new Personne(clientN, clientP);
		System.out.println("Bonjour "+ clientN +" "+ clientP +" . Que souhaitez-vous faire (Entrez un num\u00e9ro) ?");
		
		//créer une boucle while pour sortir du programme ou y retourner. -> a faire.
		
		System.out.println("[0]Ouvrir un compte ?");
		System.out.println("[1]Fermer un compte ?");
		System.out.println("[2]Consulter le solde d'un compte ?");
		System.out.println("[3]D\u00e9poser de l'argent ?");
		System.out.println("[4]Retirer de l'argent ?");
		System.out.println("Pour annuler et quitter, entrez un num\u00e9ro au hasard.");
		int choix_client = frappeclient.nextInt();
		
		switch(choix_client) {
		case 0 :
			System.out.println("Un nouveau compte va être cr\u00e9\u00e9.");
			// ouverture du compte.
			Compte newcompte = newclient.ouvrirCompte();
			// affiche l'argent à l'ouverture.
			float moneyaccount = newcompte.getSolde();
			System.out.println("Actuellement le compte N° "+ newclient.getNumero() + " d\u00e9tient "+ moneyaccount + " euros.");
			System.out.println("Voulez-vous cr\u00e9diter le compte ? [1] Oui | [2] Non.");
			int add = frappeclient.nextInt();
			if (add == 1) { 
				System.out.println("Merci d'indiquez le montant :");
				String moneyclient = frappeclient.next();
				float addmoney	= Float.parseFloat(moneyclient); // méthode string en float								
				newcompte.crediter(addmoney);
				moneyaccount = newcompte.getSolde();
				System.out.println("Actuellement le compte N° "+ newclient.getNumero() + " d\u00e9tient "+ moneyaccount + " euros.");
				System.out.println("Merci et Au revoir.");
				frappeclient.close();
			}
			else {
				System.out.println("Le compte n'a pas été cr\u00e9dit\u00e9. Merci et au revoir.");
				frappeclient.close();
				}
		break;
		case 1:
			System.out.println("Le compte rattach\u00e9 à " +list.get(newclient)+ " va être ferm\u00e9.");
			list.get(newclient);
			newclient.fermerCompte(newcompte);
			newcompte = null;
		break;
		case 2:
		break;
		case 3:
			System.out.println("");
		break;
		case 4:
		break;
		default:
			System.err.println("Vous avez choisis de quitter l'application bancaire. Merci et au revoir.");
		break;	
		}
		frappeclient.close();
	}
}
