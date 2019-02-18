package referencias;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import au.com.bytecode.opencsv.CSVReader;

public class csvgenerado {
	public static void main(String[] args) throws IOException {
		//List<Ciudad> listaCiudades = new Arraylist<>();
		String archCSV = "miscsv/ciudades.csv";
		CSVReader csvReader = new CSVReader(new FileReader(archCSV));
		//el contador es para que no lea la cabecera del csv 
		//y no de error al ejecutar el constructor
		int contador = 0;
		String[] fila = null;
		while((fila = csvReader.readNext()) != null) {
			if (contador == 0 ) {
				contador++;
			}else {
		    System.out.print("Nombre de ciudad: " + fila[0]);
		    System.out.print("Nombre de pais: " + fila[1]);
		    System.out.print("longitud: " + fila[2]);
		    System.out.print("latitud: " + fila[3] + "\n");
		    System.out.println("------------------------------------------------------------------------------");
		    //deberia tener el objeto ciudad
		    //le pasamos eso al constructor 
		    //como vienen los datos como string con parseFloat pasamos a numero para que no de problemas
		    //Ciudad ciudad = new Ciudad(fila[0], fila[1], Float.parseFloat(fila[3]), Float.parseFloat(fila[4]));
			}
		}

		csvReader.close();
	}
}
