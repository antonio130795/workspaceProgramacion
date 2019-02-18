package holamundo;

public class Cafetera{
	
	private int vasos;
	private float nivel_agua;
	private float consumibles[][]; //nºcapsulas, agua, temperatura, tiempo
	private float max_consumibles;



public Cafetera(int max_vasos, float max_nivel_agua, float numero_maximo_consumibles, float[][] rec){
	
	vasos = max_vasos;
	nivel_agua=max_nivel_agua;
	consumibles=new float[5][4];
	max_consumibles=numero_maximo_consumibles;
	recargaCafeteraInicial(rec); //metodo para cargar datos en la matriz rec 
								 //que luego van a ser los datos por defecto de nuestra
								 //matriz consumibles
	
	
	
	
}
//metodo para recargar consumibles con los datos que tiene la matriz recarga

public void recargaCafeteraInicial(float recarga[][]) {
	
	for(int i=0; i < max_consumibles; i++) {
		for(int j=0; j<4;j++){
			this.consumibles[i][j] = recarga[i][j];
		}
	}
}

//vamos a crear el metodo que introduce los valores por defecto de la matriz recarga 

public static float[][] pruebaRecarga(float m){
	
	float recarga[][] = new float[5][4];
	//capsulas
	for(int i=0; i<5; i++){
		recarga[i][0]= m;//no deberia ser igual al numero max de consumibles
	}
	
	//agua por capsula
	recarga[0][1]=0.15f;
	recarga[1][1]=0.2f;
	recarga[2][1]=0.25f;
	recarga[3][1]=0.3f;
	recarga[4][1]=0.25f;
	
	//temperatura
	recarga[0][2]=80f;
	recarga[1][2]=90f;
	recarga[2][2]=70f;
	recarga[3][2]=90f;
	recarga[4][2]=95f;
	
	//tiempo
	recarga[0][3]=8f;
	recarga[1][3]=9f;
	recarga[2][3]=7f;
	recarga[3][3]=9f;
	recarga[4][3]=9f;
	return recarga;
	
}

//metodo toString
//devuelve una cadena con la informacion de los consumibles

public String toString() {
	String aux = "Vasos " + vasos + " agua " + nivel_agua + "\n";
	
	for(int i=0; i < max_consumibles; i++) {
		aux= aux + "Capsula " + i + " tiene  " + consumibles[i][0] + "\n";
	}
	for(int i=0; i < max_consumibles; i++) {
		aux= aux + "nivel de agua necesario para la capsula es " + i + " es de " + consumibles[i][1] + "\n";
	}
	for(int i=0; i < max_consumibles; i++) {
		aux= aux + "Temperatura de la capsula " + i + " es de " + consumibles[i][2] + "\n";
	}
	for(int i=0; i < max_consumibles; i++) {
		aux= aux + "Tiempo de preparado de la capsula " + i + " es de " + consumibles[i][3] + "\n";
	}
	return aux;
}

public String devCafetera() {
String aux = "Vasos " + vasos + " agua " + nivel_agua + "\n";
	
	for(int i=0; i < max_consumibles; i++) {
		aux= aux + "Capsula " + i + " tiene  " + consumibles[i][0] + "\n";
	}
	return aux;
}

public int estadoVasos() {
	return vasos;
}

public float estadoAgua() {
	return nivel_agua;	
}

public float estadoCapsula(int capsula) {
	
	return consumibles[capsula][0];
}

//comprobar si hay agua
public boolean hayAguaCafetito(int cafe) {
	if(nivel_agua >= consumibles[cafe][1]) {
		return true;
	}else
		return false;
}
public boolean hayCapsula(int capsula) {
	if(consumibles[capsula][0] > 0) {
		return true;
	}else
		return false;
}
public boolean hayVasos() {
	if(this.vasos > 0) {
		return true;
	}else
		return false;
}





}//fin clase