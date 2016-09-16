import java.util.Vector;

public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		int res = 0;
		//check
		
		if(candidateSolution.length() != 81) {
			return -1;
		} else {		
			res = verifyPositiveNumeric(candidateSolution);			
		}	
		
		if(res == 0) {
			res = verifyColumsRows(candidateSolution);			
		}
			
		// returns 0 if the candidate solution is correct
		return res;
	}
	
	private int verifyColumsRows(String candidateSolution) {
		Vector<String> parts = new Vector<String>();
		
		for(int indx = 0; indx != 9; indx++) {
			parts.add(candidateSolution.substring(indx*9, indx*9+9));
		}
		
		
		
		return 0;
	}
	
	public int verifyOnlyOnce(String candidateSolution) {
		
		// We should really iterate here...
		for(int indxChar = 0; indxChar != 9; indxChar++) {
			char orig = candidateSolution.charAt(candidateSolution);
			for(int indxTarget = 0; indxTarget != 9; indxChar++) {
				if(indxChar != indxTarget) {
					char c = candidateSolution.charAt(candidateSolution);
					if(orig == c)
						return -1;
				}
			}
				
		}
			
		
		return 0;
	}
	
	
	private int verifyPositiveNumeric(String canditateSolution)
	{
		if(canditateSolution.matches("[1-9]+"))
			return 0;
		else
			return -1;
	}
	
	
}
