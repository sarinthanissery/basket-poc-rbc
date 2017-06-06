package com.rbc.basket;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Class BasketReaderImpl.
 */
public class BasketReaderImpl implements BasketReader {

	/** The items. */
	private final String[] items = { "Bananas", "Apples", "Oranges", "Peaches", "Lemons" };

	/* (non-Javadoc)
	 * @see com.rbc.basket.BasketReader#getBasket()
	 */
	public BasketItemImpl getBasket() {
		final BasketItemImpl basket = new BasketItemImpl();
		final Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("Enter the number (1 - 6) of the item to purchase: ");
				System.out.println("1. Bananas");
				System.out.println("2. Apples");
				System.out.println("3. Oranges");
				System.out.println("4. Peaches");
				System.out.println("5. Lemons");
				System.out.println("6. Exit");
				final int choice = getUserInput(sc);
				if (choice < 1 || choice > 6) {
					System.out.println("Please enter a vaid item");
				} else if (choice == 6) {
					break;
				} else {
					System.out.println("Enter quantity: ");
					final int quantity = getUserInput(sc);

					if (quantity <= 0) {
						System.out.println("Quantity must be positive");
					} else {
						basket.addBasketItem(items[choice - 1], quantity);
						System.out.println("Item accepted, you may enter more items to purchase or exit...");
					}

				}
			}
		} finally {
			sc.close();
		}

		return basket;
	}

	/**
	 * Gets the user input.
	 *
	 * @param sc the sc
	 * @return the user input
	 */
	public int getUserInput(final Scanner sc) {
		while (true) {
			try {
				final int n = sc.nextInt();
				return n;
			} catch (final InputMismatchException e) {
				System.out.println("Please enter a valid input");
				sc.nextLine();
			}
		}
	}
}
