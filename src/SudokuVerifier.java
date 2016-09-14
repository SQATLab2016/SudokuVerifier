
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		int len = candidateSolution.length();
		// Will not accept anything else, must be correct length
		if (len != 81) {
			return -5;
		}
		
	    /*
		R1: A  cell in a Sudoku game can only store positive digits, i.e. 1...9.
		R3: A digit can appear only once in the rows of the global grid.
		R4: A digit can appear only once in the columns of the global grid.	     
		R2: All digits appear only once in a sub grid 3x3, i.e. they cannot repeat.

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
		
		// Rule #2
	    for (int i = 0, offset = 0; i < 8; i++, offset += 8) {
	        String row = candidateSolution.substring(offset, 8);
	        if (!isValidArray(row)) {
	        	return -3;
	        }
	    }
	    
	    // Valid
		return 0;
	}
	
	private boolean isValidArray(String array) {
		for (int i = 0; i < 9; i++) {
			String digit1 = array.substring(i, i);
			for (int j = i+1; j < (9-i); j++) {
				String digit2 = array.substring(j, j);
				if (digit1 == digit2) {
					return false;
				}
			}
		}
		return true;
	}
}
