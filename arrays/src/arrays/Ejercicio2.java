package arrays;

import java.util.Arrays;

public class Ejercicio2 {

		/*
		 * Crea una clase denominada Colecciones que realice:
		   1)Declare dos arrays de tipo int de 10 valores. 
		   2)Usando un bucle, rellena uno de ellos con valores fijos (ejemplo: 3)
		   3)El otro se rellena   tambien de forma automatica usando la clase Arrays y el metodo fill 
		   4)Defie un metodo que se encargue de mostrar los datos de los dos arrays, de manera
		   que se muestra por linea valores de igual posicion, es decir el primer  elemento  del  primer
		   array y  el  primero  del  segundo array en  la misma linea, posteriormente
		   se hace un salto de linea y asi con el resto de elementos. 
		*/
		private static final int TAMANNO = 10;
		private int[] array1 = new int[TAMANNO];
		private int[] array2 = new int[TAMANNO];
		
		//constructor
		public Ejercicio2(int numero) {
			for (int i = 0; i < array1.length; i++) {
				array1[i] = numero;
			}
			Arrays.fill(array2, numero);
		}
		
		public int[] getArray1() {
			return array1;
		}
		
		public int[] getArray2() {
			return array2;
		}
		
		public void setArray1(int[] array1) {
			this.array1 = array1;
		}
		
		public void setArray2(int[] array2) {
			this.array2 = array2;
		}
		
		public void sacarArray() {
			for (int i = 0; i < TAMANNO; i++) {
				 System.out.printf("%d		%d%n", array1[i], array2[i]);
			}			
		}
}
