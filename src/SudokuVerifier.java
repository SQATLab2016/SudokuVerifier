
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		// R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
	      for (char c : candidateSolution.toCharArray()) {
	    	  if (Character.isDigit(c) == false) {
	    		  return -1;
	    	  }
	      }
	      
	   // R2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
	   // R3: A digit can appear only once in the rows of the global grid.
	   // R4: A digit can appear only once in the columns of the global grid.
	      
	      return 0;
	}
}
