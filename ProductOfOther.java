/**
 * Returns a list of products of other than itself
 * Eg. [1, 4, 6, 2] => [4*6*2, 1*6*2, 1*4*2, 1*4*6]
 * 
 * The trick is to store two product arrays - one cumulative product to left and another cumulative product to right.
 * You cannot use division
 * 
 * @author sarunapu
 *
 */
public class ProductOfOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] l = new int[] {2, 4, 5, 3} ;
		int [] prod = productOfOther(l);
		for (int i = 0; i < prod.length; i++) System.out.println(prod[i]);
	}
	
	/**
	 * PreConditions: length of intArray >= 2
	 * @param intArray
	 * @return
	 */
	public static int[] productOfOther(int [] intArray) {
		int len = intArray.length;
		int lowProd[] = new int[len];
		int highProd[] = new int[len];
		int prod[] = new int[len];
		
		lowProd[0] = 1;
		highProd[len-1] = 1;
		for (int i = 0; i < len; i++) {
			if (i > 0) lowProd[i] = intArray[i-1] * lowProd[i-1];
			int k = len - i - 1;
			if (k < len-1) highProd[k] = highProd[k+1] * intArray[k+1];
		}
		
		for (int i = 0; i < len; i++) {
			prod[i] = highProd[i] * lowProd[i];
		}
		
		return prod;
	}
}
