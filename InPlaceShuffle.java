/**
 * In place shuffle:
 * Given a uniform random number generator, perform in place shuffle of an array 
 * 
 * @author sarunapu
 *
 */
public class InPlaceShuffle {
	double i = Math.random();
	
	
	public static void main(String [] args) {
		int [] x = {1,2,3,4,5,6,7,8 };
		shuffle(x);
		for (int i = 0; i < x.length; i++) System.out.print(x[i] + ",");
	}
	
	public static void shuffle(int[] x) {
		int n = x.length;
		for (int i = n-1; i >= 0; i--) {
			int k = getRandom(0, i);
			int temp = x[k];
			x[k] = x[i];
			x[i] = temp;
		}
	}
	
	public static int getRandom(int a, int b) {
		return a + (int) ((b - a + 1) * Math.random());
		
		
		
	}

}
