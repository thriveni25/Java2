package logicalpackage;

public class KnightChess {
	
	public static void main (String[] args) {
		
		int[][] board = new int[8][8];
		
		int startingRow = 0;
		int startingCol = 0;
		
		board[startingRow][startingCol] = 1;
		
		int moves = 1;
		
		int currentRow = startingRow;
		int currentCol = startingCol;
		
		while (moves < 64) {
			
			//Move one up and two right
			if (currentRow-1 >= 0 && currentCol+2 < 8){
				if (board[currentRow-1][currentCol+2] == 0) {
					board[currentRow-1][currentCol+2] = ++moves;
					currentRow = currentRow-1;
					currentCol = currentCol+2;
					continue;
				}
			}
			
			//Move two up and one right
			if (currentRow-2 >= 0 && currentCol+1 < 8){
				if (board[currentRow-2][currentCol+1] == 0) {
					board[currentRow-2][currentCol+1] = ++moves;
					currentRow = currentRow-2;
					currentCol = currentCol+1;
					continue;
				}
			}
			
			//Move two up and one left
			if (currentRow-2 >= 0 && currentCol-1 >= 0){
				if (board[currentRow-2][currentCol-1] == 0) {
					board[currentRow-2][currentCol-1] = ++moves;
					currentRow = currentRow-2;
					currentCol = currentCol-1;
					continue;
				}
			}
			
			//Move one up and two left
			if (currentRow-1 >= 0 && currentCol-2 >= 0){
				if (board[currentRow-1][currentCol-2] == 0) {
					board[currentRow-1][currentCol-2] = ++moves;
					currentRow = currentRow-1;
					currentCol = currentCol-2;
					continue;
				}
			}
			
			//Move one down and two right
			if (currentRow+1 < 8 && currentCol+2 < 8){
				if (board[currentRow+1][currentCol+2] == 0) {
					board[currentRow+1][currentCol+2] = ++moves;
					currentRow = currentRow+1;
					currentCol = currentCol+2;
					continue;
				}
			}
			
			//Move two down and one right
			if (currentRow+2 < 8 && currentCol+1 < 8){
				if (board[currentRow+2][currentCol+1] == 0) {
					board[currentRow+2][currentCol+1] = ++moves;
					currentRow = currentRow+2;
					currentCol = currentCol+1;
					continue;
				}
			}
			
			//Move two down and one left
			if (currentRow+2 < 8 && currentCol-1 >= 0){
				if (board[currentRow+2][currentCol-1] == 0) {
					board[currentRow+2][currentCol-1] = ++moves;
					currentRow = currentRow+2;
					currentCol = currentCol-1;
					continue;
				}
			}
			
			//Move one down and two left
			if (currentRow+1 < 8 && currentCol-2 >= 0){
				if (board[currentRow+1][currentCol-2] == 0) {
					board[currentRow+1][currentCol-2] = ++moves;
					currentRow = currentRow+1;
					currentCol = currentCol-2;
					continue;
				}
			}
			
			//If no moves are available, backtrack
			for (int row = 0; row < 8; row++) {
				for (int col = 0; col < 8; col++) {
					if (board[row][col] == moves) {
						currentRow = row;
						currentCol = col;
						moves--;
						break;
					}
				}
			}
			
		}
		
		//Print the board
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				System.out.print(board[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
	
}