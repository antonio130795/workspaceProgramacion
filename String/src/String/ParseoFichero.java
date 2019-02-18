package String;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseoFichero {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("ficheros/nombres_mujer.txt");
		Scanner sc = new Scanner(inputFile);
		List<String> nombresEmpiezanPorA = new ArrayList<>();
		List<String> nombresNoAcabanEnVocal = new ArrayList<>();
		int contador = 0;
		String linea;
		int iPalabraMayor = 0;
		int iPalabraMenor = Integer.MAX_VALUE;
		//mientras que haya lineas por leer significa el hasnextline
		while(sc.hasNextLine()) {
			//lee la linea 
			linea = sc.nextLine();
			contador++;
			//mayormenor
			if(linea.matches("^[aAáÁ].*$")) {
				nombresEmpiezanPorA.add(linea);
			}
			if(linea.matches(".*[^aeiouAEIOUáéíóúÁÉÍÓÚüÜ]")) {
				nombresNoAcabanEnVocal.add(linea);
			}
		}
		
		System.out.println("Nº lineas leidas " + contador);
		System.out.println(nombresEmpiezanPorA);
		System.out.println(nombresNoAcabanEnVocal);
		
		
		
	}
}
