import java.util.Scanner; // import the Scanner class to read user inputs

class Lab7{ // main class
	public static void main(String args[]){ // main method
		Scanner input = new Scanner(System.in); // declare and initialize a scanner to read input

		System.out.print("Please enter the first city: "); // request first input from the user
		String city1 = input.nextLine(); // get user input using scanner and declare variable to hold city 1

		System.out.print("Please enter the second city: "); // request second input from the user
		String city2 = input.nextLine(); // get user input using scanner and declare variable to hold city 2

		System.out.print("Please enter the third city: "); // request third input from the user 
		String city3  = input.nextLine(); // get user input using scanner and declare variable to hold city 3
		
		// if the compareTo() method returns a value greater than 0 when comparing cities 1 and 2
		if(city1.toLowerCase().compareTo(city2.toLowerCase()) > 0){ 
			String temp = city1; // create a temporary string variable to be used in the swapping of the two variables
			city1 = city2; // city 1 takes the value of city 2
			city2 = temp; // city 2 takes the value of "temp" which is holding the initial value of city 1
		}
		// if the compareTo() method returns a value greater than 0 when comparing cities 2 and 3
		if(city2.toLowerCase().compareTo(city3.toLowerCase()) > 0){
			String temp = city2; // create a temporary string variable to be used in the swapping of the two variables
			city2 = city3; // city 2 takes the value of city 3 
			city3 = temp; // city 3 takes the value of "temp" which is holding the initial value of city 2 
	
			// if the compareTo() method returns a value greater than 0 when comparing cities 1 and 2 
			if(city1.toLowerCase().compareTo(city2.toLowerCase()) > 0){
				String temp2 = city1; // create a temporary string variable to be used in the swapping of the two variables
				city1 = city2; // city 1 takes the value of city 2
				city2 = temp2; // city 2 takes the value of "temp2" which is holding the initial value of city 1
			}
		}
		System.out.printf("%s\n%s\n%s\n", city1, city2, city3); // display the output with a new line after each city using string formatting
		input.close(); // close the scanner
	}
}
