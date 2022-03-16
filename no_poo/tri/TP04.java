import java.util.Scanner;
import java.util.Arrays;

public class TP04{
			
	public static void triBulle(int[] A){

			boolean permut;
			int taille = A.length;
			int indiceMax = taille-1;
			do {
				permut = false;
				for (int i=1 ; i < indiceMax; i++){
					if (A[i-1] > A[i]){
						int temporaire = A[i-1];
						A[i-1] = A[i];
						A[i] = temporaire;
						permut = true;
					}	
				}
				indiceMax -= 1;
			}
			while (permut = true);
				System.out.println("Tableau apr\u00e8s tri :" +Arrays.toString(A));
			}
	public static void triSelection(int[] A){	
			
			for (int i=0; i<A.length;i++){
				int iMin = i;
				for (int j = iMin; j<A.length -1; j++){
					if (A[j] < A[iMin]){
						iMin = j;
					}
				}
				int temporaire = A[iMin]; 
				A[iMin] = A[i];
				A[i] = temporaire;
			}
			System.out.println("Tableau apr\u00e8s tri :" +Arrays.toString(A));
		}
	public static void triInsertion(int[] A){
			
			int taille = A.length;
			for (int i= 1; i< taille; i++){
				int valins = A[i];
				int j=i;
				while (j>0 && A[j-1] > valins){
					A[j] = A[j-1];
					j--;
				}
				A[j]=valins;
			}
			System.out.println("Tableau apr\u00e8s tri :" +Arrays.toString(A));
		}
	public static void triShell(int[] A){
			
			int taille = A.length;
			int pas=0;
			
			while(pas<taille){
				pas=3*pas+1;
				}
			
			while(pas > 1){
				pas=pas/3;
				for (int i=pas;i<taille;i++){
					int valins=A[i];
					int j=i;

					while(j> pas && (A[j-pas]>valins)){
						A[j]=A[j-i];
						j=j-pas;
					}
					A[j]=valins;
				}
			}
			System.out.println("Les \u00e9l\u00e9ments sont dans cet ordre apr\u00e8s le tri : ");
			System.out.println("Tableau ["+Arrays.toString(A)+"] ");
		}
	public static void triSort(int[] A){
			
			System.out.println("Les \u00e9l\u00e9ments sont dans cet ordre avant le tri : ");
			for (int i = 0; i< A.length; i++){
				System.out.println("Tableau [" +i+ "]= " +A[i]);
			}
			Arrays.sort(A);
			System.out.println("Les \u00e9l\u00e9ments sont dans cet ordre apr\u00e8s le tri : ");
			for (int i = 0; i< A.length; i++){
				System.out.println("Tableau [" +i+ "]= " +A[i]);
			}
		}
	public static void triStream(int[] A){
			Arrays.stream(A).forEach(System.out::println);
		}
		
	public static void main (String[] args){
	/* scanner pour demander quel tri 
	* si 1,2,3,4 en fonction des tri.
	*1 = tri bulle
	*2 = tri selection
	*3 = tri insertion
	*4 = tri shell
	*5 = Methode récente ( arrays.sort(tab); + boucle for)
	*6 = Methode Stream(arrays.stream(montableau).foreach(System.out::println);)
	*ensuite sort le résultat du tri dans le tableau dans chaque tri + explication de procédure.
	*/
		Scanner console = new Scanner(System.in);
		//declaration taille tableau
		System.out.println("Bonjour, veuillez donner une taille au tableau.");
		int taille_tableau = console.nextInt();
		int[] A = new int [taille_tableau];
		//declaration des int du tableau
		System.out.println("Veuillez entrer une suite d'entier naturel d\u00e9sordonn\u00e9. Une valeur puis 'entrer' \u00e0 chaque fois.");
		for (int i=0; i<taille_tableau;i++){
			A[i] = console.nextInt();
		}
		System.out.println("Les entiers du tableau sont :" + Arrays.toString(A));
		//choix du tri
		String saisie_str = console.nextLine();
		System.out.println("Bonjour, veuillez selectionner un choix de tri.");
		System.out.println("[bulle] | [selection] | [insertion] | [shell] | [sort] | [stream]. Merci");
		saisie_str = console.nextLine();
		
		switch(saisie_str){
			
			case "bulle" :
				triBulle(A);
			break;
			case "selection" :
				triSelection(A);
			break;
			case "insertion" :
				triInsertion(A);
			break;
			case "shell" :
				triShell(A);
			break;
			case "sort" :
				triSort(A);
			break;
			case "stream" :
				triStream(A);
			break;
			default : 
				System.err.println("Erreur, vous n'avez pas choisi une m\u00e9thode de tri valide. Programme abord\u00e9");
				console.close();			
		}
	
	}
	
}