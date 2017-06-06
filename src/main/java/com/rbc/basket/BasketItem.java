package com.rbc.basket;

import java.util.Map;

/**
 * The Interface BasketItem.
 */
public interface BasketItem {

	/**
	 * Adds the basket item.
	 *
	 * @param item the item
	 * @param quantity the quantity
	 */
	void addBasketItem(final String item, final int quantity);
	
	/**
	 * Gets the all basket items.
	 *
	 * @return the all basket items
	 */
	Map<String, Integer> getAllBasketItems();
}
