package POO;

public class TestCasesParametrizadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseCadenas cCadenas = new ClaseCadenas();
		cCadenas.addCadenas("Hola");
		cCadenas.addCadenas("Pepe");
		cCadenas.addCadenas("Fin");
		System.out.println(cCadenas.obtenerCadenaPorPosicion(0));
		System.out.println(cCadenas.obtenerCadenaPorPosicion(12));
		System.out.println(cCadenas.getLista());
		
		ClaseDouble cDouble = new ClaseDouble();
		cDouble.addNumero(12.2);
		cDouble.addNumero((double) 10);
		cDouble.addNumero(11.6);
		System.out.println(cDouble.obtenerNumeroPorPosicion(0));
		System.out.println(cDouble.obtenerNumeroPorPosicion(10));
		System.out.println(cDouble.getLista());
		
		ClaseParametrizada<Integer> cParametrizada = new ClaseParametrizada<>();
		cParametrizada.addItem(3);
		cParametrizada.addItem(5);
		cParametrizada.addItem(-96);
		System.out.println(cParametrizada.obtenerItemPorPosicion(0));
		System.out.println(cParametrizada.obtenerItemPorPosicion(10));
		System.out.println(cParametrizada.getLista());
		
		ClaseParametrizada<Short> cParametrizada2 = new ClaseParametrizada<>();
		cParametrizada2.addItem((short) 3);
		cParametrizada2.addItem((short) 5);
		cParametrizada2.addItem((short) -96);
		System.out.println(cParametrizada2.obtenerItemPorPosicion(0));
		System.out.println(cParametrizada2.obtenerItemPorPosicion(10));
		System.out.println(cParametrizada2.getLista());
		
		
	}

}
