


public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		int res = 0;
		//check
		
		if(candidateSolution.length() != 81) {
			return -1;
		} else {		
			res = verifyNumbers(candidateSolution);			
		}	
		// returns 0 if the candidate solution is correct
		return res;
	}
	
	private int verifyNumbers(String canditateSolution)
	{
		
		return 0;		
	}
	
	
}
