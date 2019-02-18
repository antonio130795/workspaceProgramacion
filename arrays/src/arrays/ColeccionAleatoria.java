package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ColeccionAleatoria {

	private static final int TAMANNO = 100;
	private int[] array1 = new int[TAMANNO]; 

	//constructor
	public ColeccionAleatoria() {

		for (int i = 0; i < TAMANNO; i++) {
			array1[i] = (int) (1000 * Math.random());
		}
	}

	//valor medio
	public float ValorMedio() {
		float media = 0;
		for (int i : array1) {
			media += i;
		}
		return (float) (media/(1.0 * TAMANNO));
	}
		
	public float Desviacion() {
		//mirar mejor la formula
		return (float) Math.sqrt(ValorMedio());
	}
	
	public void ArrayOrdenado() {
		int indice = 0;
		int[] arrayOrdenado = new int[TAMANNO];
		for (int i : array1) {
			arrayOrdenado[indice] = i;
			indice++;
		}
		Arrays.sort(arrayOrdenado);
		System.out.println(Arrays.toString(arrayOrdenado));
		
	}
	
	public void NumerosPares() {
		int contador = 0;
		for (int i : array1) {
			if(i % 2 == 0)
				contador++;
		}
		int[] arrayPares = new int[contador];
		int indice = 0;
		for (int i : array1) {
			if(i % 2 == 0) {
				arrayPares[indice] = i;
				indice++;
			}
		}
		System.out.println(Arrays.toString(arrayPares));

	}
	public void NumerosPares2() {
		
		ArrayList numeros = new ArrayList();
		for (int i : array1) {
			if(i % 2 == 0)
				numeros.add(i);
		}
		System.out.println(numeros);
	}
	
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	
	public void MinyMax() {
		for (int i : array1) {
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		System.out.println("max " + max + " min " + min);
	}

	public int[] getArray1() {
		return array1;
	}

}


