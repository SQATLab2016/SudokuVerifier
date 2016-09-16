
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	private boolean validNumberOfChar(String possSol) {
		if (possSol.length() != 81) {
			return false;
		} else {
			return true;
		}
	}
	
	private String[] splitIntoRows(String possSol) {		
		String[] rows = new String[9];
		for (int i = 0; i < 9; i++) {
			rows[i] = possSol.substring(i*9, i*10);
		}		
		return rows;
	}
	
	private char getRowEntries(String row) {
		return 'a';
	}
	

	public static void main(String[] args) {

		String a = "abcd";
		//System.out.println(a.substring(2, 3));
		
		char entry = a.charAt(1);
		System.out.println(entry);
		
		/*
		assertThat(result, anyOf(is(-2), is(-3)));
		assertTrue
		*/
	}

}
