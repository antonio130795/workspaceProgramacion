package arrays;

import java.util.Arrays;

public class TestColeccionAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColeccionAleatoria coleccion = new ColeccionAleatoria();
		int[] array1 = coleccion.getArray1();
		System.out.println(Arrays.toString(array1));
		float media = coleccion.ValorMedio();
		System.out.println("valor medio de los datos del array " + media);
		float desviacion = coleccion.Desviacion();
		System.out.println("la desviacion es " + desviacion);
		System.out.println("Array ordenado de menos a mayor");
		coleccion.ArrayOrdenado(); 
		coleccion.MinyMax();
		System.out.println("Numeros pares del array");
		coleccion.NumerosPares();
		System.out.println("Numeros pares con arraylist");
		coleccion.NumerosPares2();
		
		

	}

}
