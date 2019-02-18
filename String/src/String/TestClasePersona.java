package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClasePersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String edad;
		String peso;
		String apellido1;
		String apellido2;
		List<ClasePersona>listaPersonas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[;\\n]");
		// * significa de 0 - muchos
		// + significa de 1 a mas
//		String nombresRegex = "[a-zA-ZñÑáÁéÉiÍóÓúÚüÜ\\s]+";
//		String enteroRegex = "\\d+";
//		String numeroRealRegex = "\\d+|\\d+\\.\\d+";
		// gabriel jesus ; gonzález del amo ; martínez ; 55; 25.25 
		//mejor aqui para que si hay un problema al parsear salte en el test
		//.trim() quita los espacios en blanco antes y despues
		int edadNumero;
		float pesoNumero;
		for (int i = 0; i < 2; i++) {
			
			System.out.println("Introduzca nombre;primerapellido;segundoapellido;edad;peso");
			nombre = sc.next().trim();
			//System.out.println("Introduzca primer apellido");
			apellido1 = sc.next().trim();
			//System.out.println("Introduzca segundo apellido");
			apellido2 = sc.next().trim();
			//System.out.println("Introduzca edad"); //hay que pasarlo a entero
			edad = sc.next().trim();
			//System.out.println("introduzca peso"); //hay que pasarlo a float
			peso = sc.next().trim();
			
			//System.out.printf("Leido: %S %S %S %s %s%n ", nombre, apellido1,apellido2,edad,peso);
			//no pasa nada por que tengan el mismo nombre
			//no me funciona el if ?????????????????
//			if(edad.matches(enteroRegex) && peso.matches(numeroRealRegex)) {
				edadNumero = Integer.parseInt(edad);
				pesoNumero = Float.parseFloat(peso);
//				if(nombre.matches(nombresRegex) && apellido1.matches(nombresRegex)
//				&& apellido2.matches(nombresRegex)) {
//				
//					  ClasePersona persona = new ClasePersona(nombre, apellido1, apellido2, edadNumero, pesoNumero);
//					  System.out.println(persona);
//					  listaPersonas.add(persona);
//					  System.out.println(listaPersonas);
//					  
//				}
//			}
			ClasePersona persona = new ClasePersona(nombre, apellido1, apellido2, edadNumero, pesoNumero);
			System.out.println(persona);
			listaPersonas.add(persona);
		}
		sc.close();
		
	}

}
