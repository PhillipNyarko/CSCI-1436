import java.util.Scanner;
import java.util.Random;

public class Lab13 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    int[] array = generateArray();

    System.out.println("\nThe initial array has the following values: " + printArrayValues(array));
    
    System.out.println("Enter a number to be removed from the array: ");
    int userInput = input.nextInt();

    int index;
    boolean validInput = true;
    do{
      for(int i = 0; i < 25; i++){
        if(array[i] == userInput){
          index = i;
          break;
        }else{
          validInput = False;
        }
      }while(validInput)
      System.out.println("The new adjusted array is: " + deleteAndShift(array, userInput));

  }

  public static int[] generateArray() {
    Random rand = new Random();
    int[] randomIntArray = new int[25];

    for(int i = 0; i < 25; i++){
      int randomInt = rand.nextInt(10);
      randomIntArray[i] = randomInt;
    }

    return randomIntArray;
  }

  public static String printArrayValues(int[] array){
    String arrayString = "";

    // not a very efficeint method
    for(int i = 0; i < 25; i++){
      if(i == 24){
        arrayString += i;
      }else{
        arrayString += i;
        arrayString += ", ";
      }
    }

    return arrayString;
  }

  public static int[] deleteAndShift(int[] array, int deletionNumber) {


    return printArrayValues(updatedArray);
  }
}

