public class Lab4 { // main class
	public static void main(String args[]) { // main method
		
		int number1 = (int) (Math.random()*10); // generate 1st random number (0-9)
		int number2 = (int) (Math.random()*10); //  generate 2nd random number (0-9)
		int number3 = (int) (Math.random()*10); // generate 3rd random number (0-9)
		
		// create a string with string formatting to display the random numbers. print the random numbers to system.out
		System.out.printf("The randomly generated numbers are: %d, %d, and %d. \n", number1, number2, number3);
	
		int temp; // you can create one temporary variable to be used because its value is reset before every operation
		
		if(number1 > number2) { // if number 1 is > number 2, swap the numbers
			System.out.printf("%d > %d, swap! \n", number1, number2 );
			temp = number1; // create a temporary variable to be used during swap and set equal to number 1
			number1 = number2; // set number 1 equal to number 2
			number2 = temp; // set number2 to the temporary value
		} 
		if (number2 > number3) { // if number 2 is > number 3, swap the numbers
			System.out.printf("%d > %d, swap! \n", number2, number3 );
			temp = number2; // create a temporary variable to be used during swap and set equal to number 2
			number2 = number3; // set number 2 equal to number 3
			number3 = temp; // set number3 to the temporary value
			
			if(number1 > number2) { // if number 1 is > number 2 after first check, swap the numbers
				System.out.println("recheking number 1 and number 2, as number 2 has changed \n");
				System.out.printf("%d > %d, swap! \n", number1, number2 );
				temp = number1; // create a temporary variable to be used during swap and set equal to number 1
				number1 = number2; // set number 1 equal to number 2
				number2 = temp; // set number2 to the temporary value
			}
		}
		
		// create a string with string formatting to display the sorted numbers. Print the sorted numbers to system.out
		System.out.printf("The sorted numbers are: %d, %d, and %d.", number1, number2, number3);
	}
}
