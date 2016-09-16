
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
        
	    String forCheck = candidateSolution;
		while(!forCheck.isEmpty()){
		  	if(!(forCheck.charAt(0)=='0'|| forCheck.charAt(0)=='1' ||
		  			forCheck.charAt(0)=='2'|| forCheck.charAt(0)=='3' ||
		  			forCheck.charAt(0)=='4'|| forCheck.charAt(0)=='5' ||
		  			forCheck.charAt(0)=='6'|| forCheck.charAt(0)=='7' ||
		  			forCheck.charAt(0)=='8'|| forCheck.charAt(0)=='9')) return -1;	
			
			
			
			// returns 0 if the candidate solution is correct
		forCheck = forCheck.substring(1);
		}
			return 0;
		
		//check
	}
}
