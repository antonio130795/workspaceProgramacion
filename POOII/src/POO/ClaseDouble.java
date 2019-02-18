package POO;

import java.util.ArrayList;
import java.util.List;

public class ClaseDouble {

	private List<Double> lista = new ArrayList<>();

	//añadir cadenas a la lista
	public void addNumero(Double numero) {
		lista.add(numero);
	}
	//localizamos un objeto de la lista segun posicion
	public Double obtenerNumeroPorPosicion(int posicion) {
		if(posicion < lista.size())
			return lista.get(posicion);
		else
			return null;
	}
	
	public List<Double> getLista() {
		return lista;
	}
	public void setLista(List<Double> lista) {
		this.lista = lista;
	}

}
