
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		
		//check that candidate solution has exactly 9*9 chars
		if (checkCandidateSolutionLength(candidateSolution) == false) {
			return -1;
		}
		
		if (checkCandidateForInvalidChars(candidateSolution) == -1) {
			return -1;
		}
		
		
		//split candidate string to global rows -> string array
		String[] globalRows = splitCandidateToGlobalRows(candidateSolution);
		
		//use global rows to create global columns -> string array
		String[] globalColumns = createGlobalColumnsFromGlobalRows(globalRows);
		
		//use candidate string to create subgrids -> string array
		String[] subgrids = createSubgridsFromCandidate(candidateSolution);
		
		if (checkSudokuArray(globalRows) != 0) {
			return checkSudokuArray(globalRows);
		}
		
		if (checkSudokuArray(globalColumns) != 0) {
			return checkSudokuArray(globalColumns);
		}
		
		if (checkSudokuArray(subgrids) != 0) {
			return checkSudokuArray(subgrids);
		}
		
		return 0;
		
		//check
	}
	
	private String[] splitCandidateToGlobalRows(String candidateSolution) {
		String[] globalRows = new String[9];
		String tempString;
		
		for(int i = 0; i < 9; i++) {
			if(i == 0) tempString = candidateSolution.substring(i, i * 9 - 1);
			else tempString = candidateSolution.substring(i * 9, i * 9 + 9);
			globalRows[i] = tempString;
		}
		//Implement
		return globalRows;
	}
	
	private String[] createGlobalColumnsFromGlobalRows(String[] globalRows) {
		String[] globalColumns = new String[9];
		//Implement
		return globalColumns;
	}
	
	private String[] createSubgridsFromCandidate(String candidateSolution) {
		String[] subgrids = new String[9];
		//Implement
		return subgrids;
	}
	
	private int checkSudokuArray(String[] sudokuArray) {
		return 0;
	}
	
	private int checkCandidateForInvalidChars(String candidateSolution) {
		if (candidateSolution.matches("[0-9]+")) {
			return 0;
		}
		else return -1;
	}
	
	private boolean checkCandidateSolutionLength(String candidateSolution) {
		if (candidateSolution.length() != 81) {
			return false;
		}
		else return true;
	}
}
