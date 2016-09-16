
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	public boolean verityVertical(char x, char[] sudoku){
		char toTest = sudoku[x];
		for(int i = 0; i < sudoku.length; i++){
			if(sudoku[i] == toTest && i != x){
				return false;
			}
		}
		return true;
	}
}
