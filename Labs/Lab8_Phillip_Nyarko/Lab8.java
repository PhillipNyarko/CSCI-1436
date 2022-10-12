import java.util.Scanner; // import Scanner class

public class Lab8 { // main class
	public static void main(String args[]) { // main method
		
		Scanner input = new Scanner(System.in); // declare  and initialize scanner
		System.out.print("Enter the number of rows in the conversion table:  "); // get user input
		int numberOfRows = input.nextInt();  // store the user inputs as the number of rows to be displayed in the table;
		
		// use three separate print statements to print each line of the header
		System.out.println("\n=============================================="); // the "\n" creates a new line before creating the table
		System.out.println("kilograms     pounds  |  pounds      kilograms"); // print the units of the header in the correct spot
		System.out.println("----------------------------------------------"); // the "\n" creates a new line before creating the table

		double initialPounds = 20;
		for(int i = 1; i < numberOfRows*3; i+=2) {
			System.out.printf("%-10.0f  %9.1f | %-10.0f %11.2f\n", (double) i, i * 2.2, initialPounds, initialPounds/2.2);
			initialPounds += 5;
		}
		System.out.println("=============================================="); // print the bottom barrier for the table
		input.close();
	}
}
