
public class SudokuVerifier {
	

	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		
		
		return 0;
		
		//check
	}
	
	public int hasOnlyNumbers(String candidateSolution){
		if (candidateSolution.matches("[1-9]+") && candidateSolution.length() > 2){
			
			return 1;
		}
		
		return 0;	}
	
}
