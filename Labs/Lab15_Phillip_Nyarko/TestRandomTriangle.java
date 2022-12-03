class TestRandomTriangle{
  public static void main(String args[]){

    char[] symbols = new char[] {'!', '@', '#', '$', '%', '+', 'Z', '?', '<', '/', '|'};

    Triangle t = new Triangle();

    while(true){
      t.drawTriangle();
      sleep(1);
      clearScreen();
      t.setSymbol(symbols[(int)(Math.random()*symbols.length - 1)]);
      t.setRows((int)(Math.random()*10) + 3);
      int[] position = new int[] {(int)(Math.random()*20), (int)(Math.random()*20)};
      t.setPosition(position);
    }
  }

  public static void sleep(int seconds){
    try {
      Thread.sleep(seconds * 1000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void clearScreen(){
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  } 
}
