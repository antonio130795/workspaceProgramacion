package arrays;

import java.util.Arrays;

public class TestEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejercicio2 colecciones = new Ejercicio2(3);
		int[] array1 = colecciones.getArray1();
		int[] array2 = colecciones.getArray2();
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		colecciones.sacarArray();
	}

}
