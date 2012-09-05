public class ShoppingCart {
/* 
 * ShoppingCart.java
 * Moves ShoppingCarts from stack to stack
 *
 */

	public static void main(String args[]) {
		int[] rows = {3, 14, 15, 9, 2};

		
		// this draws all the ShoppingCarts to the console
		System.out.println("----------------------");
		for(int i = 0; i<rows.length; i++) {
			for(int j = 0; j < rows[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}
}
