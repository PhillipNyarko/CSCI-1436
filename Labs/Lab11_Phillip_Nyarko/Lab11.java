import java.util.Scanner;

class Lab10{
  public static void main(String args[]){
    
    Scanner input = new Scanner(System.in);
    String operator = null;
    int answer = 0;
    int grade = 0;
    
    for(int i = 0; i < 9; i++){
      int operation = (int)(Math.random()*2);
      int number1 = (int)(Math.random()*10);
      int number2 = (int)(Math.random()*10);

      if(number1 < number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;
      }

      switch(operation){
            case 0: answer = number1 - number2;
                    operator = "-";
                    break;
                    
            case 1: answer = number1 + number2;
                    operator = "+";
                    break;
          }
      System.out.printf("What is %d %s %d?", number1, operator, number2);
      int userInput = input.nextInt();
      if(userInput == answer){
        System.out.println("You are Correct!\n");
        grade += 1;
      }
      else{
        System.out.println("\nYour answer is wrong. \n The correct answer is " + answer + "\n");
      }
    }
  System.out.printf("Correct count is: %d\nLetter Grade is %s", grade, grade);
  }
}
