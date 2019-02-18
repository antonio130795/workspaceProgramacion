package examen;

import java.util.Scanner;

public class TesteFigura4Lados {

	public static void main(String[] args) {

		System.out.println("introduce los valores de una figura regular de 4 lados");
		Scanner sc = new Scanner(System.in);
		
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		sc.close();
		if(lado1<=0 || lado2 <=0){
			System.out.println("lados no permitidos");
			return;
		}
		String figura = Figura4Lados1.obtenerTipoFigura(lado1, lado2);
		if(figura == "Cuadrado"){
			//System.out.printf(" %s de lado $d, de perimetro %d, de area %d y diagonal %.2f"
			//	,figura,lado1, Figura4Lados1.calcularPerimetro(lado1, lado2),
			//	Figura4Lados1.calcularArea(lado1, lado2),
			//	Figura4Lados1.calcularDiagonal(lado1, lado2));
			System.out.println("lado " + lado1 + "perimetro" + Figura4Lados1.calcularPerimetro(lado1, lado2) + "area " + Figura4Lados1.calcularArea(lado1, lado2) + "diagonal" + Figura4Lados1.calcularPerimetro(lado1, lado2));
		}else{
			System.out.printf("%s de lado $d, de perimetro %d, de area %d y diagonal %.2f"
					,figura,lado1 , Figura4Lados1.calcularPerimetro(lado1, lado2),
					Figura4Lados1.calcularArea(lado1, lado2),
					Figura4Lados1.calcularDiagonal(lado1, lado2));
		}
		
	}
	
}
