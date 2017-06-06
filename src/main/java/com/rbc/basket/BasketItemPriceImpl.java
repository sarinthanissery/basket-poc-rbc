package com.rbc.basket;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class BasketItemPriceImpl.
 */
public class BasketItemPriceImpl implements BasketItemPrice {

	/** The item to price map. */
	private final Map<String, Double> itemToPriceMap;

	/**
	 * Instantiates a new basket item price impl.
	 *
	 * @param itemToPriceMap the item to price map
	 */
	public BasketItemPriceImpl(final Map<String, Double> itemToPriceMap) {
		this.itemToPriceMap = new HashMap<String, Double>();
		this.itemToPriceMap.putAll(itemToPriceMap);
	}

	/* (non-Javadoc)
	 * @see com.rbc.basket.BasketItemPrice#getPriceForItem(java.lang.String)
	 * get the price for items based on the input passed
	 */
	public double getPriceForItem(final String item) throws BasketItemsException {
		if (item == null) {
			throw new IllegalArgumentException("Item cannot be null");
		}
		if (itemToPriceMap.containsKey(item)) {
			return itemToPriceMap.get(item);
		}
		throw new BasketItemsException("Could not find price for item: " + item);
	}
}
