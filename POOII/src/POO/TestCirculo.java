package POO;

public class TestCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1 = new Circulo(12.3);
		Circulo c2 = new Circulo(10);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.printf("Radio %.2f%n",c1.getRadio());
		System.out.printf("Longitud de circunferencia %.2f%n", c1.longitudCircunferencia());
		System.out.printf("Radio %.2f%n",c2.getRadio());
		System.out.printf("Longitud de circunferencia %.2f%n", c2.longitudCircunferencia());
		System.out.printf("Area del firculo mayor %.2f%n",Circulo.calcularAreaCirculoMayor(c1, c2));
		
		System.out.printf("Numero de circulos creados %d%n", Circulo.numeroCirculos ); //forma correcta
		System.out.printf("Numero de circulos creados 2º forma de sacarlo %d%n", c1.numeroCirculos); // otra forma pero no se debe usar
		
		
	}

}
