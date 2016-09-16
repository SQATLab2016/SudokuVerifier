
public class SudokuVerifier {
	
	String correctSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String incorrectSolution = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	
	public String candidateSolution;
	
	public int verify(String candidateSolution) {
		
		// Returns 0 if the candidate solution is correct	
		if (candidateSolution == correctSolution) {
			
		}
		return 0;
		
		// Return -1 if violating Rule #1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
		
		// Return -2 if violating Rule #2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
		
		// Return -3 if violating Rule #3: A digit can appear only once in the rows of the global grid.
		
		// Return -4 if violating Rule #4: A digit can appear only once in the columns of the global grid.
		
		//check
	}
}
