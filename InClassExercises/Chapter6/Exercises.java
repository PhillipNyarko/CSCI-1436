import java.util.concurrent.TimeUnit;

class Exercises{
	public static void main(String args[]){
		wavy(11);
	}

	public static void wavy(int size){
		String[][] grid = new String[size][size];
		try{
			while(true){
				for(int i=0; i<size; i++){
					int move = 0;
					for(int j=0; j<size; j++){
						System.out.print(grid[i][j]);
						grid[(int)(size/2)][(int)(size/2)+move] = "1 ";
						grid[(int)(size/2)][(int)(size/2)-move] = "1 ";
					}
					System.out.println();		
				}
			
			TimeUnit.SECONDS.sleep(1);
			}
		}catch(Exception e){
			System.out.println("Oops! Something went wrong!");
		}
	}

	public static void clearScreen(){
		 System.out.print("\033[H\033[2J");  
  		 System.out.flush();
	}
}

