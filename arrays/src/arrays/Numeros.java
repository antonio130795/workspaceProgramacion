package arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//introducir valores
		//mejor el tamaño con una variable por si cambia 
		int[] arrayNumeros = new int[5];
		int valor = 0;
		int mayor = Integer.MIN_VALUE;//valor minimo de int
		//definimos fuera
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0; i < 5; i++) {
			System.out.println("Introduce un numero");
			
			//sc = new Scanner(System.in);
			int numero = sc.nextInt();
			
			arrayNumeros[i]= numero;
			valor += numero;
			
		}
		/*
		
		System.out.println(Arrays.toString(arrayNumeros));
		Esto nos enseña lo que hay dentro del array
		
		*/
		//cerramos aqui por que ya no se va a usar mas
		sc.close();
		
		//valor medio y mayor
		
		for(int i=0; i<5 ; i++) {
			
			if (arrayNumeros[i] > mayor) {
				
				mayor = arrayNumeros[i];
			}
		}
		
		System.out.println("Valor medio es " + valor/5);
		System.out.println("Valor mayor es " + mayor);
	}
	
	//Arrays.sort(arrayNumeros) ordena el array de menor a mayor
		
}
