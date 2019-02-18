package Usuario;

import java.util.Scanner;

public class TestUsuario {

	public static void main(String[] args) {
		System.out.println("Introduce login y password");
		Scanner sc = new Scanner(System.in);
		String login = sc.next();
		Usuario usuario = new Usuario(login);
		int password = sc.nextInt();
		sc.close();
		if(usuario.getPassword() == password){
			System.out.println("contraseña correcta");
			
		}else {
			
			System.out.println("contraseña incorrecta");
		}
	}
		

}
