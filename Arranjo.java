/**
 * 
 */
package arranjoExercicio;

/**
 * @author kassiocarvalho
 *
 *
 */
public class Arranjo {

	public Integer menor() {
		// TODO Auto-generated method stub
		Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
		int menor = 0;
		
		for (int i = 0; i < a.length; i++)
			if (menor<a[i])
				menor = a[i];
			return menor;
		
	}
