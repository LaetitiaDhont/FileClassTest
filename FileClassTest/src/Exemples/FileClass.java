package Exemples;

import java.io.File;

// Il faut importer ma classe File

public class FileClass {

	public static void main(String[] args) {

		// utilisation de StringBuffer pour �viter les concat�nation // de cha�nes de
		// caract�res

		StringBuffer accessFileName = new StringBuffer();
		/*
		 * File Separator sert � faire en sorte que chaque OS puisse lire le code Ici je
		 * suis sur Windows mais si je partage mon code � un Linux il pourra
		 * automatiquement l'interpr�ter.
		 */
		accessFileName.append("tmp").append(File.separator).append("access.log");
		System.out.println(accessFileName);

		// Ma console va m'afficher le chemin d'acc�s absolu � ma classe

		System.out.println(System.getProperty("user.dir"));

		System.out.println(System.getProperty("java.io.tmpdir"));

	}

}
