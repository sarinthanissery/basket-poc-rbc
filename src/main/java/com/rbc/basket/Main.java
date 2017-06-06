
package com.rbc.basket;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws BasketItemsException the basket items exception
	 */
	public static void main(final String[] args) throws BasketItemsException {

		final BasketItemsCost bic = new BasketItemsCostImpl();
		bic.calculateCost();

	}

}
