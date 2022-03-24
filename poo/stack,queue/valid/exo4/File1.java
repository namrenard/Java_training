public class File1 {

	public static void main(String[] args) {
		String[] tc1 = new String[10];
		File<String> f01 = new FileTableau<String>(tc1);
		String c = "A,B,C,D,E,F,G,H,I,J,K,L";
		String[] d = c.split(",");
		System.out.println("f01 est vide ? " + f01.est_FileVide());
		try {
				System.out.println("Sommet de f01 => " + f01.getPremier() );
		} catch(Exception e) {
				System.err.println(e+ " sa tete n'existe pas !");
		}
		
		for (int i = 0; i < d.length ; i++){
			while (f01.est_FileVide()) {
				System.out.println("On ajoute => " + d[0] );
				f01.enfiler(d[0]);
				System.out.println("On ajoute => " + d[1] );
				f01.enfiler(d[1]);
				System.out.println("On ajoute => " + d[2] );
				f01.enfiler(d[2]);
				String f = f01.getPremier();
				System.out.println("Tete de f01 => " + f +" et on défile !");
				f01.defiler();
				f = f01.getPremier();
				System.out.println("Tete de f01 => " + f +" et on défile !");
				f01.defiler();
				f = f01.getPremier();
				System.out.println("Tete de f01 => " + f +" et on défile !");
				f01.enfiler(d[3]);
				System.out.println("On ajoute => " + d[3] );		
				f01.defiler();
				f01.defiler();
				try {
				System.out.println("Sommet de f01 => " + f01.getPremier() );			
				System.out.println("Tete de f01 => " + f );
				f01.defiler();
				} catch(Exception e) {
				System.err.println(e+ " sa tete n'existe pas !");
				}
				finally{
				f01.enfiler(d[4]);
				System.out.println("Tete de f01 => " + f );
				System.out.println("On ajoute => " + d[4] );
				f01.enfiler(d[5]);
				System.out.println("Tete de f01 => " + f );
				System.out.println("On ajoute => " + d[5] );
				f01.enfiler(d[6]);
				System.out.println("Tete de f01 => " + f );
				System.out.println("On ajoute => " + d[6] );
				f01.enfiler(d[7]);
				System.out.println("Tete de f01 => " + f );
				System.out.println("On ajoute => " + d[7] );
				f01.enfiler(d[8]);
				System.out.println("Tete de f01 => " + f );
				System.out.println("On ajoute => " + d[8] );
				f01.enfiler(d[9]);
				System.out.println("Tete de f01 => " + f );
				System.out.println("On ajoute => " + d[9] );
				f01.enfiler(d[10]);
				System.out.println("Tete de f01 => " + f );
				System.out.println("On ajoute => " + d[10] );
				f01.enfiler(d[11]);
				System.out.println("Tete de f01 => " + f );
				System.out.println("On ajoute => " + d[11] );
				}
			}
		}
		System.out.println("C'est fini !");
		}	
	}