package String;

import java.util.Scanner;

public class TestPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una palabra");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.next();
		Palabra p = new Palabra("amigo");
		System.out.println(p.obtenerNumeroLetras());
		System.out.println(p.empiezaPorVocal());
		System.out.println(p.acabaPorVocal());
		System.out.println(p.sonIguales(palabra));
	}
	

}
