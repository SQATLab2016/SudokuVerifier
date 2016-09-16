
public class SudokuVerifier {
	

	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		
		
		return 0;
		
		//check
	}
	
	public int hasOnlyNumbers(String candidateSolution){
		if (candidateSolution.matches("[1-9]+") && candidateSolution.length() == 81){
			
			return 1;
		}
		
		return 0;	}
	
	public int checkDuplicates(String candidateSolution){
		String FirstRow=candidateSolution.substring(0,9);
		boolean containsOne=FirstRow.contains("1");
		if (containsOne == false){
			return 1;
		}
		return 0;
		
	}
}
