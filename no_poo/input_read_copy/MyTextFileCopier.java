import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyTextFileCopier {

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
			BufferedReader bur = new BufferedReader(new FileReader("data/COPYME.TXT"));
			BufferedWriter buw = new BufferedWriter(new FileWriter("data/COPYCAT.TXT"));
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
