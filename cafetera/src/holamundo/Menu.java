package holamundo;

import java.util.Scanner;

public class Menu {
	
	public static boolean comprobarDinero(int eleccion) {
		double precio = 0;
		double monedas = 0;
		//double sumaTotal = 0; esto qui no se puede sumar tiene que ser cuando se devuelva no?
		switch(eleccion) {
		case 1:
			precio = 1.5;
			System.out.println("El precio es de 1€");
			break;
		case 2:
			precio = 1.10;
			System.out.println("El precio es de 1.10€");
			break;
		case 3:
			precio = 1.30;
			System.out.println("El precio es de 1.30€");
			break;
		case 4:
			precio = 1;
			System.out.println("El precio es de 1€");
			break;
		case 5:
			precio = 1.2;
			System.out.println("El precio es de 1.2€");
			break;
		default :
			System.out.println("No existe bebida con ese codigo ");
			return false;
		
		}
		
		System.out.println("Introduzca monedas de 5cnt, 10cnt, 20cnt, 50cnt y 1€");
		System.out.println("---------------0,5cnt");
		System.out.println("---------------0,10cnt");
		System.out.println("---------------0,20cnt");
		System.out.println("---------------0,50cnt");
		System.out.println("---------------1,0€");
		System.out.println("---------------(6)cancelar");
		
		while(precio >= monedas) { //comprobr por que no va bien 
			System.out.println("Introcuzca el dinero");
			System.out.println("la suma total es de " + monedas);
			Scanner sc = new Scanner(System.in);
			double comprobar = sc.nextDouble();
			if(comprobar > 1.0) {
				return false;
			
			}else {
				monedas += comprobar;
			}
		}
		
		return true;
	}
	//para rellenar esto necesito hacer bien la resta de materiales cuando hago un cafe
	public static boolean menuAdministrador(int opcion2) {
		switch(opcion2) {
		case 1:
			//tengo que hacerlo ne bucle para poder acumular dinero
			break;
		case 2:
			//desde aqu no puedo llamar al objeto por que?
			/*
			System.out.println(cafetera.hayAguaCafetito(1));
			System.out.println(cafetera.hayVasos());
			for(int i = 0; i < 5; i++) {
			System.out.println(cafetera.hayCapsula(i));
			}
			*/
			break;
		case 3:
			//añadir como? setter?
			break;
		case 4:
			//añadir como? setter?
			break;
		case 5:
			//añadir como? setter?
			break;
		case 6:
			//cuando pueda recogerla poner la variable que recauda a 0
			break;
		case 7:
			//salir al menu principal como?
			break;
		default:
					
		}
		
		return true;
	}
	
}
