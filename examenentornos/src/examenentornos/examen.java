package examenentornos;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		int opcion;
		
		do{
			//llamamos al menu
			opcion = modulos.menu();
			//segun la opcion que nos devuelve entramos a un case
		switch(opcion) {
		case 1: 
			//pedimos base y altura del triangulo
			System.out.println("opcion 1");
			System.out.println("Introduce la base del triangulo");
			Scanner sc = new Scanner(System.in);
			int base = sc.nextInt();
			System.out.println("Introduce la altura del triangulo");
			Scanner sc2 = new Scanner(System.in);
			int altura = sc.nextInt();
			//comprobamos si los datos son correctos y llamamos a la funcion o declinamos
			if(base > 0 && altura > 0) {
				System.out.println("El area del triangulo es: ");
				System.out.println(modulos.triangulo(base, altura));
				
			}else {
				System.out.println("tanto la base como la altura deben de ser positivos");				
			}
			break;
					
		case 2:
			//pedimos datos del trapecio
			System.out.println("opcion 2");
			
			System.out.println("Introduce la base del trapecio");
			Scanner sc3 = new Scanner(System.in);
			int baseTrapecio = sc3.nextInt();
			System.out.println("Introduce otra base del trapecio");
			Scanner sc4 = new Scanner(System.in);
			int baseTrapecio2 = sc4.nextInt();
			System.out.println("Introduce la altura del trapecio");
			Scanner sc7 = new Scanner(System.in);
			int alturaTrapecio2 = sc7.nextInt();
			//comprobamos los datos y llamamos a la fncion
			if(baseTrapecio > baseTrapecio2 || baseTrapecio2 > baseTrapecio) {
				
				System.out.println(modulos.trapecio(baseTrapecio, baseTrapecio2, alturaTrapecio2));
			}else {
				System.out.println("Obligatoriamente una base tiene que ser mayor que la otra");
			}
			
			break;
		case 3:
			//pedimos los datos del rectangulo
			System.out.println("opcion 3");
			
			System.out.println("Introduce la base del rectangulo");
			Scanner sc5 = new Scanner(System.in);
			int baseRectangulo = sc5.nextInt();
			System.out.println("Introduce la altura del rectangulo");
			Scanner sc6 = new Scanner(System.in);
			int alturaRectangulo = sc6.nextInt();
			//comprobamos los datos y llamamos a la funcion
			if(alturaRectangulo > 10 || alturaRectangulo < 2) {
				System.out.println("La altura debe estar comprendida entre 2 y 10");
			}else if(baseRectangulo > 10 || baseRectangulo < 2) {
				System.out.println("La base debe estar comprendida entre 2 y 10");
			}else {
				System.out.println(modulos.rectangulo(baseRectangulo, alturaRectangulo));
			}
			
			break;
		case 4:
			System.out.println("opcion 4");
			break;
		default:
			System.out.println("opcion erronea");
		
		
		}
		}while(opcion != 4);
	}

}
