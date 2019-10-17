/*
 * @ author: Kevin Chung
 */

package co.grandcircus;

import java.util.Scanner;

public class LabNumber6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Rolling two dice. How many sides should each die have?");

		int dieSides = scan.nextInt();
		int rollCount = 1;
		String toContinue = "y";

		scan.nextLine();

		while (toContinue.equals("y")) {

			System.out.println("Roll #" + rollCount);

			generateRandomDieRoll(dieSides);

			System.out.println("Roll again? (y/n)");

			toContinue = scan.nextLine().toLowerCase().substring(0, 1);

			rollCount++;

		}

		System.out.println("Goodbye!");
		scan.close();
	}

	public static void generateRandomDieRoll(int die1) {

		int dieCalc1 = (int) (Math.random() * die1) + 1;
		int dieCalc2 = (int) (Math.random() * die1) + 1;
		if (dieCalc1 == 1 && dieCalc2 == 1) {
			System.out.println("You rolled snake eyes!");
		} else if (dieCalc1 == 6 && dieCalc2 == 6) {
			System.out.println("You rolled box cars!");
		} else if (dieCalc1 == 7 && dieCalc2 == 7) {
			System.out.println("Lucky 7's!");
		} else {
			System.out.println(dieCalc1);
			System.out.println(dieCalc2);
		}
	}
}
