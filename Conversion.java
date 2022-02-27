
import java.util.Scanner; //importation de la classe Scanner pour vérifier la frappe user.

public class Conversion{
	public static void main (String[] args){
		double euros, francs;
		Scanner Reponse = new Scanner(System.in); // création de nouvelle méthode scanner
		
		System.out.print("Somme en euros? ");
		euros = Reponse.nextDouble();
		francs = euros*6.559;
		System.out.println("La somme est en francs "+ francs);
		Reponse.close();
	}

}