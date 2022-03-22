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
		System.out.println("notation RPN exemple : (2*(1+2) va donner 212*+ ");
		int reponse = console.nextInt();
		try {
			reponse = 0;
		}catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
	}
}
