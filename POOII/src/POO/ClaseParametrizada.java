package POO;

import java.util.ArrayList;
import java.util.List;

public class ClaseParametrizada <T> {

	private List<T> lista = new ArrayList<>();

	//añadir cadenas a la lista
	public void addItem(T item) {
		lista.add(item);
	}
	//localizamos un objeto de la lista segun posicion
	public T obtenerItemPorPosicion(int posicion) {
		if(posicion < lista.size())
			return lista.get(posicion);
		else
			return null;
	}
	
	public List<T> getLista() {
		return lista;
	}
	public void setLista(List<T> lista) {
		this.lista = lista;
	}
}
