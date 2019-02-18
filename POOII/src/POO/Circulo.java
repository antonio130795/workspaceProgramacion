package POO;

public class Circulo {

	private double radio;
	public static double PI = 3.1416;
	public static int numeroCirculos = 0;

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public Circulo(double radio) {
		this.radio = radio;
		numeroCirculos++;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double longitudCircunferencia() {
		return 2 * PI * radio;
	}
	
	public static double calcularAreaCirculoMayor(Circulo c1, Circulo c2) {
		if(c1.getRadio() > c2.getRadio())
			return PI * Math.pow(c1.getRadio(), 2);
		else
			return PI * Math.pow(c2.getRadio(), 2);
	}
}
