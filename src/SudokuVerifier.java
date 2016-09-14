
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {

		int len = candidateSolution.length();
		// Will not accept anything else, must be correct length
		if (len != 81) {
			return -5;
		}
		
	    /*
		R1: A  cell in a Sudoku game can only store positive digits, i.e. 1...9.
		R2: All digits appear only once in a sub grid 3x3, i.e. they cannot repeat.
		R3: A digit can appear only once in the rows of the global grid.
		R4: A digit can appear only once in the columns of the global grid.	     

		Return 	0: means it is a valid Sudoku solution
		Return -1: means it is violating Rule #1
		Return -2: means it is violating Rule #2
		Return -3: means it is violating Rule #3
		Return -4: means it is violating Rule #4
		
		Additional return values:
		Return -5: means input is incorrect in length
		*/
	    
		// Rule #1
		if (!candidateSolution.matches("[1-9]")) {
			return -1; 
		}
		
		/*
	    String rows[] = new String[8];
	    for (int i = 0, offset = 0; i < 8; i++, offset += 8) {
	        rows[i] = candidateSolution.substring(offset, 8);
	    }
	    */
	    // Valid
		return 0;
		
		//check
	}
}
