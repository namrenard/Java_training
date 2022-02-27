import java.util.Scanner;

public class TVA{
	public static void main (String[] args) {
		double pHT, pTTC;
		int t;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Quel est la somme HT s'il vous plait ?");
		pHT = saisie.nextDouble();
		System.out.println("Choisissez le taux de TVA \u00e0 appliquer : [0] = 19.6% et [1] = 5.5%. Merci");
		t = saisie.nextInt();
		pTTC = 0;
		
		
		switch(t){
			case 0 :
				pTTC = pHT + (pHT*0.196);
				System.out.println("La somme TTC est de " + pTTC + " euros");
				
			break;
			case 1 : 
				pTTC = pHT + (pHT*0.05);
				System.out.println("La somme TTC est de " + pTTC + " euros");
			break;
			default : 
				System.err.println("Erreur, vous n'avez pas s\u00e9lectionn\u00e9 un taux de TVA enregistré.");
			break;
		}
		
		/*
		if (t == 0) {
				pTTC = pHT + (pHT*0.196);
		}
		else if (t == 1) {
			pTTC = pHT + (pHT*0.05);
		}
		else {
			try { 
				t < 0; 
				t > 1;
			}
			catch {
				Exception e
			}
			finally {
				System.err.println("Erreur, vous n'avez pas sélectionné un taux de TVA.");
				saisie.close();}	
		}
		*/
		saisie.close();
	}

}