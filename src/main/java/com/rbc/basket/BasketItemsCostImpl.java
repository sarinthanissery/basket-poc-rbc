package com.rbc.basket;

import java.util.HashMap;
import java.util.Map;


/**
 * The Class BasketItemsCostImpl.
 */
public class BasketItemsCostImpl implements BasketItemsCost{
	

	/* (non-Javadoc)
	 * @see com.rbc.basket.BasketItemsCost#calculateCost()
	 * Calculate the cost from the values entered
	 */
	public double calculateCost() throws BasketItemsException {		
		final BasketItemPrice itemPrice = new BasketItemPriceImpl(new HashMap<String, Double>() {
			{
				put("Bananas", 2.0);
				put("Apples", 3.0);
				put("Lemons", 0.5);
				put("Peaches", 1.5);
				put("Oranges", 1.25);

			}
		});		
		final BasketReader inputItems = new BasketReaderImpl();
		final BasketItemImpl basket = inputItems.getBasket();
		final double finalCost = getFinalCost(itemPrice, basket);
		System.out.println(String.format("The total cost is: $%.2f", finalCost));
		return finalCost;
				
	}
	
	/* (non-Javadoc)
	 * @see com.rbc.basket.BasketItemsCost#getFinalCost(com.rbc.basket.BasketItemPrice, com.rbc.basket.BasketItemImpl)
	 */
	public double getFinalCost(BasketItemPrice itemPrice,BasketItemImpl basket) throws BasketItemsException {
		double total = 0.0;
		System.out.println("Calculating the total cost:");
		System.out.println("items in your cart and total cost are:");
		for (final Map.Entry<String, Integer> items : basket.getAllBasketItems().entrySet()) {
			total += itemPrice.getPriceForItem(items.getKey()) * items.getValue();
			System.out.println(String.format("%s: $%.2f (%d items)", items.getKey(), itemPrice.getPriceForItem(items.getKey()),
					items.getValue()));
		}
		
		return total;
	}

}
