
/**
 * Given a list of numbers, find the max increase from any of the previous numbers.
 * This should be an O(n) algorithm
 * For examples, given 23, 42, 24, 52, 15, 32, 87, 34
 * This class has a method that will determine max increase - which is 87 - 15 = 72
 * @author sarunapu
 *
 */
public class MaxIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] l = new int[] {23, 42, 52, 15, 32, 87, 34} ;
		int x = maxIncrease(l);
		System.out.println(x);
	}
	
	/**
	 * PreConditions: length of intArray >= 2
	 * @param intArray
	 * @return
	 */
	public static int maxIncrease(int [] intArray) {
		int best = Integer.MIN_VALUE;
		int minVal = intArray[0];
		
		for (int i = 1; i < intArray.length; i++) {
			int current = intArray[i];
			if (minVal > current) minVal = current;
			int currentBest = current - minVal;
			if (currentBest > best) best = currentBest;
		}
		return best;
	}

}
