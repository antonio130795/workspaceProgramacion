package examen;
/**
 * 
 * @author Antonio Jiménez Arias
 *
 */
public class Figura4Lados1{
	/** Metodo que dice el tipo de figura
	 * @param lado1
	 * @param lado2
	 * @return Una cadena cuadrado o rectangulo
	 **/
	public static String obtenerTipoFigura(int lado1, int lado2){
		
		if(lado1==lado2) {
			
			return "Cuadrado";
		}else
			return "Rectangulo";
	}
	
	public static int calcularPerimetro(int lado1, int lado2) {
		int resultado;
		resultado = lado1 + lado1 + lado2 + lado2;
		return resultado;
	}
	public static int calcularArea(int lado1, int lado2) {
		
		return lado1*lado2;
	}
	public static float calcularDiagonal(int lado1, int lado2) {
		
		return (float)Math.sqrt(lado1*lado1/lado2*lado2);
	}
	
}