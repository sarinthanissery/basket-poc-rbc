package com.rbc.basket;

import static org.junit.Assert.assertTrue;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.util.HashMap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

// TODO: Auto-generated Javadoc
/**
 * The Class BasketItemsCostImplTest.
 */
public class BasketItemsCostImplTest {

	/** The in. */
	@Rule
	public final TextFromStandardInputStream in = emptyStandardInputStream();

	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 * @throws BasketItemsException the basket items exception
	 */
	@Test
	public void getCost() throws BasketItemsException {
		final BasketItemsCostImpl toTest = new BasketItemsCostImpl();

		final BasketItemImpl b = new BasketItemImpl();
		b.addBasketItem("one", 2);
		b.addBasketItem("two", 3);

		final BasketItemPriceImpl ipp = new BasketItemPriceImpl(new HashMap<String, Double>() {
			{
				put("one", 0.5);
				put("two", 0.25);

			}
		});

		final double fc = toTest.getFinalCost(ipp, b);
		assertTrue(Double.compare(1.75, fc) == 0);

	}

	/**
	 * Gets the total cost.
	 *
	 * @return the total cost
	 * @throws BasketItemsException the basket items exception
	 */
	@Test
	public void getTotalCost() throws BasketItemsException {
		in.provideText("1 1 6");
		final BasketItemsCostImpl cl = new BasketItemsCostImpl();		
		
		final double fc = cl.calculateCost();
		assertTrue(Double.compare(2.0, fc) == 0);


	}

}
