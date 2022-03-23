import java.lang.Math;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Queue<Integer> fileAttente = new LinkedList<Integer>(); 
	
		System.out.println("Veuillez entrer un nombre pour simuler une file d'attente à itérer. Merci");
		int choix = console.nextInt();
	
		for (int i=0; i< choix ; i++){
			double nb = 10*Math.random(); //genere le chiffre aleatoirement
			int nb2 = (int)Math.round(nb);
			fileAttente.add(nb2);
			
			if (nb2 %2 == 0){
				System.out.println("Une personne entre dans la file : " + fileAttente.peek() + " .");
			}
			else {
				System.out.println("Un personne sort de la file");
				fileAttente.remove(nb2);
				System.out.println("Elle portait le numero d'attente "+ nb2 +" .");		
			}
		System.out.println("Composition de la file d'attente : " + fileAttente);
		console.close();	
		}
		
	}

}

// https://www.baeldung.com/modulo-java
//https://waytolearnx.com/2020/03/verifier-si-un-nombre-est-pair-ou-impair-java.html
//https://www.delftstack.com/fr/howto/java/double-to-int-java/
