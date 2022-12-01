class TestRandomTriangle{
  public static void main(String args[]){

    Triangle t = new Triangle();

    while(true){
      t.drawTriangle();
      sleep(3);
      clearScreen();
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
