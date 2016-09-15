
public class SudokuVerifier {
	
	private String[] globalRows;
	public String[] getGlobalRows() {
		return this.globalRows;
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
		this.globalRows = new String[9];
		this.globalColumns = new String[9];
		this.subgrids = new String[9];
		
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
		this.subgrids = createSubgridsFromGlobalRowsAndColumns(candidateSolution);
		
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
			if(i == 0) tempString = candidateSolution.substring(i, 9);
			else tempString = candidateSolution.substring(i * 9, i * 9 + 9);
			globalRows[i] = tempString;
			tempString = "";
		}

		return globalRows;
	}
	
	private String[] createGlobalColumnsFromGlobalRows(String[] globalRows) {
		String[] globalColumns = new String[9];
		StringBuilder tempString = new StringBuilder();
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				tempString.append(globalRows[j].charAt(i));
			}
			globalColumns[i] = tempString.toString();
			tempString.setLength(0);
		}
		//Implement
		return globalColumns;
	}
	
	private String[] createSubgridsFromGlobalRowsAndColumns(String[] globalRows, String[] globalColumns) {
		String[] subgrids = new String[9];
		StringBuilder tempString = new StringBuilder();
		
		
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
