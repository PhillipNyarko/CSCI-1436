public class Triangle{
  int rows = 3;
  char symbol = '*';
  int[] position = new int[]{20, 20};

  public void getNumOfRow(){
  }

  public void setNumOfRow(){
  }

  public void getPosition(){
  }

  public void setPosition(){
  }

  public char getSymbol(char symbol){
    return symbol;
  }

  public void setSymbol(){
  }

  public void drawTriangle(){
    int k = 0;
    for (int j = 0; j < rows; j++) { // create a loop so that three triangles are made
      for (int i = 1; i <= rows; ++i, k = 0) { // create a nested loop that increases the amount of spaces printed as the row number increases
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }
      while(k != 2 * i - 1){ // use a while loop and if-else statment to print the triangle while changing the color depending on row number
          System.out.print("\u001B[34m" + "* " + "\u001B[0m" ); // use ansi blue and ansi reset
      }
      ++k;
    }
      System.out.println();
    }
  }
}
