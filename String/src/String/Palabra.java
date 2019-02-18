package String;
/**
 * @author matinal
 *
 */
public class Palabra {

	private String contenido;

	public Palabra(String contenido) {
		this.contenido = contenido;
	}
	public int obtenerNumeroLetras() {
		return contenido.length();
	}
	
	public boolean empiezaPorVocal() {
		
		return contenido.toLowerCase().matches("^[aeiouáéíóú].*$");
	}
	
	public boolean acabaPorVocal() {
		
		return contenido.toLowerCase().matches("^.*[aeiouáéíóú]$");
	}
	
	public int obtenerNumeroDeVocales() {
		int contador = 0;
		
		for (int i = 0; i < contenido.length(); i++) {
			//matches no se puede hacer con un tipo primitivo char que es lo que devueve charAt
			//por lo tanto necesitamos un string, para conseguirlo sin cambiar los datos lo concatenamos
			//con una cadena vacia y ya lo tenemos
			if(("" + contenido.toLowerCase().charAt(i)).matches("[aeiouáéíóú]") ) {
				contador++;
			}
		}
		return contador;
	}
	
	public boolean contieneH() {
		return contenido.toLowerCase().matches("h");
	}
	
	public boolean esPalindromo() {
		
		StringBuilder stringBuilder = new StringBuilder(contenido);
		StringBuilder stringBuilderReverse = stringBuilder.reverse();
		String contenidoReverse = stringBuilderReverse.toString();
		return contenido.equalsIgnoreCase(contenidoReverse);
		
	}
	
	public boolean sonIguales(String palabra) {
		
		return contenido.equalsIgnoreCase(palabra);
	}
}
