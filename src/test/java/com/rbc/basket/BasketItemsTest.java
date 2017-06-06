package com.rbc.basket;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * Tests the Basket class.
 * 
 * @author verun
 *
 */
public class BasketItemsTest {

	/**
	 * Gets the cost for item.
	 *
	 * @return the cost for item
	 */
	@Test
	public void getCostForItem() {
		final BasketItemImpl bi = new BasketItemImpl();
		bi.addBasketItem("banana", 2);
		bi.addBasketItem("lemon", 3);

		final int fc = bi.getAllBasketItems().get("banana");
		assertTrue(Integer.compare(2, fc) == 0);

	}

	/**
	 * Gets the cost for duplicate item.
	 *
	 * @return the cost for duplicate item
	 */
	@Test
	public void getCostForDuplicateItem() {
		final BasketItemImpl bi = new BasketItemImpl();
		bi.addBasketItem("banana", 2);
		bi.addBasketItem("banana", 4);
		bi.addBasketItem("lemon", 3);

		final int fc = bi.getAllBasketItems().get("banana");
		assertTrue(Integer.compare(6, fc) == 0);

	}

}
