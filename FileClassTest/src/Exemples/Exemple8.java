package Exemples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exemple8 {

	public static void main(String[] args) throws IOException {
		FileInputStream is = new FileInputStream("src\\Flots.java");
		FileOutputStream os = new FileOutputStream("Flots.txt");
		
		byte b;
		while ((b = (byte) is.read()) != -1)
			os.write(b);
		is.close();
		os.close();
	}

}
