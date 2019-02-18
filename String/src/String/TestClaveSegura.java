package String;

import java.util.Scanner;

public class TestClaveSegura {
	
	final static String FUENTECARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLm-MnNñNoOpPqQrRsStTuUv"
			+ "VwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Indica la longitud maxima de la clave(maximo 1000)");
		Scanner sc = new Scanner(System.in);
		String sLongitudClave = sc.next();
		sc.close();
		if(!sLongitudClave.matches("[0-9]{1,3}") || sLongitudClave.charAt(0) == '0') {
			System.out.println("No es valido el dato");
			return;
		}
		int iLongitudDeClave = Integer.parseInt(sLongitudClave);
		System.out.println("tu clave va a tener una longutud " + iLongitudDeClave);
		//String posibleClave = "";
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < iLongitudDeClave; i++) {
			//System.out.println("caracter recivido " + obtenerCaracterAleatoriamente());
			//posibleClave += obtenerCaracterAleatoriamente();
			//hace una especie de array de caracteres
			stringBuilder.append(obtenerCaracterAleatoriamente());
		}
		//aqui pasa la especie de array a un string
		System.out.println(stringBuilder.toString());
	
	
	ClaveSegura claveSegura = new ClaveSegura();
	claveSegura.setClaveSegura(stringBuilder.toString()); 
	
	System.out.println("Es clave segura " + claveSegura.getClave() + " " + claveSegura.esClaveSegura());
	
	}
	public static char obtenerCaracterAleatoriamente() {
		
		int posicion = (int) (Math.random() * FUENTECARACTERES.length());
		return FUENTECARACTERES.charAt(posicion);
	}
}
