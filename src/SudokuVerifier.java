
public class SudokuVerifier {
	
	public static int verify(String candidateSolution) {		
		
		
		for(int i=0; i<=81; i=i+9){
			String row = candidateSolution.substring(i,i+9);
			int intRow = Integer.parseInt(row);
			
			if (intRow != 45) //check rows
				return 1;
			
		}
		// returns 0 if the candidate solution is correct
		return 0;
		
	}
	
	public static int verifyLength(String candidateSolution) {		
		
		if (candidateSolution.length() == 81) 
			return 0;
		else
			return 1;
	}
}
