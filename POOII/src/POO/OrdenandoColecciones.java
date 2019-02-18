package POO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenandoColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Float> listaNumeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			
			listaNumeros.add((float) (Math.random() * 100));

		}		
		System.out.println(listaNumeros);
		//ordenando colecciones
		Collections.sort(listaNumeros);
		System.out.println("Lista ordenada");
		System.out.println(listaNumeros);
		
		//creamos un objeto de la clase del comparador 
		Comparador comparador = new Comparador();
		Collections.sort(listaNumeros, comparador);
		System.out.println("lista ordenada de mayor a menor");
		System.out.println(listaNumeros);
	}

}
