import java.util.Scanner; // import Scanner class 

public class Lab3 { //main class

	public static void main(String[] args) { // main method 
		
		Scanner input = new Scanner(System.in); // declare and initialize the scanner
		
		double homeInitialValue; //declare variable for initial value of the home
		double interestRate; // declare variable for interest rate
		int timeInYears; // declare variable for number of years the interest is being calculated for
		double finalValue; // final value of the home after compound interest calculation
		
		System.out.print("Enter the initial value of the home: $"); // ask user for initial home value
		homeInitialValue = input.nextDouble(); // set user input as the home initial value
		
		System.out.print("Enter the interest rate for the home (%): "); // ask the user for interest rate
		interestRate = input.nextDouble()/100.0; // convert user input to decimal and set as the interest rate
		
		System.out.print("Enter the number of eleapsed years: "); // ask the user for the time in years
		timeInYears = input.nextInt(); // set user input as the elapsed years
		
		/* calculate total using  A = P * (1+ r)^t (using Math.pow to raise to the power of "t"). round to 2 decimal places and
		 * cast to double
		*/
		finalValue =  (double) Math.round(homeInitialValue * Math.pow(1 + interestRate, timeInYears) * 100)/100;
		
		System.out.print("The final value of the home is $" + finalValue);// print the rounded final value 
		input.close(); // close the scanner 
	}
}
