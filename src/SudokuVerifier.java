
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		int[][] sudoku = new int[9][9];
		int mark = 0;
		for(int i = 0; i < sudoku[0].length; i++){
			for(int j = 0; j < sudoku.length; j++){
				sudoku[i][j] = candidateSolution.charAt(mark);
				mark++;
			}
		}
		return 0;
		
		//check
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
