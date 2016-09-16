
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	public boolean verifyHorizontal(int x, int[] sudoku){
		int toTest = sudoku[x];
		for(int i = 0; i < sudoku.length; i++){
			if(sudoku[i] == toTest && i != x){
				return false;
			}
		}
		return true;
	}
	public boolean verifyVertical(int y, int x, int[][] sudoku){
		int toTest = sudoku[y][x];
		for(int i = 0; i < sudoku.length; i++){
			if(sudoku[x][i] == toTest && i != y){
				return false;
			}
		}
		return true;
	}
}
