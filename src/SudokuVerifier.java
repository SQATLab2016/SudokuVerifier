
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
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
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				
			}
		}
		
		return true;
		
	}
}
