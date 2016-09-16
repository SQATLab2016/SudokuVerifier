import org.junit.*;
import static org.hamcrest.BaseMatcher.*;

public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// Rule 1 violated
		if ( ! (hasValidNumberOfChars(candidateSolution) && containsOnlyValidCharacters(candidateSolution))) {
			return -1;
		}
		
		// Rule 2 violated
		
		
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	public boolean hasValidNumberOfChars(String possSol) {
		if (possSol.length() != 81) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean containsOnlyValidCharacters(String possSol) {
		if (possSol.matches("\\d*")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String[] splitIntoRows(String possSol) {		
		String[] rows = new String[9];
		for (int i = 0; i < 9; i++) {
			rows[i] = possSol.substring(i*9, i*10);
		}		
		return rows;
	}
	
	private char[] getRowEntries(String row) {
		char[] rowEntries = new char[9];
		return rowEntries;
	}
	

	public static void main(String[] args) {

		String a = "abcd";
		char entry = a.charAt(2);
		System.out.println(entry);
		
		/*
		assertThat("", anyOf(is(-2), is(-3)));
		assertTrue
		*/
	}

}
