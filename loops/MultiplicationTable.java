public class MultiplicationTable {
	public static void main(String[] args){
		int[][] grid = new int[10][10];
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				grid[i][j] = i * j;
			}
		}

		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.print(grid[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
