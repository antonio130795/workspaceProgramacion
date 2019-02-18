package POO;

public class Rectangulo {
	
	double ancho = 1;
	double alto = 1;
	private static int numeroRectangulos = 0;
	
	

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}

	public Rectangulo() {
		numeroRectangulos++;
	}

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
		numeroRectangulos++;
	}
	
	public double areaRectangulo() {
		
		return ancho*alto;
	}
	
	public double perimetroRectangulo() {
		
		return ((ancho*2)+(alto*2));
	}

	public static int numeroObjetos() {
		return numeroRectangulos;
	}
	//clase interna 
	static class NumeroObjetos{
		
		public static int numeroObjetos() {
			return numeroRectangulos;
		}
	}
}
