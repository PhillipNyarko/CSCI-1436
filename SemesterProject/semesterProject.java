import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

class semesterProject{
  /*
  class TAdapter extends KeyAdapter{
    @Override
    public void keyPressed(KeyEvent e){
      int keycode = e.getKeyCode();

      // Java 12 switch expressions
      switch (keycode){
        case KeyEvent.VK_LEFT : tryMove(curPiece, curX - 1, curY);
        case KeyEvent.VK_RIGHT : tryMove(curPiece, curX + 1, curY);
        case KeyEvent.VK_SPACE : dropDown();
        case KeyEvent.VK_ENTER : oneLineDown();
      }
    }
  }*/ 

	public static void main(String args[]){
    int gridRows = 6;
    int gridCols = 7;

    String redChip = "\033[38;5;160m ✪ \033[0m";
    String blueChip = "\033[38;5;21m ✪ \033[0m";

		String[][] gameBoard = new String[gridRows][gridCols]; 
    String[] selectionGrid = new String[gridCols];

    initGrid(gameBoard, selectionGrid, redChip, blueChip);

    String currentPlayer = redChip; // redChip starts as initial player
    int playerPosition = 0; // first players chip starts placed to the far left

	  boolean running = true;
    while(running){
      /*
      if(user.press a || user.press left arrow){
        if(selectionGrid[playerPosition] != selectionGrid[0]){
          playerPosition -= 1;
          selectionGrid[playerPosition] = currentPlayer;
        }else{
          playerPosition = selectionGrid.length - 1;
          selectionGrid[playerPosition] = currentPlayer;
        }
        update();
      }

      if(user.press d || user.press right arrow){
        if(selectionGrid[playerPosition] != selectionGrid[].length - 1){
          playerPosition += 1;
          selectionGrid[playerPosition] = currentPlayer;
        }else{
          playerPosition = selectionGrid[0];
          selectionGrid[playerPosition] = currentPlayer;
        }      
        update();
      }

      if(user.press enter || user.press spacebar){
        // place a piece in the lowest availible space in the columnn then switch players
        if(currentPlayer = redChip){
          currentPlayer = blueChip;
        }else{
          currentPlayer = redChip
        }
        update();
      }*/ 
    }
	}

  public static void update(String[][] gameBoard, String[] selectionGrid){
    drawGrid(gameBoard, selectionGrid); // call the draw grid function to draw everything
    clearScreen();
  }

  public static void initGrid(String[][] gameBoard, String[] selectionGrid, String redChip, String blueChip){
    // fill the selection grid with empty space
    for(int i = 0; i < selectionGrid.length; i++){
      selectionGrid[i] = " ";
    }
    selectionGrid[0] = redChip; // first space holds the piece for player one

    for(int i = 0; i < gameBoard[0].length; i++){
        for(int j = 0; j < gameBoard.length; j++){
          gameBoard[j][i] = " ◌ "; // fill each index of the game board/2d array with an empty slot character
        }
    }
    drawGrid(gameBoard, selectionGrid); // call the draw grid function to draw everything
  }
  
  public static void drawGrid(String[][] gameBoard, String[] selectionGrid){
    //print the selection row 
    for(int i = 0; i < selectionGrid.length; i++){
      System.out.print(selectionGrid[i]); // print the value of each element of the row
    }
    System.out.println(); // print new line after the selection row is printed
                          
    //print the connect-four grid 
    for(int i = 0; i < gameBoard.length; i++){
        for(int j = 0; j < gameBoard[0].length; j++){
          System.out.print(gameBoard[i][j]); // print value of each index in corresponding row of grid
        }
        System.out.println(); // print new line after each row is printed
    }

    // print the bottom barrier with title
    System.out.print("|");
    for(int i = 0; i < 7; i++){
      System.out.print("~");
    }
    System.out.print("CNCT 4");
    for(int i = 0; i < 6; i++){
      System.out.print("~");
    }
    System.out.print("|");
  }

	public static void clearScreen(){
		 System.out.print("\033[H\033[2J");  
  		 System.out.flush();
	}
}

