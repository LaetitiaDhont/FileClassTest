package Exemples;

import java.io.FileReader;
import java.io.IOException;

// Les fichiers de caractères
public class Exemple9 {

	public static void main(String[] args) throws IOException {

		FileReader is = new FileReader(".\\src\\Flots3.java");
		FileReader os = new FileReader("Flots3.txt");
		int b;
		while ((b = (int) is.read()) != -1)
			os.write(b);
		is.close();
		os.close();
	}

}
