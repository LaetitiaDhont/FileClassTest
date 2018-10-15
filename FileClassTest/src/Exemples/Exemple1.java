package Exemples;

import java.io.File;
import java.io.FileFilter;

public class Exemple1 {

	public static void main(String[] args) {
		// Répertoire de recherche
		// Il faut écrire le chemin d'accès à notre répertoire, en l'occurence j'ai un
		// package Exemples donc j'afficherais tout ce qu'il contient qui fini par .java
		String rep = "C:\\Users\\laeti\\Desktop\\WORK\\EclipseWorkspace\\FileClassTest\\src\\Exemples";
		// Construction d'un fichier sur ce répertoire
		// Objet de type File
		File repFile = new File(rep);

		// Filtrage du contenu de ce répertoire
		// On passe en paramètre une instance de classe anonyme

		/*
		 * listFiles(FileFilter) retournent tous les fichiers (sans les répertoires) de
		 * ce répertoire, qui satisfont le filtre passé en paramètre.
		 */

		// Tableau de files
		File[] fichiersJava = repFile.listFiles(new FileFilter() {

			// Cette interface n'a qu'une unique méthode
			public boolean accept(File pathname) {
				// On récupère le nom de ce fichier grâce à la méthode getName()
				String fileName = pathname.getName();

				// On teste s'il se termine par .java grâce à la méthode endsWith()
				return fileName.endsWith(".java");
			}
		});

		// Pour afficher les noms des fichiers récupérés, on utilise un for each 
		for (File fichierJava : fichiersJava) {
			System.out.println(fichierJava.getName());
		}

	}

}
