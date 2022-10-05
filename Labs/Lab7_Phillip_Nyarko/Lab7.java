import java.util.Scanner;

class Lab7{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the first city: "); 
		String city1 = input.nextLine();

		System.out.print("Please enter the second city: ");
		String city2 = input.nextLine();

		System.out.print("Please enter the third city: ");
		String city3  = input.nextLine();
		
		if(city1.toLowerCase().compareTo(city2.toLowerCase()) > 0){
			String temp = city1;
			city1 = city2;
			city2 = temp;
		}
		if(city2.toLowerCase().compareTo(city3.toLowerCase()) > 0){
			String temp = city2;
			city2 = city3;
			city3 = temp;

			if(city1.toLowerCase().compareTo(city2.toLowerCase()) > 0){
				String temp2 = city1;
				city1 = city2;
				city2 = temp2;
			}
		}
		System.out.printf("%s\n%s\n%s\n", city1, city2, city3);
	}
}
