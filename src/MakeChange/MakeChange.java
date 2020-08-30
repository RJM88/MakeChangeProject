package MakeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double change = 0, twenties = 0, tens = 0, fives = 0, ones = 0, itemPrice = 0, moneyReceived = 0;
		int quaters = 0, dimes = 0, nickles = 0, pennies = 0;
		boolean moreItems = true;

		do {
			// Asking for user how much the item is.
			System.out.print("How much is the item: $");
			itemPrice = kb.nextDouble();

			// How much did the customer give.
			System.out.print("How much did the customer give: $");
			moneyReceived = kb.nextDouble();

			// change will take moneyRecived - itemPrice.
			change = moneyReceived - itemPrice;

			// Will run moneyCheck method, checking on amount of money.
			moneyCheck(itemPrice, moneyReceived, change);

			/*
			 * The following if statements (10 - .01) will have a similar structure as the
			 * 20.00
			 */

			// 20.00
			if (change >= 20) { // if change is greater or equal to 20 statement will run.
				twenties = (change / 20); // change will divide by 20 then assign to "twenties".
				if ((int) twenties != 0) { // if "tens" does not equal 0 the statement will run.
					System.out.println("$20 x " + (int) twenties); // will display the string "$20 x" then the casted
																	// int value of twenties
					change = ((twenties * 20) - 20 + .001); // ((twenties * 20) - 20 + .001) will be assigned to
				}
			}

			// $10.00
			if (change >= 10) {
				tens = (change / 10);
				if ((int) tens != 0) {
					System.out.println("$10 x " + (int) tens);
					change = ((tens * 10) - 10 + .001);
				}
			}

			// $5.00
			if (change >= 5) {
				fives = change / 5;
				if ((int) fives != 0) {
					System.out.println("$5 x " + (int) fives);
					change = ((fives * 5) - 5 + .001);
				}
			}

			// $1.00;
			if (change >= 1) {
				ones = change / 1;
				if ((int) ones != 0) {
					System.out.println("$1 x " + (int) ones);
					change = ((ones % 1) * 1 + .001);
				}
			}

			// $0.25
			if (change >= .25) {
				quaters = (int) (change / .25);
				if ((int) quaters != 0) {
					System.out.println(".25c x " + (int) quaters);
					change = ((change - (quaters * .25)) + .001);
				}
			}

			// $0.10
			if (change >= .1) {
				dimes = (int) (change / .10);
				if ((int) dimes != 0) {
					System.out.println(".10c x " + (int) dimes);
					change = ((change - (dimes * .1)) + .001);
				}
			}
			// $0.05
			if (change > .05) {
				nickles = (int) (change / .05);
				if ((int) nickles != 0) {
					System.out.println(".05c x " + (int) nickles);
					change = ((change - (nickles * .05)) + .001);
				}
			}
			// $0.01
			if (change > .01) {
				pennies = (int) (change / .01);
				if ((int) pennies != 0) {
					System.out.println(".01c x " + (int) pennies);
					change = change - (pennies * .01);
				}
			}
			/*
			 * If Statement asking if there is more items. The user input will run through a
			 * switch to determine if the DO WHILE loop will run again from the start.
			 */

			if (moreItems) {
				System.out.print("\nDo you have more items? Y/N: ");
				String itemsCheck = kb.next();
				System.out.println();
				switch (itemsCheck) {
				case "Y":
				case "y":
					moreItems = true;
					break;

				case "N":
				case "n":
					moreItems = false;
					break;

				default:
					System.out.println("Not an option, running again.");
				}
			}

			/*
			 * Do while loop will continue to run as long as moreItems remains true.
			 * moreItems will be reassigned to false if N/n is entered in the switch,
			 * breaking the loop.
			 */
		} while (moreItems);

		if (moneyReceived > itemPrice) {
			System.out.println("\nThank you, have a nice day!");
		}

		// Closing scanner.
		kb.close();
	}

	/*
	 * This method will take the user input of moneyRecived and itemPrice and
	 * compare the inputs. One String will display after running through the If,
	 * Else If, and Else statements
	 */
	private static void moneyCheck(double itemPrice, double moneyReceived, double change) {

		if (itemPrice > moneyReceived) {
			System.out.println("Not enough cash! Please provide more money!!\n");
		} else if (itemPrice < moneyReceived) {
			System.out.print("\nHere is your change: $" + change + "\n");
		} else {
			System.out.println("\nThank you, have a nice day!");
		}
	}
}
