
package com.rbc.basket;

/**
 * The Interface BasketItemPrice.
 */
public interface BasketItemPrice {

	/**
	 * Gets the price for item.
	 *
	 * @param item the item
	 * @return the price for item
	 * @throws BasketItemsException the basket items exception
	 */
	double getPriceForItem(String item) throws BasketItemsException;
}
