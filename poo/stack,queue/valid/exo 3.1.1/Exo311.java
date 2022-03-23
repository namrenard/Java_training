import java.util.Stack;
import java.util.Scanner;

public class Exo311 {

	
	public static void main(String[] args) {
		expression();
	}

	public static void expression() {
		Stack<String> parenthese = new Stack<String>(); // créer une nouvelle pile
		parenthese.push(")"); //introduction de la parenthese ouvrante
		parenthese.push("("); // introduction de la parenthese fermante
		
		Scanner console = new Scanner(System.in); //declaration scanner pour frappe user
		System.out.println("Veuillez entrer une expression arithm\u00e9tique simple:");
		String reponse = console.next(); //reponse user
		int n = reponse.length(); // taille de l'expression
		while (parenthese.isEmpty()) {
				System.err.println("La pile est vide ! Rechargement de la pile.");
				parenthese.push(")"); //introduction de la parenthese fermante
				parenthese.push("("); // introduction de la parenthese ouvrante
				}
				if (reponse.charAt(0) != '(' && reponse.charAt(n - 1) != ')' ) {
				System.out.println("L'expression n'est pas validée. parenthèse ouvrante et fermante ajoutées.");
				String a = parenthese.pop();
				String b = parenthese.pop();
				System.out.println("Expression corrigée: " + a + reponse + b);
				}
			else if (reponse.charAt(0) == '(' && reponse.charAt(n - 1) != ')') {
				System.out.println("L'expression n'est pas complètement validée. parenthèse fermante ajoutée.");
				parenthese.pop();
				String a = parenthese.pop();
				System.out.println("Expression corrigée: " + reponse + a);
				}
			else if (reponse.charAt(0) != '(' && reponse.charAt(n - 1) == ')') {
				System.out.println("L'expression n'est pas complètement validée. parenthèse ouvrante ajoutée.");
				String a = parenthese.pop();
				System.out.println("Expression : " + a + reponse);
				}
			else {
				System.out.println("L'expression est complètement validée.");
				System.out.println("Expression : " + reponse);
			}
		console.close();
		}
}
/*
 * documentation de recherche.
 */
//https://stackoverflow.com/questions/26306135/how-to-read-characters-in-a-string-in-java
//https://askcodez.com/java-equilibre-expressions-verifier.html
//https://kodejava.org/how-do-i-split-a-string-using-scanner-class/