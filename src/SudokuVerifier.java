
public class SudokuVerifier {
	
	
	
	
	public int verify(int candidateSolution){
		// returns 0 if the candidate solution is correct
		// returns 1 if the candidate solution is not correct
	 
	//nt num = Integer.parseInt(candidateSolution);
		int min = 1;
		int max = 9;
		
		if(candidateSolution < min  || candidateSolution > max){
		
		return 0;
		}else {
			
		return 1;
			
		}
		//check
	}
}
