import java.util.Scanner; // import scanner

class Lab12{
  public static void main(String args[]){
    callSort(); // call the "callSort" method that will take three user inputs and send them to the sort method
  }  

  public static void callSort(){ // create method to take input and call sort method
    Scanner input = new Scanner(System.in); // initialize scanner
    // ask the user for the type of data that they would like to sort
    System.out.println("Enter the data type that you would like to sort");
    System.out.print("Enter \"int\" for integer, \"float\" for floating-point values, or \"string\" for string): ");       
    // store input as lowercase String
    String dataType = input.next().toLowerCase();
    //create three arrays of length 3, one for each type of input
    int[] userIntValues = new int[3]; 
    double[] userFloatValues = new double[3];
    String[] userStringValues = new String[3]; 

    // ask the user for input three times. Append the user input to the array that corresponds with the data type.
    for(int i = 0; i < 3; i++){
      System.out.printf("Enter %s #%d: ", dataType, i+1);
      if("int".equals(dataType)){
        userIntValues[i] = Integer.parseInt(input.next());      
      }else if("float".equals(dataType)){
        userFloatValues[i] = Double.parseDouble(input.next());
      }else if("string".equals(dataType)){
        userStringValues[i] = input.next();
      }
    }
     
    // use a switch to call the sortThree method and pass the the array that corresponds to the user-given data type.
    switch (dataType){
      case "int": 
        sortThree(userIntValues);
        break;
      case "float":
        sortThree(userFloatValues);
        break;
      case "string":
        sortThree(userStringValues);
        break;
    }
  }

  // create a soritng method called "sortThree" and accept an iteger array as the only parameter
  // i elected to use bubble sort which swaps each pair of consecutive numbers until the array is sorted
  // although it is not effiecient(n^2), the data size is small enough for this sorting algorithim
  // (its also the only sorting algorithm I have experience with
  public static void sortThree(int[] userValues){
    int n = userValues.length; // store the length of the array as "n" for syntactic simplicity
        for(int i = 0; i < n - 1; i++){ // for every index of the array (0, 1, 2), (increment until out of array indexes)
            for(int j = 0; j < n - i - 1; j++){ // for every pair in array (0,1), (1,2) (increment until out of pairs)
                if(userValues[j] > userValues[j + 1]){ // if the value at the current index is greater than the next index
                    // swap the two indexes
                    int temp = userValues[j];
                    userValues[j] = userValues[j + 1];
                    userValues[j + 1] = temp;
                }
            }
        }
    // print the sorted values using string formatting
    System.out.printf("The sorted integer values are: %d, %d, %d\n", userValues[0], userValues[1], userValues[2]);
  }
 
  // overload the "sortThree" method by creating another method with the same name that only takes an array of doubles
  public static void sortThree(double[] userValues){
    // sort the array using the same method used above
    int n = userValues.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(userValues[j] > userValues[j + 1]){
                    double temp = userValues[j];
                    userValues[j] = userValues[j + 1];
                    userValues[j + 1] = temp;
                }
            }
        }
    // print the sorted values using string formatting
    System.out.printf("the sorted floating-point values are: %f, %f, %f\n", userValues[0], userValues[1], userValues[2]);
  }
  
  public static void sortThree(String[] userValues){
    // sort the array using the same method used above
     int n = userValues.length;
        for(int i = 0; i < n - 1; i++){
          for(int j = 0; j < n - i - 1; j++){
            /* rather than comparing number values, both strings are converted to lower case and
            the "compareTo" string method is used to determine which string is greater*/  
           if(userValues[j].toLowerCase().compareTo(userValues[j+1].toLowerCase()) > 0){
                    String temp = userValues[j];
                    userValues[j] = userValues[j + 1];
                    userValues[j + 1] = temp;
                }
            }
        }
    // print the sorted values using string formatting
    System.out.printf("the sorted string values are: %s, %s, %s\n", userValues[0], userValues[1], userValues[2]);
  }
}
