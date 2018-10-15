package Exemples;

import java.io.File;

// Exemple d'utilisation de File
public class Exemple3 {

	public static void main(String[] args) {

		// On créé un nouveau repertoire
		File rep = new File("MonFic.txt");
		rep.mkdir();

		// Lister le contenu du repertoire
		// La méthode isDirectory()
		// Qui détermine si le chemin correspond à un répertoire.
		if (rep.isDirectory()) {
			String[] contenuRap = rep.list();
			for (int i = 0; i < contenuRap.length; i++) {
				System.out.println(contenuRap[i]);
			}
			// La méthode getAbsolutePath permet d'obtenir le chemin absolu d'un fichier ou
			// d'un repertoire
			System.out.println(rep.getAbsolutePath());
			
			// Supprimer mon repertoire avec la méthode delete
			boolean supprime = rep.delete();
		}
	}

}
