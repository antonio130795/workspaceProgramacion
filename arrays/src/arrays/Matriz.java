package arrays;

public class Matriz {
	public static void main(String[] args) {
	
		int filas = 3;
		int columnas = 4;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[][] matriz = new int[filas][columnas];
		
		//rellenar array
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				
				matriz[i][j]=(int) (100 * Math.random());
			}
		}
		//imprimir array
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				
				System.out.printf(" %2d ",matriz[i][j]);
				
			}
			System.out.printf("%n");
		}
		//ver maximo y minimo
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				if(matriz[i][j] > max) {
					max = matriz[i][j];
					continue;
				}
				if(matriz[i][j] < min)
					min = matriz[i][j];
			}
			
		}
		
		System.out.println("minimo " + min + " maximo " + max);
		
	}
}
