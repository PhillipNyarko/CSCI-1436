class Lab9{ // main class

	public static void main(String args[]){ // main method
		for(int i = 6; i > 0; i--){ // outer loop defines how many iterations for which the program will decriment "i"
			for(int j = 0; j < i; j++){ // inner loop will increment variable "j" until it is no longer less that "i"
				System.out.print("* "); // a star is printed with each increment of the inner loop
			}
			System.out.println(""); // a new line is printed with each increment of the outer loop
		}

		for(int i = 0; i < 6; i++){ // outer loop defines how many iteration for which the program will increment "i"
			/* inner loop will increment variable "j" until it is no longer less than the number of rows in the rows
			 * in the triangle (6) subtracted by the number of the current iteration (i).*/
			for(int j = 1; j < 6-i; j++){ 
			       System.out.print("  "); // 2 blank spaces are printed on the same line for each iteration
			}
			/* this second inner loop begins after the correct amount of spaces has been printed on the line. the 
			 * loop gets incremented until the loop control variable "k" is greater thatn i. this results in 
			 * an additional star  being printed on each succesive line after the spaces. As the number of spaces
			 * decreases with each new row, the number of stars increases which results in a right-justified
			 * right triangle*/
			for(int k = 0; k <= i; k++){ 
				System.out.print(" *"); // print the star with a space infront of it
			}
			System.out.println(); // a new line is create with each iteration of the main loop(this occurs six times)
		}	
		
	}
}
