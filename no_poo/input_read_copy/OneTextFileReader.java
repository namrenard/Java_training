import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;


public class OneTextFileReader {

	static public String readInputFile(String inputFileName)  {
		StringBuffer content = new StringBuffer() ;
		try{
			InputStream ips=new FileInputStream(inputFileName);
			InputStreamReader ipsr=new InputStreamReader(ips,"ISO8859-1");
			BufferedReader br=new BufferedReader(ipsr);
			String line;
			while ((line=br.readLine())!=null){
				System.out.println(line);
				content.append( line );
				content.append( "\n" );
			}
			br.close();
		}
		catch (Exception e){
			System.out.println(e.toString());
			return null ;
		}
		return content.toString();
	}

	public static void main(String args[]) throws Exception {

		String myInputFileName01 = "data/README.TXT" ;
		readInputFile(myInputFileName01) ;

	}


}
