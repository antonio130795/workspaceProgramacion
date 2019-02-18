package String;

public class ClaveSegura {

	String clave;

	public void setClaveSegura(String clave) {
		this.clave = clave;
	}
	
	
	public String getClave() {
		return clave;
	}

	public boolean esClaveSegura() {
		return tieneAlMenos1CaracterAlfanumerico() && tieneAlMenos1LetraMayuscula() && tieneAlMenos1LetraMinuscula()
				&& tieneAlMenos1numero() && tieneAlMenos8Caracteres();
	}
	private boolean tieneAlMenos8Caracteres() {
		
		return clave.length() > 8;
	}
	
	private boolean tieneAlMenos1numero() {
		return clave.matches("^.*[0-9].*$");
	}
	private boolean tieneAlMenos1LetraMayuscula() {
		//return clave.matches("^.*[A-ZÑÁÉÍÓÚÜ]");
		char character;
		boolean resultado = false;
		for (int i = 0; i < clave.length(); i++) {
			if(Character.isUpperCase(clave.charAt(i))) {
				return true;
			}
		}
		return resultado;
	}
	private boolean tieneAlMenos1LetraMinuscula() {
		
		return clave.matches("^.*[a-zñáéíóúü].*$");
	}
	private boolean tieneAlMenos1CaracterAlfanumerico() {
		char character;
		boolean resultado = false;
		for (int i = 0; i < clave.length(); i++) {
			if(Character.isLetterOrDigit(clave.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	//String final FUENTECARACTERES = ”aAbBcCdDeEfFgGhHiIjJkKlLm-MnNñNoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}”;
	
}      
