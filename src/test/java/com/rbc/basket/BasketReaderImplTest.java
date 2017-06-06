package com.rbc.basket;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.*;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import org.junit.Rule;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class BasketReaderImplTest.
 */
public class BasketReaderImplTest {

	/** The in. */
	@Rule
	public final TextFromStandardInputStream in = emptyStandardInputStream();

	/**
	 * Gets the basket items.
	 *
	 * @return the basket items
	 * @throws Exception the exception
	 */
	@Test

	public void getBasketItems() throws Exception {

		in.provideText("1 1 6");

		final BasketReaderImpl reader = new BasketReaderImpl();

		Map<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("Bananas", 1);

		assertThat(reader.getBasket().getAllBasketItems(), is(expected));

	}

	/**
	 * Gets the negative value on items.
	 *
	 * @return the negative value on items
	 * @throws Exception the exception
	 */
	@Test
	public void getNegativeValueOnItems() throws Exception {

		in.provideText("1 0 6");

		final BasketReaderImpl reader = new BasketReaderImpl();

		Map<String, Integer> expected = new HashMap<String, Integer>();

		assertThat(reader.getBasket().getAllBasketItems(), is(expected));

	}

}
