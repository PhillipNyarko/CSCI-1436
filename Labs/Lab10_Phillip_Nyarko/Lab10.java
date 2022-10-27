import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Lab10{
	public static void main(String args[]){
		String[] computerChoicesArray = {"rock", "paper", "scissors"};
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors!");

		try{
			TimeUnit.SECONDS.sleep(1);
			while(true){
				String computerChoice =  computerChoicesArray[(int)(Math.random() * 3)];
				System.out.println("What is your move? (Enter \"Rock\", \"Paper\", or \"Scissors\" to play or enter \"quit\" to quit:) ");
				System.out.print("Your Move: ");
				String userGuess = input.nextLine().toLowerCase();
				
				if(userGuess.equals("quit")){
					System.out.println("Thanks for playing Rock, Paper, Scissors!");
					break;
				}
				
				if(userGuess.equals("rock") != true &&  userGuess.equals("paper") != true && userGuess.equals("scissors") != true){
					System.out.println("Invalid input. Please try again\n");	
					TimeUnit.SECONDS.sleep(1);
				}else if(computerChoice.equals(userGuess)){
					System.out.println("\nOpponent Move: " + computerChoice);
					TimeUnit.SECONDS.sleep(1);
					System.out.println("It's a tie!");
				}else if (userGuess.equals("rock") && computerChoice.equals("scissors") || userGuess.equals("paper") && computerChoice.equals("rock") || userGuess.equals("scissors") && computerChoice.equals("paper")){
					System.out.println("Opponent Move: " +  computerChoice);
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You Won!");
				}else{
					System.out.println("Opponent Move: " +  computerChoice);
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You Lost!");
				}
			}
		}catch(InterruptedException e){
			Thread.currentThread().interrupt();
			System.out.println("Thread Interruption Exception Reached");
		}
	}	
}
