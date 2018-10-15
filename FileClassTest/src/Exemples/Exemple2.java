package Exemples;

// Il faut importer la classe File et la classe Arrays
import java.io.File;
import java.util.Arrays;

public class Exemple2 {

	public static void main(String[] args) {
		// Liste des éléments racine du système de fichier courant
		// Roots = racines 
		File [] roots = File.listRoots() ;

		 // Affichage du tableau résultat
		System.out.println(Arrays.toString(roots)) ;

	}

}
