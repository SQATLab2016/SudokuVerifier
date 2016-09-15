
public class SudokuVerifier {
	
	private String[] globalRows;
	public String[] getGlobalRows() {
		return globalRows;
	}

	private String[] globalColumns;
	public String[] getGlobalColumns() {
		return globalColumns;
	}

	private String[] subgrids;	
	public String[] getSubgrids() {
		return subgrids;
	}

	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		
		//check that candidate solution has exactly 9*9 chars
		if (checkCandidateSolutionLength(candidateSolution) == false) {
			return -1;
		}
		
		if (checkCandidateForInvalidChars(candidateSolution) == false) {
			return -1;
		}
		
		
		//split candidate string to global rows -> string array
		this.globalRows = splitCandidateToGlobalRows(candidateSolution);
		
		//use global rows to create global columns -> string array
		this.globalColumns = createGlobalColumnsFromGlobalRows(this.globalRows);
		
		//use candidate string to create subgrids -> string array
		this.subgrids = createSubgridsFromCandidate(candidateSolution);
		
		if (checkSudokuArray(this.globalRows) != 0) {
			return checkSudokuArray(this.globalRows);
		}
		
		if (checkSudokuArray(this.globalColumns) != 0) {
			return checkSudokuArray(this.globalColumns);
		}
		
		if (checkSudokuArray(this.subgrids) != 0) {
			return checkSudokuArray(this.subgrids);
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
	
	private boolean checkCandidateForInvalidChars(String candidateSolution) {
		if (candidateSolution.matches("[0-9]+")) {
			return true;
		}
		else return false;
	}
	
	private boolean checkCandidateSolutionLength(String candidateSolution) {
		if (candidateSolution.length() != 81) {
			return false;
		}
		else return true;
	}
}
