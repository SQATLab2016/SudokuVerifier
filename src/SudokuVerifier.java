
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		
		if (VerifySudokuStringLengthIsCorrect(candidateSolution) == 1){
			
			if(VerifyDigitsArePositive(candidateSolution) == 1){
				return -1;
			} else {
				return 0;
			}
			
		} else {
			return -5;
		}
		
		//check
	}
	
	// Verifies that length of the string is correct
	public int VerifySudokuStringLengthIsCorrect(String candidateSolution){
		
		int length = candidateSolution.length();
		
		if(length == 81){
			return 1;
		} else {
			return 0;
		}
	}
	
	// Verifies that there aren't negative digits in string
	public int VerifyDigitsArePositive(String candidateSolution){
		
		if(candidateSolution.contains("-")){
			return 1;
		} else {
			return 0;
		}
	}
}
