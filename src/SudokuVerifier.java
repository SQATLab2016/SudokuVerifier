
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		//check
		
		if(candidateSolution.length() != 81) {
			return -1;
		} else {
			verifyColums(candidateSolution);			
		}	
		// returns 0 if the candidate solution is correct
		return 0;
	}
	
	private int verifyColums(String canditateSolution)
	{
		return 0;		
	}
}
