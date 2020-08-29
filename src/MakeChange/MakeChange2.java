package MakeChange;

import java.util.Scanner;

public class MakeChange2 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double money = 0, moneyTen= 0, itemPrice = 0, moneyReceived = 0;

		System.out.print("How much is the item: $");
		itemPrice = kb.nextDouble();

		System.out.print("How much did the customer give: $");
		moneyReceived = kb.nextDouble();
		System.out.println(moneyReceived);

		moneyCheck(itemPrice, moneyReceived);
		money = moneyReceived - itemPrice;
		System.out.println(money);

		// $10.00
		if (moneyReceived > 10) {
			moneyTen = money - 10;
			money = (money / 10);
			if ((int) money != 0) {
				System.out.println("$10 x " + (int) money);
			}
		}

		// $5.00
		if (moneyTen > 5) {
			money = moneyTen / 5;
			if ((int) money != 0) {
				System.out.println("$5 x " + (int) money);
			}
		}

		// $1.00;
		if (money > 1) {
			money = money / 1;
			if ((int) money != 0) {
				System.out.println("$1 x " + (int) money);
				money = money % 1;
			}
		}

		// $0.25
		if (money > .25) {
			money = money / .25;
			if ((int) money != 0) {
				System.out.println(".25c x " +(int) money);
				money = money % .25;
			}
		}

		// $0.10
		if (money > .1) {
			money = money / .10;
			if ((int) money != 0) {
				System.out.println(".10c x " + (int)money);
				money = money % .10;
			}
		}

		if (money > .05) {
			money = money / .05;
			if ((int) money != 0) {
				System.out.println(".05c x " + (int)money);
				money = money % .05;
			}
		}

		if (money > .01) {
			money = money / .01;
			money = money % .01;
			if ((int) money != 0) {
				System.out.println(".01c x  " + (int)money);
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
