package Exemples;

import java.io.File;

// Il faut importer ma classe File

public class FileClass {

	public static void main(String[] args) {

		// utilisation de StringBuffer pour éviter les concaténation // de chaînes de
		// caractères

		StringBuffer accessFileName = new StringBuffer();
		/*
		 * File Separator sert à faire en sorte que chaque OS puisse lire le code Ici je
		 * suis sur Windows mais si je partage mon code à un Linux il pourra
		 * automatiquement l'interpréter.
		 */
		accessFileName.append("tmp").append(File.separator).append("access.log");
		System.out.println(accessFileName);

		// Ma console va m'afficher le chemin d'accès absolu à ma classe

		System.out.println(System.getProperty("user.dir"));

		System.out.println(System.getProperty("java.io.tmpdir"));

	}

}
