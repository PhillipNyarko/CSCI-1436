import java.util.Scanner;

class Exercises{
	public static void main(String args[]){
		allPrimeNumbers();
	}

	public static void GCM(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number ");
		int number1 = input.nextInt();
		System.out.print("Enter a second number ");
		int number2 = input.nextInt();
		
		int i = 1;
		int gcm = 0;
		 
		while(i <= number1){
			if(number1 % i == 0 && number2 % i == 0){
				gcm = i;
			}
			i++;
		}
		System.out.println("The GCM is " + gcm);
	}

	public static void getFactors(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer");
		int integer = input.nextInt();
		
		int i = 2;

		while(i < integer){
			if(integer % i == 0){
				System.out.print(i + ", ");
				integer /= i;
			}
			else{
				i++;
			}
		}
	}

	public static void rightTriangleOfNumbers(){
		for(int i = 0 ; i < 6; i++){
			for(int j = 0; j < i; j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void allPrimeNumbers(){
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();

		for(int i = 1; i <= integer; i++){
			if(i % 2 == 0){
				continue;
			}
			else{
				System.out.print(i + ", ");
			} 
		}
	}
}
