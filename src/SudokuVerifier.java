
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	public boolean verityVertical(int x, int y, int[] sudoku){
		int toTest = sudoku[y][x];
		for(int i = 0; i < sudoku[0].length; i++){
			if(sudoku[y][i] == toTest && i != x){
				return false;
			}
		}
		return true;
	}
}
