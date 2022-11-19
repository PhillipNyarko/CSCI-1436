class semesterProject{
    public static int gridRows = 6;
    public static int gridCols = 7;

		public static final String RED  = "\u001B[31m";
		public static final String BLUE = "\u001B[34m";
		public static final String ANSI_RESET = "\u001B[0m";
		
    public static String redChip =  RED + " ◍ " + ANSI_RESET;
    public static String blueChip = BLUE + " ◍ " + ANSI_RESET;

		public static String[][] gameBoard = new String[gridRows][gridCols]; 
    public static String[] selectionGrid = new String[gridCols];

    public static String currentPlayer = blueChip; // redChip starts as initial player
    public static int playerPosition = 0; // first players chip starts placed to the far left

	public static void main(String args[]){
		initGrid();

	  boolean running = true;
    while(running){
    }
	}

  public static void update(){
    drawGrid(); // call the draw grid function to draw everything
    clearScreen();
  }

  public static void initGrid(){
    // fill the selection grid with empty space
   	clearSelectionGrid();
    selectionGrid[0] = currentPlayer; // first space holds the piece for player one

    for(int i = 0; i < gameBoard[0].length; i++){
        for(int j = 0; j < gameBoard.length; j++){
					gameBoard[j][i] = " ◌ "; // fill each index of the game board/2d array with an empty slot character
        }
    }
    drawGrid(); // call the draw grid function to draw everything
  }
  
  public static void drawGrid(){
    //print the selection row 
    for(int i = 0; i < selectionGrid.length; i++){
      System.out.print(selectionGrid[i]); // print the value of each element of the row
    }
    System.out.println(); // print new line after the selection row is printed
                          
    //print the connect-four grid 
    for(int i = 0; i < gameBoard.length; i++){
        for(int j = 0; j < gameBoard[0].length; j++){
          System.out.print(gameBoard[i][j]); // print value of each index in corresponding row of grid
        }
        System.out.println(); // print new line after each row is printed
    }

    // print the bottom barrier with title
		System.out.print(" ");
    for(int i = 0; i < 5; i++){
      System.out.print("≪");
    }
    System.out.print("CONNECT 4");
    for(int i = 0; i < 5; i++){
      System.out.print("≫");
    }
  }

	public static void moveRight(){
		if(playerPosition != selectionGrid.length - 1){
			playerPosition += 1;
			clearSelectionGrid();
			selectionGrid[playerPosition] = currentPlayer;
		}else{
			clearSelectionGrid();
			playerPosition = 0;
			selectionGrid[playerPosition] = currentPlayer;
		}      
	}

	public static void moveLeft(){
		if(playerPosition != 0){
			playerPosition -= 1;
			clearSelectionGrid();
			selectionGrid[playerPosition] = currentPlayer;
		}else{
			playerPosition = selectionGrid.length - 1;
			clearSelectionGrid();
			selectionGrid[playerPosition] = currentPlayer;
		}
	}

	public static void dropPiece(){
		// place a piece in the lowest availible space in the columnn then switch players
		if(currentPlayer == redChip){
			currentPlayer = blueChip;
		}else{
			currentPlayer = redChip;
		}
	}
	
	public static void clearScreen(){
		System.out.print("\033[H\033[2J");  
  	System.out.flush();
	}

	public static void clearSelectionGrid(){
		for(int i = 0; i < selectionGrid.length; i++){
			selectionGrid[i] = "   ";
    }
	}
}
