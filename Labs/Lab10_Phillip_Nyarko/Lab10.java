import java.util.Scanner; //input scanner class

class Lab10{ // main class
	public static void main(String args[]){ // main method

		/* i elected to use an array of Strings with each game choice as an index. The computer will randomly select a number from 0-2 and the that number will be the index
		 * that the computer chooses as its move*/ 
		String[] computerChoicesArray = {"rock", "paper", "scissors"}; // create an array with each possible rock paper scissors decision as an individual element 	
		Scanner input = new Scanner(System.in); // initialize the scanner to get input from user
		/* for my print statements, I use the "\n" escape sequence to create a new line after most print statements for better text visibility*/
		System.out.println("Welcome to Rock, Paper, Scissors!\n"); // greet the user using print statement

		while(true){ // "while(true) always evaluates to true. this statement is used to immediately start a while loop after the initial greeting
			// each time the user chooses to play, the computer will select a random index from the "computerChoicesArray" as its move for the game
			String computerChoice =  computerChoicesArray[(int)(Math.random() * 3)];
			System.out.println("What is your move? (Enter \"Rock\", \"Paper\", or \"Scissors\" to play or enter \"quit\" to quit:) "); // ask the user for input or to quit
			System.out.print("Your Move: "); // user will input their answer after this print statement
			String userGuess = input.nextLine().toLowerCase(); // the userGuess is read using the scanner and converted to lower case.
			
			//if the user enters "quit", display the goodbye message and break out of the loop, terminating the program
			if(userGuess.equals("quit")){
				System.out.println("Thanks for playing Rock, Paper, Scissors!");
				break;
			}
			
			/* if the user did not enter quit, but rather enters something that is not one of the game choices, tell the user they have entered and invalid 
			 * input. the rest of the instructions will be skipped and the loop will start over, prompting the user to make another move.*/
			if(userGuess.equals("rock") != true &&  userGuess.equals("paper") != true && userGuess.equals("scissors") != true){
				System.out.println("\nInvalid input. Please try again\n");	
			}else if(computerChoice.equals(userGuess)){ // if the user's guess is equivalent to the the computers choice, display the computers choice and award a tie.
				System.out.println("\nOpponent Move: " + computerChoice);
				System.out.println("\nIt's a tie!\n");
			}else if (userGuess.equals("rock") && computerChoice.equals("scissors") || userGuess.equals("paper") && computerChoice.equals("rock") || userGuess.equals("scissors") && computerChoice.equals("paper")){ 
				// if the user guess beats the computer's random choice, display the computer choice and award the user with a win.
				System.out.println("\nOpponent Move: " +  computerChoice);
				System.out.println("\nYou Won!\n");
			}else{ // if the user does not enter quit and does not have an answer that either is equivalent or beats the computer choice, then they have lost. 
			       // display the computer choice and award the user with a loss.
				System.out.println("\nOpponent Move: " +  computerChoice);
				System.out.println("\nYou Lost!\n");
			}
		}
		input.close(); // close the scanner
	}	
}
