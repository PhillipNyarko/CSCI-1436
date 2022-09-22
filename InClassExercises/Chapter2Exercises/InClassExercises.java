import java.util.Scanner;

public class InClassExercises {

	public static void main(String[] args) {
	}
	
	public static void bodyMasssIndex() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input weight(lbs) -> ");
		double weight = input.nextDouble()/2.205;
		System.out.print("Input Height(ft) -> ");
		double height = input.nextDouble()/3.281;
		System.out.println(weight/(height*height));
		input.close();
	}
	
	public static void computeCircleArea() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the radius of the circle -> ");
		double radius = input.nextDouble();
		double pi = 3.14159;
		double area = radius * radius * pi;
		System.out.println("The area3 of a circle with a radius of " + radius + " is " + area);
		input.close();
	}
	public static void gravityPlusSubtotal() {
		Scanner input = new Scanner(System.in);
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		gratuity = gratuity/100;
		System.out.println(subtotal*gratuity);
		input.close();
	}
	
	public static void minutesToSeconds(){
		int time = 200;
		int minutes = time/60;
		System.out.println(Integer.toString(minutes));
	}
	
	public static void showCurrentTime() {
		
		long totalMilliseconds = System.currentTimeMillis(); // milliseconds since UNIX epoch
		
		long totalSeconds = totalMilliseconds / 1000;
		// getting the remainder of the milliseconds/seconds in minute = just the seconds
		long currentSecond = totalSeconds % 60; 
		
		long totalMinutes = totalSeconds / 60;
		// getting the remainder of the seconds/minutes in an hour = just the minutes
		long currentMinute = totalMinutes  % 60; 
		
		long totalHours = totalMinutes / 60;
		// getting the remainder of the minutes/hours in a day = just the hours
		long currentHour = (totalHours  % 24) - 5; //modulus gets remainder 5 because London is 5 hours ahead
		
		System.out.println("Current Time In Texas: " + currentHour + ":" + currentMinute + ":" + currentSecond);
		}
	
	public static void physicsAcceleration(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Starting Velocity: ");
		double startVel = input.nextDouble();
		System.out.println("Enter Ending Velocity: ");
		double endVel = input.nextDouble();
		System.out.println("Enter Time Span: ");
		double timeSpan = input.nextDouble();
		System.out.println((endVel-startVel)/timeSpan);
		input.close();
	}
	
}
