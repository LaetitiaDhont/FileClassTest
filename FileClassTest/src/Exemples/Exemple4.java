package Exemples;

// Il faut importer les deux objets
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemple4 {

	// Écrire un objet dans un fichier
	public static void main(String[] args) throws IOException {
		
		// Fos = File Output Stream
	
		FileOutputStream fos = new FileOutputStream("MonZoo.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		
		Object monChien= "Pluto";
		oos.writeObject(monChien);
		Object monCanard = "Hubert";
		oos.writeObject(monCanard);
		oos.close();
	}

}
