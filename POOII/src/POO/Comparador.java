package POO;

import java.util.Comparator;

public class Comparador implements Comparator<Float> {
	//comparador de mayor a menos de float hasta la segunda cifra decimal 
	@Override
	public int compare(Float arg0, Float arg1) {
		// TODO Auto-generated method stub
		return (int) -(arg0 * 100 - arg1 * 100);
	}

	
}
