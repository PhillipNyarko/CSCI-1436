import java.util.Scanner; // import Scanner class

public class Lab8 { // main class
	public static void main(String args[]) { // main method
		
		Scanner input = new Scanner(System.in); // declare and initialize scanner
		System.out.print("Enter the number of rows in the conversion table: "); // get user input
		int numberOfRows = input.nextInt();  // store the user input as the number of rows to be displayed in the table;
		
		// use three separate print statements to print each line of the header
		// first print statment adds a new line before printing the table
		System.out.println("\n=============================================="); 
		System.out.println("kilograms     pounds  |  pounds      kilograms"); 
		System.out.println("----------------------------------------------");

		double pounds = 20; // declare a variable to store the inital amount of pounds used in the calculation
		int i = 1; // declare loop control variable	    
		
		/* Only the odd number calculations should be printed, so the number of rows value is multiplied by two and the
		 * "i" incrementing variable is increased by 2 each loop. This prints the right amount of rows while also
		 * not printing even values*/
		do{
			/* use string formatting and the decimal percision formatting syntax to left justify each element
			 * that is on the left side of its column, right justify each element on the right side of its column, 
			 * and determine how much decimal precision will be alloted for each value. Then create a new line.*/
			System.out.printf("%-10.0f  %9.1f | %-10.0f %11.2f\n", (double) i, i * 2.2, pounds, pounds/2.2);
			pounds += 5; // increment the number of pounds to be calculated and printed by 5
			i += 2; // increment the loop control variabl by 2
		}while (i < numberOfRows*2); 
		System.out.println("=============================================="); // print the bottom barrier for the table
		input.close(); // close the scanner
	}
}
