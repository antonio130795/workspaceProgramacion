package POO;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo rectangulo4 = new Rectangulo(8.2,4.8);
		System.out.println(rectangulo4);
		
		
		Rectangulo rectangulo1 = new Rectangulo();
		System.out.println(rectangulo1);
		
		Rectangulo rectangulo2 = new Rectangulo(8,4);
		System.out.println(rectangulo2);
		
		Rectangulo rectangulo3 = new Rectangulo(6,2);
		System.out.println(rectangulo3);
		//metodo
		System.out.println(Rectangulo.numeroObjetos());
		//clase interna
		System.out.println(Rectangulo.NumeroObjetos.numeroObjetos());
		
		System.out.println(rectangulo2.areaRectangulo());
		System.out.println(rectangulo2.perimetroRectangulo());
		
	}

}
