import java.util.Scanner; // import Scanner class

public class Lab5 { // main class
    public static void main(String args[]){ // main method

            double edge1; // declare a double to store the value of the first edge
            double edge2; // declare a double to store the value of the second edge
            double edge3; // declare a double to store the value of the third edge
            
            Scanner input = new Scanner(System.in); // declare a new scanner
            
            System.out.print("Enter the length of the first side of the triangle: "); // ask user for length of first side
            edge1 = input.nextDouble(); // store the user input in the "edge1" variable
            System.out.print("Enter the length of the second side of the triangle: "); // ask user for length of second side
            edge2 = input.nextDouble(); // store the user input in the "edge2" variable
            System.out.print("Enter the length of the third side of the triangle: "); // ask user for length of third side
            edge3 = input.nextDouble(); // store the user input in the "edge3" variable
            
            //create a boolean variable that evaluates to true if the the sum of any two sides of a triangle is greater than the third side
            boolean isValid = edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1;
            
            if (isValid){ // if the boolean evaluates to true, add all the sides to get the perimeter and print the result
                    System.out.printf("The perimeter of the triangle is %f", (edge1 + edge2 + edge3)); // print with string formatting
            }else{ // if the boolean evaluates to false print "Input is invalid."
                    System.out.println("Input is invalid."); // print that the input is invalid
            }
            input.close(); // close the scanner
    }
}
