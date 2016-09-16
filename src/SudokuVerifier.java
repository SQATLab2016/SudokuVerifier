
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		int[][] sudoku = new int[9][9];
		int mark = 0;
		for(int i = 0; i < sudoku[0].length; i++){
			for(int j = 0; j < sudoku.length; j++){
				sudoku[i][j] = I
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
		
		//check
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
		return 0;
	}
	
	public boolean verifyHorizontal(int y, int x, int[][] sudoku){
		int toTest = sudoku[y][x];
		for(int i = 0; i < sudoku.length; i++){
			if(sudoku[y][i] == toTest && i != x){
				return false;
			}
		}
		return true;
	}
	public boolean verifyVertical(int y, int x, int[][] sudoku){
		int toTest = sudoku[y][x];
		for(int i = 0; i < sudoku.length; i++){
			if(sudoku[i][x] == toTest && i != y){
				return false;
			}
		}
		return true;
	}
	public boolean verifyBox(int y, int x, int[][] sudoku){
		int toTest = sudoku[y][x];
		int xLimit = x/3 * 3;
		int yLimit = y/3 * 3;
		
		for(int i = xLimit; i < xLimit+3; i++){
			for(int j = yLimit; j < yLimit+3; j++){
				if(sudoku[i][j] == toTest && sudoku[i][j] != sudoku[y][x]){
					return false;
				}
			}
		}
		
		return true;
		
	}
}
