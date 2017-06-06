package com.rbc.basket;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class BasketItemsPriceTest.
 */
public class BasketItemsPriceTest {

	/**
	 * Gets the items price.
	 *
	 * @return the items price
	 * @throws BasketItemsException the basket items exception
	 */
	@Test
	public void getItemsPrice() throws BasketItemsException {
		final BasketItemPriceImpl bip = new BasketItemPriceImpl(new HashMap<String, Double>() {
			{
				put("one", 0.5);
				put("two", 0.25);

			}
		});

		final double fc = bip.getPriceForItem("one");
		assertTrue(Double.compare(0.5, fc) == 0);

	}

	/**
	 * Gets the no items price check.
	 *
	 * @return the no items price check
	 * @throws BasketItemsException the basket items exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void getNoItemsPriceCheck() throws BasketItemsException {
		final BasketItemPriceImpl bip = new BasketItemPriceImpl(new HashMap<String, Double>() {
			{
				put("one", 0.5);
				put("two", 0.25);
			}
		});

		final double fc = bip.getPriceForItem(null);

	}

	/**
	 * Gets the non existing items price check.
	 *
	 * @return the non existing items price check
	 * @throws BasketItemsException the basket items exception
	 */
	@Test(expected = BasketItemsException.class)
	public void getNonExistingItemsPriceCheck() throws BasketItemsException {
		final BasketItemPriceImpl bip = new BasketItemPriceImpl(new HashMap<String, Double>() {
			{
				put("one", 0.5);
				put("two", 0.25);
			}
		});

		final double fc = bip.getPriceForItem("seven");

	}
}
