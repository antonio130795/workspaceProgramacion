package POO;

import java.util.ArrayList;
import java.util.List;

public class ClaseCadenas {
	
	private List<String> lista = new ArrayList<>();

	//añadir cadenas a la lista
	public void addCadenas(String cadena) {
		lista.add(cadena);
	}
	//localizamos un objeto de la lista segun posicion
	public String obtenerCadenaPorPosicion(int posicion) {
		if(posicion < lista.size())
			return lista.get(posicion);
		else
			return null;
	}
	
	public List<String> getLista() {
		return lista;
	}
	public void setLista(List<String> lista) {
		this.lista = lista;
	}
}

