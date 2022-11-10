import java.util.Scanner; // import scanner

class Lab10{
  public static void main(String args[]){
   
   int grade = 0; //initialize grade variable

   for(int i = 0; i < 10; i++){ // loop 10 times

    int operation = (int)(Math.random()*2); // create a random number that is either 0 or 1
    int number1 = (int)(Math.random()*10); // create a random number from 0-9
    int number2 = (int)(Math.random()*10); // create a random number from 0-9

    if(number1 < number2){ // if the first number is smaller than the second, swap the two numbers
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    switch(operation){ /* use a switch to select the type of problem based on the vaalue of the operation varible
                          0 = subtraction, 1 = addition */
      case 0:
        grade += subtraction(number1, number2); // call the subtraction method and add its return value to the grade
        break;
              
      case 1:
        grade += addition(number1, number2); // call the addition method and add its return value to the grade
        break;
    }
  }
    // After the loop, display the the amount the user got correct and the equivalent letter grade with string formatting
    System.out.printf("Correct count is:%5d\nLetter grade is:%6s\n", grade, convertGradeToLetter(grade));
  }

  public static int addition(int number1, int number2){ // create addition method
    int grade = 0; // create local grade value 
    int answer = number1 + number2; // store answer to math problem as integer

    Scanner input = new Scanner(System.in); // create a scanner named "input"

    System.out.printf("What is %d %s %d? ", number1, "+", number2); // ask the user the math question
    int userInput = input.nextInt(); // read the user input and store it as and int

    if(userInput == answer){ // if the input the user enters is the same as the answer, print "You Are Correct" and increase grade
      System.out.println("\nYou are Correct!\n");
      grade += 1;
    }
    else{ // else print "Your answer is wrong" and then print the correct answer
      System.out.println("\nYour answer is wrong. \n The correct answer is " + answer + "\n");
    } 
    // return the grade integer
    return grade;
  }

  public static int subtraction(int number1, int number2){ // create a method for the subtraction question
    int grade = 0; // create local grade value 
    int answer = number1 - number2; // store answer to math problem as integer

    Scanner input = new Scanner(System.in); // create a scanner named "input"

    System.out.printf("What is %d %s %d? ", number1, "-", number2); // ask the user the math question
    int userInput = input.nextInt(); // store users answer as integer

    if(userInput == answer){ // if the input the user enters is the same as the answer, print "You Are Correct" and increase grade

      System.out.println("\nYou are Correct!\n");
      grade += 1;
    }
    else{ // else print "Your answer is wrong" and then print the correct answer
      System.out.println("\nYour answer is wrong. \n The correct answer is " + answer + "\n");
    }
    return grade; // return the grade integer

  }

  public static char convertGradeToLetter(int grade){ // create method to convert grade to letter grade equivalent
    // use a series of if-else-if statement to determin the letter grade equivalent of the users grade 
    if(grade >=9){ // if grade > or = 9, the user gets a A
      return 'A';
    }else if(grade >= 8){ // if grade > or = 8, the user gets a B
      return 'B';
    }else if (grade >= 7){ // if grade > or = 7, the user gets a C
      return 'C';
    }else if (grade >= 6){ // if grade > or = 6, the user gets a D
      return 'D';
    }else{ // if grade is lower than a 6, the user gets a F
      return 'F';
    }
  }
}
