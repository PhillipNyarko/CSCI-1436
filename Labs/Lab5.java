import java.util.Scanner;

class Lab5 {
    	public static void main(String args[]){

		double edge1;
		double edge2;
		double edge3;
		
		Scanner input = new Scanner(System.in);
	       	System.out.println("Enter the length of the first side of the triangle");
		edge1 = input.nextDouble();
		System.out.println("Enter the length of the second side of the triangle");
		edge2 = input.nextDouble(); 
		System.out.println("Enter the length of the third side of the triangle");
		edge3 = input.nextDouble();
		
		if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge3 + edge1 > edge2){
			System.out.printf("The perimeter of the triangle is %f", (edge1 + edge1 + edge3));
		}else{
			System.out.println("Input is invalid.");
		}
		input.close();			
	}
}

