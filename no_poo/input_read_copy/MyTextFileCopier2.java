import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MyTextFileCopier2 {

	/**
	 * Copy the text from one file to another one.
	 * 
	 * @param args
	 * @param alltheline String
	 * 
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {

		try {
			InputStream ips = new FileInputStream("data/COPYME.txt");
			InputStreamReader ipsr = new InputStreamReader(ips, "ISO8859-1");
			BufferedReader bur = new BufferedReader(ipsr);

			FileOutputStream sortie = new FileOutputStream("data/COPYCAT.txt");
			BufferedWriter buw = new BufferedWriter(new OutputStreamWriter(sortie, "UTF-8"));
			String alltheline;
			MyTextFileReader.readInputFile("data/COPYME.txt");
			while ((alltheline = bur.readLine()) != null) {
				buw.write(alltheline);
				buw.newLine();
			}
			buw.close();
			bur.close();
			MyTextFileReader.readInputFile("data/COPYCAT.TXT");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
