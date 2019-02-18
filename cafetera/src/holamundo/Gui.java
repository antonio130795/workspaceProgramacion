package holamundo;

import java.util.Scanner;

public class Gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Cafetera maquina = new Cafetera(10,5);
		System.out.println(maquina.devCafetera());
		System.out.println(maquina.getNivelAgua());
		System.out.println(maquina.getVasos());
*/
	Cafetera cafetera = new Cafetera(10,5,5,Cafetera.pruebaRecarga(4));
	
	System.out.println("Introducir opcion --------------------");
	System.out.println("---------------(1)Visualizar Productos");
	System.out.println("-----------(2)Sacar te/cafe de maquina");	
	System.out.println("----------------(3)Administrar maquina");	
	
	Scanner sc = new Scanner(System.in);
	int opcion = sc.nextInt();
	
	switch(opcion) {
	case 1:
		System.out.println("ha elegido la opcion 1");
		System.out.println("---------------(1)cafe solo 1.5€");
		System.out.println("---------------(2)cafe manchado 1.1€");
		System.out.println("---------------(3)cafe con leche 1.30€");
		System.out.println("---------------(4)te rojo 1€");
		System.out.println("---------------(5)te verde 1.2€");
		System.out.println("---------------Volver al menu anterior"); //como?
		break;
	case 2:
		System.out.println("ha elegido la opcion 2");
		System.out.println("Introduzca el codigo de la bebida");
		int eleccion = sc.nextInt();
		//como hacer para que me vaya restando el contenido de la matriz
		//cada vez que use los materiales para hacer un cafe
		if(Menu.comprobarDinero(eleccion) == true) {
			if(cafetera.hayAguaCafetito(eleccion) == false) {
				System.out.println("error 1");
			}else if(cafetera.hayVasos() == false) {
				System.out.println("error 2");
			}else if(cafetera.hayCapsula(eleccion) == false) {
				System.out.println("error 3");
			}else
			System.out.println("Bebida procesandose");
		}else {
			System.out.println("False");
			System.out.println("Proceso cancelado");
		}
		break;
	case 3:
		System.out.println("Bienvenido al modo administrador");
		System.out.println("Introducir usuario");
		Scanner sc2 = new Scanner(System.in);
		String Usuario = sc2.nextLine();
		if(Usuario.equals("pepe")) {
			System.out.println("Introsucir contraseña");
			Scanner sc3 = new Scanner(System.in);
			String pass = sc3.nextLine();
				if(pass.equals("1234")) {
					System.out.println("Bienvenido administrador");
					System.out.println("-----------------(1)Ver recaudacion diaria");
					System.out.println("-----------------(2)Ver disponibles(vasos, agua y capsulas)");
					System.out.println("-----------------(3)Añadir vasos");
					System.out.println("-----------------(4)Añadir agua");
					System.out.println("-----------------(5)Añadir capsulas");
					System.out.println("-----------------(6)Recoger recaudacion");
					System.out.println("-----------------(7)Salir");
					Scanner sc4 = new Scanner(System.in);
					int opcion2 = sc4.nextInt();
					//llamada menu administrador 
					Menu.menuAdministrador(opcion2);
				}else {
					System.out.println("Contraseña incorrecta");
				}
		}else {
			System.out.println("Usuario incorrecto");
		}
		break;
	default:
		System.out.println("Introduce un valor comprendido entre 1 y 3");
	}
		
	/*	
		
	
	System.out.println(cafetera);
	System.out.println(cafetera.devCafetera());
	System.out.println("numero de vasos " + cafetera.estadoVasos());
	System.out.println("agua que queda " + cafetera.estadoAgua());
	
	for(int i=0; i < 5; i++) {
		System.out.println("capsulas del producto "+ i + " " + cafetera.estadoCapsula(i));
		
	}
	System.out.println(cafetera.hayAguaCafetito(1));
	System.out.println(cafetera.hayVasos());
	System.out.println(cafetera.hayCapsula(1));
	*/
	
	


	
	
		
		
	}

}
