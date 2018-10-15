package Exemples;

import java.io.FileWriter;
import java.io.IOException;

// Écrire un texte dans un fichier 
public class Exemple5 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("MonFix.txt");
			fw.write("bonjour");
			fw.close();
		}
		catch (IOException ex) {ex.printStackTrace();
			
		}
	}

}
