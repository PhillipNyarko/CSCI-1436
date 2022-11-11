import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

class semesterProject{
	public static void main(String args[]){
		gameLoop();
	}

	public static void gameLoop(){
		String[][] grid = new String[7][6]; // create a grid that is one unit shorter than its length 
    initGrid(grid);

	  boolean running = true;
    while(running){
      getKeyboardInput();
    }
	}

	public static void clearScreen(){
		 System.out.print("\033[H\033[2J");  
  		 System.out.flush();
	}

  public static void initGrid(String[][] grid){
    for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
          grid[i][j] = " () "; // fill each index of the 2d array with an empty " () " character
        }
    }
    grid[0][0] = "\033[38;5;141m () \033[0m";
    drawGrid(grid);
  }
  
  public static void drawGrid(String[][] grid){
    System.out.println();
    for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
          System.out.print(grid[i][j]); // print the value of each index in corresponding row of grid
        }
        System.out.println(); // print new line after each row is printed
    }
  }

  public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      if (keyCode == KeyEvent.VK_UP) {
        System.out.println("Up Arrrow-Key is pressed!");
      }
      else if (keyCode == KeyEvent.VK_DOWN) {
        System.out.println("Down Arrrow-Key is pressed!");
      }
      else if (keyCode == KeyEvent.VK_LEFT) {
        System.out.println("Left Arrrow-Key is pressed!");
      }
      else if (keyCode == KeyEvent.VK_RIGHT) {
      System.out.println("Right Arrrow-Key is pressed!");
      }
  }
}
