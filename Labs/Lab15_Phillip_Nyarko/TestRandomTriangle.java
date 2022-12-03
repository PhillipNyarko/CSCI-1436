class TestRandomTriangle{
  public static void main(String args[]){

    // create an array with random character values
    char[] symbols = new char[] {'!', '@', '#', '$', '%', '+', 'Z', '?', '<', '/', '|'};

    Triangle t = new Triangle(); // create a triangle object

    // in the while loop, draw the triangle, pause for 1 second, then randomly change all of its variables
    while(true){
      t.drawTriangle();
      sleep(1);
      clearScreen();
      t.setSymbol(symbols[(int)(Math.random()*symbols.length - 1)]);
      t.setRows((int)(Math.random()*10) + 3);
      int[] position = new int[] {(int)(Math.random()*20), (int)(Math.random()*20)}; // array with 2 random ints
      t.setPosition(position);
    }
  }
  // method to sleep 
  public static void sleep(int seconds){
    try {
      Thread.sleep(seconds * 1000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
 // method to clear screen 
  public static void clearScreen(){
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  } 
}
