public class Triangle{
  int rows = 3;
  char symbol = '*';
  int[] position = new int[]{20, 20};

  public int getRows(int rows){
    return rows;
  }

  public void setRows(int newRows){
    rows = newRows;
  }

  public int[] getPosition(int[] position){
    return position;
  }

  public void setPosition(int[] newPosition){
    position = newPosition;
  }

  public char getSymbol(char symbol){
    return symbol;
  }

  public void setSymbol(char newSymbol){
    symbol = newSymbol;
  }

  public void drawTriangle(){
    int k = 0;
      for (int i = 0; i < getPosition(position)[1]; i++) {
        System.out.println();
      }
      for (int i = 1; i <= rows; ++i, k = 0) { // create a nested loop that increases the amount of spaces printed as the row number increases
        for (int j = 0; j < getPosition(position)[0]; j++) {
         System.out.print(" ");
        } 
        for (int space = 1; space <= rows - i; ++space) {
          System.out.print(" ");
        }
        while(k != 2 * i - 1){ // use a while loop and if-else statment to print the triangle while changing the color depending on row number
          System.out.print(getSymbol(symbol)); 
          ++k;
        }
      System.out.println();
    }
  }
}
