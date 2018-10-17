package ExercicesAvanc�;

import java.util.Scanner;

/*
 *Exercice 1 Entr�es/sorties clavier.
  Le but de cet exercice est de calculer la moyenne de notes donn�es au clavier.
  Le syst�me demande des notes jusqu'� ce que le mot cl� "fini� soit donn�.
  A ce moment l� le syst�me s'arr�te et affiche la moyenne. 
  Il faudra faire attention � ce que chaque note soit comprise entre 0 et 20 et soit bien num�rique. 
  Pour ceci nous allons utiliser System.in qui est un InputStream.
  Il est alors possible d'utiliser la classe Scanner permettant la lecture de l'entr�e avec Scanner scanner = new Scanner(System.in). 
  La lecture du clavier se fait alors avec String line = scanner.nextLine().

 */
public class Exercice1 {

	// Retourne le num�ro que l'utilisateur va choisir
	public static double readNumber(String line) {

		double note = 0;

		// scan.nextLine r�cup�re un String donc on doit r�cup�rer la ligne pour la
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
			// Je dois retourner une valeur � mon main pour exclure une valeur
			return -1;
		}

	}

	public static void main(String[] args) {

		// Mon Scanner

		Scanner scan = new Scanner(System.in);
		String line = null;

		// Variable qui contient la somme des notes
		double total = 0;

		// Variable qui va stocker notre nombre de notes pour pouvoir le diviser � notre
		// total
		int nbNote = 0;

		// Tant que line n'est pas saisi on continue les instructions
		// Condition pour terminer l'application
		// scan.nextLine stock la ligne dans line et la m�thode equals compare cette
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
