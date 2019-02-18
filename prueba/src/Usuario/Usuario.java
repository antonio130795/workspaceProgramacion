package Usuario;

public class Usuario {
	//atributos
	private String login;
	private int password; //nº aleatorio del 0 al 9
	//constructores
	public Usuario(String login) {
		this.login = login;
		this.password = (int) (Math.random() * 10);
	}
	//getter
	public String getLogin() {
		return login;
	}
	
	public int getPassword() {
		return password;
	}
	//setter
	public void setPassword(int password) {
		this.password = password;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}
