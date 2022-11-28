class Lab14 {
  public static void main(String args[]) {
    int rows = 5, k = 0;

    for (int j = 0; j < 3; j++) { // create a loop so that three triangles are made
      for (int i = 1; i <= rows; ++i, k = 0) { // create a nested loop that increases the amount of spaces printed as the row number increases
        for (int space = 1; space <= rows - i; ++space) {
          System.out.print("  ");
        }
        while(k != 2 * i - 1){ // use a while loop and if-else statment to print the triangle while changing the color depending on row number
          if(i % 2 == 0){
            System.out.print("* ");
          }else{
            System.out.print("\u001B[34m" + "* " + "\u001B[0m" ); // use ansi blue and ansi reset
          }
          ++k;
        }
        System.out.println(); // print a new line
      } 
    }
  }
}
