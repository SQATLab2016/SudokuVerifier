


public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		int res = 0;
		//check
		
		if(candidateSolution.length() != 81) {
			return -1;
		} else {		
			res = verifyPositiveNumeric(candidateSolution);			
		}	
		// returns 0 if the candidate solution is correct
		return res;
	}
	
	private int verifyPositiveNumeric(String canditateSolution)
	{
		if(canditateSolution.matches("[1-9]+"))
			return 0;
		else
			return -1;
	}
	
	
}
