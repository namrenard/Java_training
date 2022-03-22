package exo_list;

import java.util.Stack;
import java.util.Scanner;

public class exo32 {

	public static void main(String[] args) {
		expressionPolonaise();
	}
	public static void expressionPolonaise() {
		Scanner console = new Scanner(System.in);
		System.out.println("Veuillez entrer une expression arithmétique en notation RPN");
		System.out.println("une notation RPN c'est par exemple : (2*(1+2) qui va donner 212*+");
		String reponse = console.nextLine();
		
		Stack<String> RPN = new Stack<String>();
		while(RPN.isEmpty()) {
			char[] decoupe = reponse.toCharArray();
			for( int i = 0; i<decoupe.length;i++) {
				if (reponse == "+") {
					int a = Integer.parseInt(RPN.pop());
					int b = Integer.parseInt(RPN.pop());
					String c = String.valueOf(a+b);
					RPN.push(c);					
					}
				else if (reponse == "*") {
					int a = Integer.parseInt(RPN.pop());
					int b = Integer.parseInt(RPN.pop());
					String c = String.valueOf(a*b);
					RPN.push(c);
				}
				else if (reponse == "-") {
					int a = Integer.parseInt(RPN.pop());
					int b = Integer.parseInt(RPN.pop());
					String c = String.valueOf(a-b);
					RPN.push(c);
				}
				else if (reponse == "/") {
					int a = Integer.parseInt(RPN.pop());
					int b = Integer.parseInt(RPN.pop());
					String c = String.valueOf(a/b);
					RPN.push(c);
				}
				else {
					RPN.push(reponse);
				}
			System.out.println("Le résultat est donc :" + RPN);	
			console.close();
			}
			
		}
	}
}
//https://www.delftstack.com/fr/howto/java/how-to-check-type-of-a-variable-in-java/
//pb  https://codes-sources.commentcamarche.net/forum/affich-585561-decomposition-d-une-chaine-de-caractere