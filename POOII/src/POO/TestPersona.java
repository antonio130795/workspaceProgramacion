package POO;

import java.time.LocalDate;
import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre, dni, fecha de nacimiento (año/mes/dia)");
		Scanner sc = new Scanner(System.in);
		//cambiando el delimitador los nombres compuestos no nos dan problema
		sc.useDelimiter("\n");
		String nombrePersona = sc.next();
		String dni = sc.next();
		String fechaDeNacimiento = sc.next();
		sc.close();
		//System.out.println(nombrePersona + "-" + dni + "-" + fechaDeNacimiento);
		if(fechaDeNacimiento.matches("\\d{4}[-/]\\d{2}[-/]\\d{2}")) {
		Persona persona = new Persona(nombrePersona.trim(), dni.trim(), LocalDate.parse(fechaDeNacimiento.replaceAll("/", "-")));
		System.out.printf("Dni %s valido %B%n",persona.getDni(), Persona.validarDNI(persona.getDni()));
		}
	}

}
