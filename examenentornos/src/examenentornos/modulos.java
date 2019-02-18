package examenentornos;

import java.util.Scanner;

public class modulos {
	//funcion menu
	public static int menu() {
		
		
		System.out.println("");
		System.out.println("CÁLCULO DE AREAS");
		System.out.println("----------------");
		System.out.println("1.-Calcular el area del triangulo");
		System.out.println("2.-Calcular el area de un trapecio");
		System.out.println("3.-Calcular el area de un rectangulo");
		System.out.println("4.-Salir");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		
		return opcion;
	}
	//calcula area triangulo
	public static double triangulo(int base, int altura) {
		
		double area = (base * altura) / 2;
		return area;
	}
	//calcula area rectangulo
	public static double rectangulo(int base, int altura) {
		
		double area = base * altura;
		return area;
		
	}
	//calcula area trapecio
	public static double trapecio(int base1, int base2, int altura) {
		double mediana = (base1 * base2) / 2;
		double area = altura * mediana;
		return area;
		
	}
}
