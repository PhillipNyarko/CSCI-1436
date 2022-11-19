import java.util.Scanner; // import scaner class
import java.util.Random; // import Random class

public class Lab13 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in); //init scanner

    int[] array = generateArray(); // call the generateArray method and assign its return value to the array

    System.out.println("\nThe initial array has the following values: " + printArrayValues(array)); // print the initial array

    // prompt the user to enter a number and store the input as an integer
    System.out.print("Enter a number to be removed from the array: ");
    int userInput = input.nextInt();

    boolean userInputInArray = false; // declare a bool to hold the state of the user input 
    
    // check the userInputInArray boolean and if it is false keep looking through the array for the user's input value 
    // if the userInput is not found in the array keep prompting the user for a valid input
    while(!userInputInArray){
      for(int i = 0; i < array.length; i++){
        if(array[i] == userInput){ // if user input is in array set boolean to true print the new array and break from the loop 
          userInputInArray = true;
          // the array created above and the current index(the one that will be deleted) is passed to the deleteAndShift function
          System.out.println("The new adjusted array is: " + deleteAndShift(array, i)); // call the deleteAndShift function and print result
          break; // break from loop 
        }
      }
      if(!userInputInArray){ // if userInputInArray is still false keep asking user for valid input
        System.out.print("Invalid input. Enter a number to be removed from the array: ");
        userInput = input.nextInt();
      }
    }
    
  }
  
  // declare method that will generate and array
  public static int[] generateArray() {
    Random rand = new Random(); // instantiate a new random object from the random classs
    int[] randomIntArray = new int[25]; // create an array with a length of 25
    
    // user a for loop to insert a random number (0-9) into the array
    for(int i = 0; i < 25; i++){
      int randomInt = rand.nextInt(10);
      randomIntArray[i] = randomInt;
    }

    return randomIntArray; // return the array
  }

  public static String printArrayValues(int[] array){
    String arrayString = ""; // create a string that will hold the array values

    // not a very efficeint method
    for(int i = 0; i < array.length; i++){ // go through the array and add the value of each index to the arrayString variable
      // use an if-else statment to print a comma after each letter except for the last element
      if(i == array.length-1){ 
        arrayString += array[i];
      }else{
        arrayString += array[i];
        arrayString += ", ";
      }
    }

    return arrayString; // return the string representation of the array
  }
 
  public static String deleteAndShift(int[] array, int deletionNumberIndex) {
    // also not very efficeint
    int[] updatedArray = new int[array.length]; // create a new array of the same length of the original array 
    // the loop will go through one less iteration than the length of the array. This alters 24 values and leave space for the trailing "-1"
    for(int i = 0; i < array.length-1; i++){
      if(i < deletionNumberIndex){ // if the index the loop is on is less than the index of the value to be deleted 
        updatedArray[i] = array[i]; // set the new array value to equal the original array value
      }else if(i != array.length-1){ // if the the current index is greater than the index of the value to be deleted but aslo not the last element
        updatedArray[i] = array[i + 1]; // set the new array value to be the value of the index to the right of the current index
      }
    }

    updatedArray[updatedArray.length-1] = -1; // make the last value of the new array "-1"
    return printArrayValues(updatedArray); // return the array
  }
  
}

