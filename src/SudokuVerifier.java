
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		if(!checkInputStringLength(candidateSolution) || !checkInputStringContainsOnlyPostiveInt(candidateSolution)){
			return 1;
		}
		// returns 0 if the candidate solution is correct
		
		return 0;
		
		
		
		//check
	}
	
	public boolean checkInputStringLength(String candidateSolution){
		boolean inputStringEquals81 = (candidateSolution.length() == 81) ? true : false;
		return inputStringEquals81;
	}
	
	public boolean checkInputStringContainsOnlyPostiveInt(String candidateSolution){
		boolean isPostiveInt = false;
		for(int i = 0; i < candidateSolution.length(); i++){
			char character = candidateSolution.charAt(i);
			try{
				Integer.parseInt(String.valueOf(character));
				isPostiveInt = true;
			}catch(NumberFormatException ex){
				return isPostiveInt = false;
			}
		}
		return isPostiveInt;
	}
	
}
