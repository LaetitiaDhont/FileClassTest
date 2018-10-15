package Exemples;

import java.io.File;

// Exemple d'utilisation de File
public class Exemple3 {

	public static void main(String[] args) {

		// On cr�� un nouveau repertoire
		File rep = new File("MonFic.txt");
		rep.mkdir();

		// Lister le contenu du repertoire
		// La m�thode isDirectory()
		// Qui d�termine si le chemin correspond � un r�pertoire.
		if (rep.isDirectory()) {
			String[] contenuRap = rep.list();
			for (int i = 0; i < contenuRap.length; i++) {
				System.out.println(contenuRap[i]);
			}
			// La m�thode getAbsolutePath permet d'obtenir le chemin absolu d'un fichier ou
			// d'un repertoire
			System.out.println(rep.getAbsolutePath());
			
			// Supprimer mon repertoire avec la m�thode delete
			boolean supprime = rep.delete();
		}
	}

}
