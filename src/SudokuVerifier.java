
public class SudokuVerifier {
	/*
		R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
		R2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
		R3: A digit can appear only once in the rows of the global grid.
		R4: A digit can appear only once in the columns of the global grid.
	*/
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		int[][] sudoku = new int[9][9];
		int mark = 0;
		for(int i = 0; i < sudoku[0].length; i++){
			for(int j = 0; j < sudoku.length; j++){
				sudoku[i][j] = Character.getNumericValue(candidateSolution.charAt(mark));
				mark++;
			}
		}
		for(int i = 0; i < sudoku.length; i++){
			for(int j = 0; j < sudoku.length; j++){
				if(verifyNumber(i, j, sudoku) != 0){
					return verifyNumber(i, j, sudoku);
				}
			}
		}
		return 0;
	}
	public int verifyNumber(int y, int x, int[][] sudoku){
		if(!verifyHorizontal(y, x, sudoku)){
			return -4;
		}
		if(!verifyVertical(y, x, sudoku)){
			return -3;
		}
		if(!verifyBox(y, x, sudoku)){
			return -2;
		}
		if(sudoku[y][x] > 9 || sudoku[y][x] < 1){
			return -1;
		}
		return 0;
	}
	//Verify Columns
	public boolean verifyHorizontal(int y, int x, int[][] sudoku){
		int toTest = sudoku[y][x];
		for(int i = 0; i < sudoku.length; i++){
			if(sudoku[y][i] == toTest && i != x){
				return false;
			}
		}
		return true;
	}
	//Verify Rows
	public boolean verifyVertical(int y, int x, int[][] sudoku){
		int toTest = sudoku[y][x];
		for(int i = 0; i < sudoku.length; i++){
			if(sudoku[i][x] == toTest && i != y){
				return false;
			}
		}
		return true;
	}
	//Verify 3x3
	public boolean verifyBox(int y, int x, int[][] sudoku){
		int toTest = sudoku[y][x];
		int xLimit = x/3 * 3;
		int yLimit = y/3 * 3;
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				//If the same number
				if((xLimit + j == x && yLimit + i == y))
					continue;
				if(sudoku[yLimit +i][xLimit + j] == toTest){
					return false;
				}
			}
		}
		
		return true;
		
	}
}
