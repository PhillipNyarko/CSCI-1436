class question1 { public static void main(String args[]) {
    int matrix[][] = {{1, 0, 2, 2}, 
                      {0, 0, 1, 3},
                      {0, 1, 1, 2}};

    int total = 0;
    int rows = matrix.length;
    int cols = matrix[0].length;

    for(int j = 0; j < cols; j++){  
      total = 0;  
      for(int k = 0; k < rows; k++){  
        total += matrix[k][j];  
      }
      System.out.print(total + " ");
    }
  }
}
