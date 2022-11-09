import java.util.*;

class Lab12{
  public static void main(String args[]){
    callSort();
  }  

  public static void callSort(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the data type that you would like to sort(enter \"int\", \"float\", or \"string\": ");
    String dataType = input.next().toLowerCase();
    
    if("int".equals(dataType)){
      int[] userValues = {null, null, null};
    }

    for(int i = 0; i < 3; i++){
      System.out.printf("Enter %s #%d: ", dataType, i+1);
      if("int".equals(dataType)){
        userValues[i] = Integer.parseInt(input.next());      
      }else if("float".equals(dataType)){
        userValues[i] = Double.parseDouble(input.next());
      }else if("string".equals(dataType)){
        userValues[i] = input.next();
      }
    }
    System.out.println(sortThreeValues(userValues));
  }
  public static void sortThreeValues(int[] userValues){
  }
  public static void sortThreeValues(double[] userValues){
  }
  public static void sortThreeValues(String[] userValues){
  }
}
