import java.util.Scanner;

class Lab10{
  public static void main(String args[]){
   
   int grade = 0;

   for(int i = 0; i < 10; i++){

    int operation = (int)(Math.random()*2);
    int number1 = (int)(Math.random()*10);
    int number2 = (int)(Math.random()*10);

    if(number1 < number2){
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    switch(operation){
      case 0:
        grade += subtraction(number1, number2);
        break;
              
      case 1:
        grade += addition(number1, number2);
        break;
    }
  }

    System.out.printf("Correct count is:%5d\nLetter grade is:%6s\n", grade, convertGradeToLetter(grade));
  }

  public static int addition(int number1, int number2){
    int grade = 0;
    int answer = number1 + number2;

    Scanner input = new Scanner(System.in);

    System.out.printf("What is %d %s %d? ", number1, "+", number2);
    int userInput = input.nextInt();

    if(userInput == answer){
      System.out.println("\nYou are Correct!\n");
      grade += 1;
    }
    else{
      System.out.println("\nYour answer is wrong. \n The correct answer is " + answer + "\n");
    }
    return grade;
  }

  public static int subtraction(int number1, int number2){
    int grade = 0;
    int answer = number1 - number2;

    Scanner input = new Scanner(System.in);

    System.out.printf("What is %d %s %d? ", number1, "-", number2);
    int userInput = input.nextInt();

    if(userInput == answer){
      System.out.println("\nYou are Correct!\n");
      grade += 1;
    }
    else{
      System.out.println("\nYour answer is wrong. \n The correct answer is " + answer + "\n");
    }
    return grade;
  }

  public static char convertGradeToLetter(int grade){
    if(grade >=9){
      return 'A';
    }else if(grade >= 8){
      return 'B';
    }else if (grade >= 7){
      return 'C';
    }else if (grade >= 6){
      return 'D';
    }else{
      return 'F';
    }
  }
}
