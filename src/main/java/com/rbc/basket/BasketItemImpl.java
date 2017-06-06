package com.rbc.basket;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class BasketItemImpl.
 */
public class BasketItemImpl implements BasketItem {

	/** The item to quantity map. */
	private final Map<String, Integer> itemToQuantityMap = new HashMap<String, Integer>();

	/* (non-Javadoc)
	 * @see com.rbc.basket.BasketItem#addBasketItem(java.lang.String, int)
	 * Add the user input to the map
	 */
	public void addBasketItem(final String item, final int quantity) {
		int newCount = quantity;
		if (itemToQuantityMap.containsKey(item)) {
			final int currentCount = itemToQuantityMap.get(item);
			newCount += currentCount;
		}
		itemToQuantityMap.put(item, newCount);
	}

	/* (non-Javadoc)
	 * @see com.rbc.basket.BasketItem#getAllBasketItems()
	 * get all the items in the basket
	 */
	public Map<String, Integer> getAllBasketItems() {
		final Map<String, Integer> toReturn = new HashMap<String, Integer>();
		toReturn.putAll(itemToQuantityMap);
		return toReturn;
	}

}
