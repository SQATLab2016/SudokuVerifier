
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		// if the string has only integers
		if(candidateSolution.matches("^[0-9]+$") && candidateSolution.length() == 81) {
			
			// loop through all of the nine rows.
			for(int i = 0; i < 9; i++) {
				
				// create substring
				String subString = candidateSolution.substring(i, i+9);
				
				// iterate through substring
				for (char c : subString.toCharArray()) {
					
				}
			}
			
			// solution is correct.
			return 0;
		}
		
		// if the solution string contains chars or it's length is not 81.
		return -1;
	}
}
