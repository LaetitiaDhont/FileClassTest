package ExercicesAvancé;

import java.util.Scanner;

/*
 *Exercice 1 Entrées/sorties clavier.
  Le but de cet exercice est de calculer la moyenne de notes données au clavier.
  Le système demande des notes jusqu'à ce que le mot clé "fini” soit donné.
  A ce moment là le système s'arrête et affiche la moyenne. 
  Il faudra faire attention à ce que chaque note soit comprise entre 0 et 20 et soit bien numérique. 
  Pour ceci nous allons utiliser System.in qui est un InputStream.
  Il est alors possible d'utiliser la classe Scanner permettant la lecture de l'entrée avec Scanner scanner = new Scanner(System.in). 
  La lecture du clavier se fait alors avec String line = scanner.nextLine().

 */
public class Exercice1 {

	// Retourne le numéro que l'utilisateur va choisir
	public static double readNumber(String line) {

		double note = 0;

		// scan.nextLine récupère un String donc on doit récupérer la ligne pour la
		// transformer en int

		try {
			note = Double.parseDouble(line);

			if (note >= 0 && note <= 20) {
				return note;

			}

			// end if

			else {
				System.out.println("Rentrez un nombre compris entre 0 et 20");
				return -1;
			}
		}

		catch (NumberFormatException e) {
			System.out.println("Veuillez saisir un nombre!");
			// Retour d'erreur
			// Je dois retourner une valeur à mon main pour exclure une valeur
			return -1;
		}

	}

	public static void main(String[] args) {

		// Mon Scanner

		Scanner scan = new Scanner(System.in);
		String line = null;

		// Variable qui contient la somme des notes
		double total = 0;

		// Variable qui va stocker notre nombre de notes pour pouvoir le diviser à notre
		// total
		int nbNote = 0;

		// Tant que line n'est pas saisi on continue les instructions
		// Condition pour terminer l'application
		// scan.nextLine stock la ligne dans line et la méthode equals compare cette
		// ligne au mot fini

		double statusNumber = 0;
		boolean end = false;

		System.out.println("Veuillez saisir vos notes : ");

		while (!end) {

			while (!(line = scan.nextLine()).equals("fini")) {

				statusNumber = readNumber(line);
				if (statusNumber != -1) {
					// total+= signifie total + readNumber(Line);
					total += statusNumber;
					nbNote++;
				}

			}
			if (nbNote != 0) {
				System.out.println("La moyenne est de " + (total / nbNote));
				end = true;

			}

			else {
				System.out.println("Entrez au moins un note!");
			}
		}
	}
}
