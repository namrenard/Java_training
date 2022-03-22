package exo_list;

import java.util.Stack;
import java.util.Scanner;

public class exo3 {

	public static void main(String[] args) {
		expression();
	}

	public static void expression() {
		Stack<String> parenthese = new Stack<String>(); // créer une nouvelle pile
		Scanner console = new Scanner(System.in); //declaration scanner
		System.out.println("Veuillez entrer une expression arithmétique :");
		String reponse = console.next(); //reponse user
		int n = reponse.length(); // taille de l'expression
		while (parenthese.isEmpty()) {
			if (reponse.charAt(0) != '(' && reponse.charAt(n - 1) != ')' ) {
				System.out.println("L'expression n'est pas validée. parenthèse ouvrante et fermante ajoutées.");
				parenthese.push("(");
				parenthese.push(reponse);
				parenthese.push(")");
				System.out.println("Expression : " + parenthese);
				}
			else if (reponse.charAt(0) == '(' && reponse.charAt(n - 1) != ')') {
				System.out.println("L'expression n'est pas complètement validée. parenthèse fermante ajoutée.");
				parenthese.push(reponse);
				parenthese.push(")");
				System.out.println("Expression : " + parenthese);
				}
			else if (reponse.charAt(0) != '(' && reponse.charAt(n - 1) == ')') {
				System.out.println("L'expression n'est pas complètement validée. parenthèse ouvrante ajoutée.");
				parenthese.push("(");
				parenthese.push(reponse);
				System.out.println("Expression : " + parenthese);
				}
			else {
				System.out.println("L'expression est complètement validée.");
				parenthese.push(reponse);
				System.out.println("Expression : " + parenthese);
				}
			}
		console.close();
		}
}
/*
 * documentation de recharche.
 */
//https://stackoverflow.com/questions/26306135/how-to-read-characters-in-a-string-in-java
//https://askcodez.com/java-equilibre-expressions-verifier.html
//https://kodejava.org/how-do-i-split-a-string-using-scanner-class/
