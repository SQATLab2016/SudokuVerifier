
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		if (onlyPositives(candidateSolution) == -1){
			return -1;
		}else {
		return 0;
		}
		//check
	}
	public int onlyPositives(String candidateSolution){
		
		String[] solution = candidateSolution.split("");
		
		if (solution.length != 81){
			return -1;
		}
		else{
			for(int i = 0; i < 81; i++){
				try {
					int test = Integer.parseInt(solution[i]);
				} catch(NumberFormatException ex){
					return -1;
				}
			}
			return 0;
		}	
	}
	

	
}
