/**
 * Given two numbers, determine the number of bits to swap to get one number from the other.
 * 
 * @author sarunapu
 *
 */
public class BitCounter {

	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("Usage: java BitCounter <firstNumber> <SecondNumber>");
			return;
		}
		int x = Integer.valueOf(args[0]);
		int y = Integer.valueOf(args[1]);
		
		int  z = x ^ y; // perform XOR of the two numbers
		System.out.println(countBits(z));
	}
	
	/**
	 * Count the number of bits in the number
	 * @param x
	 * @return
	 */
	public static  int countBits(int x) {
		int count = 0;
		while (x != 0) {
			if ((x & 1) == 1) count++;
			x >>>= 1; // >>> will handle negative numbers.  >> shift will not.
		}
		return count;
	}
}
