import java.util.Arrays;

public class temp {
  public static void main(String args[]) {
    int matrix[][] = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}, {16, 17, 18, 19}};
    int total = 0;

    for(int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        total += matrix[i][j];
      }
    }
    System.out.println(total);
  }
}
