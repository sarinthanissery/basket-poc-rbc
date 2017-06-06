package com.rbc.basket;

/**
 * The Interface BasketItemsCost.
 */
public interface BasketItemsCost {

	/**
	 * Calculate cost.
	 *
	 * @throws BasketItemsException the basket items exception
	 */
	double calculateCost() throws BasketItemsException;
	 
 	/**
 	 * Gets the final cost.
 	 *
 	 * @param itemPrice the item price
 	 * @param basket the basket
 	 * @return the final cost
 	 * @throws BasketItemsException the basket items exception
 	 */
 	double getFinalCost(BasketItemPrice itemPrice,BasketItemImpl basket) throws BasketItemsException;
	
}
