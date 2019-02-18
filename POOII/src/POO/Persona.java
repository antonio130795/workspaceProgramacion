package POO;

import java.security.Permissions;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

	//encapsulamiento
	private String nombre;
	private String dni;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + "]"
				+ calcularAnnosTranscurridos(fechaNacimiento);
	}
	
	//calcular edad
	public static int calcularAnnosTranscurridos(LocalDate fechaCalcular) {
		Period periodoTiempo = Period.between(LocalDate.now(), fechaCalcular);
		return -periodoTiempo.getYears();
		
	}
	
	//validar dni
	
	public static boolean validarDNI(String dniAValidar) {
		//clase local que nos va a devolder un dni con su letra correcta
		if(!dniAValidar.matches("^[0-9]{8}[a-zA-Z]$")) {
			return false;
		}
		class Dni{
			private String dniSinLetra;

			public Dni(String dniSinLetra) {
				this.dniSinLetra = dniSinLetra;
			}
			
			public String generarDNIConLetra() {
				
			          String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
			          int modulo = Integer.parseInt(dniSinLetra)%23;
			          char letra =caracteres.charAt(modulo);
			          return dniSinLetra + letra;
			}
		}
		Dni dni = new Dni(dniAValidar.substring(0, dniAValidar.length()-1));
		return dniAValidar.equalsIgnoreCase(dni.generarDNIConLetra());
	}
//	public static void main(String[] args) {
//		Persona p = new Persona("Antonio", "11111111h", LocalDate.parse("2000-10-10"));
//		System.out.println(p);
//		System.out.println(validarDNI(p.getDni()));
//	}
	
}
