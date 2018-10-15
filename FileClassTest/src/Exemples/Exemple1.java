package Exemples;

import java.io.File;
import java.io.FileFilter;

public class Exemple1 {

	public static void main(String[] args) {
		// R�pertoire de recherche
		// Il faut �crire le chemin d'acc�s � notre r�pertoire, en l'occurence j'ai un
		// package Exemples donc j'afficherais tout ce qu'il contient qui fini par .java
		String rep = "C:\\Users\\laeti\\Desktop\\WORK\\EclipseWorkspace\\FileClassTest\\src\\Exemples";
		// Construction d'un fichier sur ce r�pertoire
		// Objet de type File
		File repFile = new File(rep);

		// Filtrage du contenu de ce r�pertoire
		// On passe en param�tre une instance de classe anonyme

		/*
		 * listFiles(FileFilter) retournent tous les fichiers (sans les r�pertoires) de
		 * ce r�pertoire, qui satisfont le filtre pass� en param�tre.
		 */

		// Tableau de files
		File[] fichiersJava = repFile.listFiles(new FileFilter() {

			// Cette interface n'a qu'une unique m�thode
			public boolean accept(File pathname) {
				// On r�cup�re le nom de ce fichier gr�ce � la m�thode getName()
				String fileName = pathname.getName();

				// On teste s'il se termine par .java gr�ce � la m�thode endsWith()
				return fileName.endsWith(".java");
			}
		});

		// Pour afficher les noms des fichiers r�cup�r�s, on utilise un for each 
		for (File fichierJava : fichiersJava) {
			System.out.println(fichierJava.getName());
		}

	}

}
