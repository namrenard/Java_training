import java.util.*;
import java.util.Scanner;

public class Exo32 {

	public static void main(String[] args) {
		expressionPolonaise();
	}
	public static void expressionPolonaise() {
		
		Stack<Integer> RPN = new Stack<Integer>();
		Scanner console = new Scanner(System.in);
		
		System.out.println("Veuillez entrer une expression arithmétique en notation RPN séparé par des espaces.Merci");
		System.out.println("une notation RPN c'est par exemple : (2*(1+2) qui va donner 2 1 2* +");
		System.out.println();
		String reponse = console.nextLine();
			
		while(RPN.isEmpty()) {
			
			for(String n: reponse.split("\\s+")) { // pour chaque character de la string,on incrémente la stack ou on calcule.
				System.out.print(n + "\t");
				switch(n){
					case "+": 
					RPN.push(RPN.pop() + RPN.pop());					
					break;
					case "-":
					RPN.push(RPN.pop() - RPN.pop());					
					break;
					case "*":
					RPN.push(RPN.pop() * RPN.pop());					
					break;
					case "/":
					RPN.push(RPN.pop() / RPN.pop());					
					break;
					default:
					RPN.push(Integer.parseInt(n));
					break;
				}
				
			System.out.println("Le résultat est donc :" + RPN);				
			console.close();
			}
			
		}
	}
}
//recherche biblio : 
//https://www.delftstack.com/fr/howto/java/how-to-check-type-of-a-variable-in-java/
//https://www.javatpoint.com/java-tokens
//https://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html
//https://www.w3schools.com/java/java_regex.asp
//https://stackoverflow.com/questions/26280879/how-does-string-split-s-work
//https://www.softwaretestinghelp.com/java-string-split-method/
