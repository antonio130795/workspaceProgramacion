package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EjArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int suma = 0;
		//array list
		ArrayList<Integer> numeros = new ArrayList<>();
		//10 datos
		System.out.println("indica el tamaño del array");
		int tamanno = sc2.nextInt();

		for (int i=0; i<tamanno;i++) {
			System.out.println("Introduce el dato " + i);
			int numero = sc.nextInt();
			numeros.add(numero);
		}
		System.out.println(numeros);
		
		//mayormenor
		for(int i=0; i<tamanno;i++) {
			
			if(numeros.get(i) > max) {
				max = numeros.get(i);
				
			}
			if(numeros.get(i) < min)
				min = numeros.get(i);
			
		}
		/*
		 * si ponemos la comparacion asi hacemos las 2 comprobasciones simpre
		 * para poder usar un continue min y max tiene que ser el primer
		 * valor del arraylist
		 */
		System.out.println("mayor " + max + " menor " + min);
		//valor medio
		//integer va apuntando a cada posicion del array
		//si el array es [1,5,7] integer primero es 1, luego pasa a 5 y luego a 7
		for (Integer integer : numeros) {
			suma += integer;
		}
		System.out.println("valor medio " + 1.0*suma/tamanno);
		//asi tambien muestra el array
		numeros.forEach(System.out::println);
		
	}
	

}
