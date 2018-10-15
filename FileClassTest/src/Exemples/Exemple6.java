package Exemples;

import java.io.*;

public class Exemple6 {

	// Lire un fichier
	public static void main(String[] args) {

		try {
			File f = new File("MonFix.txt");
			FileReader fr = new FileReader(f);
			// Flot de communication qui se connecte à un fichier
			BufferedReader br = new BufferedReader(fr);
			// Ce flot est un flot de traitement pour lire efficacement les caractères
			// Ce flot est liée au FileReader
			// Cette classe permet de lire des caractères à partir d'un flux tamponné, afin
			// de faire des lectures plus rapides.
			// Buffered : ce type de filtre permet de mettre les données du flux dans un
			// tampon. Il peut être utilisé en entrée et en sortie

			String ligne = null;

			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}

			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

}
