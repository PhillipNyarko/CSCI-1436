import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) { // main method
		
		Scanner input = new Scanner(System.in); // declare scanner to get input from user

		
		final double MONTHLY_INTEREST_RATE = 1 + (0.05/12.0); // declare monthly interest as a constant
		double monthlyDeposit = 0.0; // declare the monthly deposit that will store the user input. initialize at 0.0
		double currentValue = monthlyDeposit; // declare a variable that stores the total current account value. initialize as monthlyDeposit

		System.out.print("Please enter your monthly deposit: "); // Message prompting the user to enter their monthly deposit
		monthlyDeposit = input.nextDouble(); // Store the next input as the value of the monthlyDeposit variable
		
		int months = 6;	// initialize a variable for how many months to calculate to account value for

		// use for loop to c out account value for each month(including the applied interest)
		for(int i = 1; i <= months; i++) {
			/* set the currentValue equal to the sum of the monthly deposit multiplied by the interest rate 
			 * this does the calculation for all months but the following "if" statement states that the value
			 * of months 4 and 5 should not be printed.
			 */
			currentValue = (currentValue + monthlyDeposit) * MONTHLY_INTEREST_RATE;
			if(i != 4 && i != 5) {// only print if the index of the loop is not on the months 4 and 5
			// create string for output using string formatting to insert the month and account values
			System.out.printf("Month: %d\n Balance %.2f\n", i, currentValue); // print the output to the console
			}
		}
		input.close(); // close the input scanner to avoid "resource leak" warning"
	}
}
