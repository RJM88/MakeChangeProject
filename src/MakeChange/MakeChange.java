package MakeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double change = 0, tens = 0, fives = 0, ones = 0, itemPrice = 0, moneyReceived = 0;
		int quaters = 0, dimes = 0, nickles = 0, pennies = 0;

		// Asking for user how much the item is.
		System.out.print("How much is the item: $");
		itemPrice = kb.nextDouble();
		// How much did the customer give.
		System.out.print("How much did the customer give: $");
		moneyReceived = kb.nextDouble();
		System.out.println(moneyReceived);

		// Will run moneyCheck method, checking on amount of money.
		moneyCheck(itemPrice, moneyReceived);

		// change will take moneyRecived - itemPrice.
		change = moneyReceived - itemPrice;
		System.out.println(change);

		// $10.00
		if (change >= 10) { // if change is greater or equal to 10 statement will run.
			tens = (change / 10); // change will divide by 10 then assign to "tens".
			if ((int) tens != 0) { // if "tens" does not equal 0 the statement will run.
				System.out.println("$10 x " + (int) tens);
				tens = ((tens * 10) - 10 + .001); // ("tens" * 10) - 10 will be assigned to
				change = tens;
				System.out.println("after 10's " + change);

			}
		}

		// $5.00
		if (change >= 5) {
			fives = change / 5;
			if ((int) fives != 0) {
				System.out.println("$5 x " + (int) fives);
				fives = (fives * 5);
				change = (fives - 5);
				System.out.println("after 5's " + change);

			}
		}

		// $1.00;
		if (change >= 1) {
			ones = change / 1;
			if ((int) ones != 0) {
				System.out.println("$1 x " + (int) ones);
				ones = (ones % 1);
				change = (ones * 1);
				System.out.println("after 1's " + change);
			}
		}

		// $0.25
		if (change >= .25) {
			System.out.println("Line 76 " + change);
			quaters = (int) (change / .25);
			if ((int) quaters != 0) {
				System.out.println(".25c x " + (int) quaters);
				change = change - (quaters * .25);
				System.out.println("after .25's " + change);
			}
		}

		// $0.10
		if (change >= .1) {
			dimes = (int) (change / .10);
			if ((int) dimes != 0) {
				System.out.println(".10c x " + (int) dimes);
				System.out.println(dimes);
				change = change - (dimes * .1);
				System.out.println("after .10's " + change);
//				System.out.println(change);
//				dimes = dimes % .10;
//				dimes = (dimes * .25);
//				change = (change - dimes); 
//				System.out.println(change);
			}
		}

		if (change > .05) {
			nickles = (int) (change / .05);
			if ((int) nickles != 0) {
				System.out.println(".05c x " + (int) nickles);
				System.out.println(nickles);
				change = change - (nickles * .05);
				System.out.println("after .05's " + change);
			}
		}

		if (change > .01) {
			pennies = (int) (change / .01);
			if ((int) pennies != 0) {
				System.out.println(".01c x  " + (int) pennies);
				System.out.println(pennies);
				change = change - (pennies * .01);
				System.out.println("after .01's " + change);
			}
		}

		kb.close();
	}

	private static void moneyCheck(double itemPrice, double moneyReceived) {
		// TODO Auto-generated method stub
		if (itemPrice > moneyReceived) {
			System.out.println("Not enough cash! Please provide more money!!\n");
		} else if (itemPrice < moneyReceived) {
			System.out.println("\nHere is your change. Thank you, have a nice day!");

		} else {
			System.out.println("\nThank you, have a nice day!");
		}
	}
}
