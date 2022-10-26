import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Lab10{
	public static void main(String args[]){
		String[] computerChoicesArray = {"rock", "paper", "scissors"};
		String computerChoice =  computerChoicesArray[(int)(Math.random() * 3)];
		System.out.println(computerChoice);
		String gameOutcome;
		try{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors!");
		TimeUnit.SECONDS.sleep(2);
		System.out.print("What is your move? (Enter \"Rock\", \"Paper\", or \"Scissors\" to play or enter \"quit\" to quit:) ");
		System.out.print("Your Move: ");
		String userGuess = input.nextLine().toLowerCase();
		if("quit".equals(userGuess)){
			System.out.println("Thanks for playing Rock, Paper, Scissors!");
		}else if(computerChoice.equals(userGuess)){
			gameOutcome = "It's a tie!";
		}else if (userGuess.equals("rock") && computerChoice.equals("scissors") || userGuess.equals("paper") && computerChoice.equals("rock") || userGuess.equals("scissors") && computerChoice.equals("paper")){
			gameOutcome = "You Won!";
		}else{
			gameOutcome = "You Lost!";
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Opponent Move: " +  computerChoice);
		TimeUnit.SECONDS.sleep(1);
		System.out.println(gameOutcome);
		} catch (InterruptedException e){
			Thread.currentThread().interrupt();
			System.out.println("Thread Interruption Exception Reached");
		}
	}	
}
