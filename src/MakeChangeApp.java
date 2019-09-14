import java.util.Scanner;

public class MakeChangeApp {
	static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);

		theRegister();

		kb.close();
	}

	public static void theRegister() {
		double change = 0, changeHolder = 0, changeDisplay = 0;
		int pennies = 0, changeDenomination = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("\n********** Welcome to \" El Mercado \" Food  Market **********\n");
			System.out.println("What is the cost of the item?");
			float itemPrice = kb.nextFloat();
			System.out.println("Please enter how much did the customer pay? ");
			float amountPaid = kb.nextFloat();

			change = amountPaid - itemPrice;
			changeDisplay = change;

			if (amountPaid > itemPrice) {

				System.out.print("\nChange would be ");
				System.out.printf("%.2f", changeDisplay);
				System.out.println(" that is: \n");

				if (change >= 20) {
					changeHolder = change;
					changeDenomination = (int) change / 20;
					System.out.println(changeDenomination + " Twenty dollar bill/s.");
					change = changeHolder - (20 * (changeDenomination));

				}

				if (change >= 10) {
					changeHolder = change;
					changeDenomination = (int) change / 10;
					System.out.println(changeDenomination + " Ten dollar bill/s.");
					change = changeHolder - (10 * (changeDenomination));

				}

				if (change >= 5) {
					changeHolder = change;
					changeDenomination = (int) change / 5;
					System.out.println(changeDenomination + " Five dollar bill/s.");
					change = changeHolder - (5 * (changeDenomination));

				}

				if (change >= 1) {
					changeHolder = change;
					changeDenomination = (int) change / 1;
					System.out.println(changeDenomination + " Dollar/s.");
					change = changeHolder - (1 * (changeDenomination));

				}
				if (change >= .25) {
					changeHolder = change;
					changeDenomination = (int) (change / .25f);
					System.out.println(changeDenomination + " Quarter/s.");
					change = changeHolder - (.25 * (changeDenomination));

				}

				if (change >= .10) {
					changeHolder = change;
					changeDenomination = (int) (change / .10f);
					System.out.println(changeDenomination + " Nickel/s.");
					change = changeHolder - (.10f * (changeDenomination));

				}
				if (change >= .05) {
					changeHolder = change;
					changeDenomination = (int) (change / .05f);
					System.out.println(changeDenomination + " Dime/s.");
					change = changeHolder - (.05f * (changeDenomination));

				}

				if (change >= .00) {
					changeHolder = change;
					pennies = (int) ((change + .001) / .01);
					System.out.println(pennies + " Penny/ies.");

				}
			}

			if (amountPaid == itemPrice) {
				System.out.println("\nExact Change. Perfect!");
			}

			if (amountPaid < itemPrice) {
				System.out.println("\nToo low, please try again.\n ");
				theRegister();
			}

			i = stopOrContinue(i);
		}

		System.out.println("****** Thank you for shopping at El Mercado Food Market, Goodbye! ******");

	}

	public static int stopOrContinue(int i) {
		String answer = "";

		System.out.println("\nWould you like to purchase another item? Yes / No ");
		answer = kb.next();

		if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
			i--;
		} else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
			i += 5;
		}
		return i;
	}
}
