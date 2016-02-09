package GameDev;
import java.util.Scanner;

/**
 * Bowling Game
 * 
 * @author Arun
 * 
 */
public class Bowling {
	static int totalresult = 0;
	static int count = 0;

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Bowling Alley");

		System.out.println("Please Enter the pin knocks");

		int temp = 0;
		int result = 0;
		int pinset = 2;
		int pins[] = new int[10];
		int len = pins.length;
		for (int j = 0; j < len; j++) {
			for (int k = 0; k < pinset;) {
				temp = k;

				pins[temp] = in.nextInt();
				if (pins[temp] < 0 || pins[temp] > 10) {
					System.out
							.println("Invalid.Please restart the game after reading the rules");
					break;
				}
				result = result + pins[temp];
				// Case to verify if the player knocked down all the pins in
				// first attempt ie strike
				if (pins[temp] == 10) {
					result = result + pins[temp];
					System.out.println("Bravo.Its a strike");
					// count is verified to check whether it is the last attempt
					// ie 10th attempt
					if (count == 9 && (result >= 10)) {
						k = 0;
						System.out
								.println("You are given with the extra attempt");
						System.out.println("Please provide the input");
						count++;
					} else {
						k = 0;

						break;
					}
				}
				// Case to verify if the player knocked down all the pins in
				// after his 2 attempts ie a Spare
				if (result == 10) {
					result = result + 5;
					System.out.println("Cool.Its a spare");
					// count is verified to check whether it is the last attempt
					// ie 10th attempt
					if (count == 9 && (result >= 10)) {
						System.out
								.println("You are given with the extra attempt");
						System.out.println("Please provide the input");
						k--;
						count++;
					} else {
						k = 0;
						break;
					}
				}
				if (result != 10 && result > 5 && count != 10 && count != 9
						&& k != 0) {

					break;
				}
				k++;
				if (k >= 2) {
					k = 0;
					break;
				}
			}
			if (pins[temp] < 0 || pins[temp] > 10) {
				break;
			} else
				score(result);
			// Initializing the result back to zero
			result = 0;

		}
	}

	/**
	 * Score :Method to calculate total score
	 * 
	 * @param result
	 */
	private static void score(int result) {
		// TODO Auto-generated method stub

		totalresult = totalresult + result;
		System.out.println("Current Score is " + totalresult);
		result = 0;
		count++;

	}

}
