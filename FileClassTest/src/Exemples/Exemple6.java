package Exemples;

import java.io.*;

public class Exemple6 {

	// Lire un fichier
	public static void main(String[] args) {

		try {
			File f = new File("MonFix.txt");
			FileReader fr = new FileReader(f);
			// Flot de communication qui se connecte � un fichier
			BufferedReader br = new BufferedReader(fr);
			// Ce flot est un flot de traitement pour lire efficacement les caract�res
			// Ce flot est li�e au FileReader
			// Cette classe permet de lire des caract�res � partir d'un flux tamponn�, afin
			// de faire des lectures plus rapides.
			// Buffered : ce type de filtre permet de mettre les donn�es du flux dans un
			// tampon. Il peut �tre utilis� en entr�e et en sortie

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
