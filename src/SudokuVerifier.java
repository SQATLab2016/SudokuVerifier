
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		
		return 0;
		
		//check
	}
	
	public int VerifySudokuStringLengthIsCorrect(String candidateSolution){
		
		int length = candidateSolution.length();
		
		if(length == 81){
			return 1;
		} else {
			return 0;
		}
	}
}
