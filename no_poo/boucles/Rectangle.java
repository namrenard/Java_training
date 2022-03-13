import java.util.Scanner;

public class Rectangle {
	public static void main (String[] args){
		Scanner trace = new Scanner(System.in);
		
		System.out.println("Indiquez combien de ligne * vous voulez ?");
		int choix = trace.nextInt();
		for (int i = 0; i < choix ;i++){
			System.out.println("*****");
		}
	}
}