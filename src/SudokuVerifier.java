import java.util.Arrays;

public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
    
		
	    String forCheck = candidateSolution;
		while(!forCheck.isEmpty()){
		  	if((forCheck.charAt(0)=='0'|| forCheck.charAt(0)=='1' ||
		  			forCheck.charAt(0)=='2'|| forCheck.charAt(0)=='3' ||
		  			forCheck.charAt(0)=='4'|| forCheck.charAt(0)=='5' ||
		  			forCheck.charAt(0)=='6'|| forCheck.charAt(0)=='7' ||
		  			forCheck.charAt(0)=='8'|| forCheck.charAt(0)=='9')) return -1;		
			
			// returns 0 if the candidate solution is correct
		forCheck = forCheck.substring(1);
		}
		char numbers[]= {0,1,2,3,4,5,6,7,8,9};
		
		char[] firstGrid = {candidateSolution.charAt(0),candidateSolution.charAt(1),candidateSolution.charAt(2),
				candidateSolution.charAt(9),candidateSolution.charAt(10),candidateSolution.charAt(11),
				candidateSolution.charAt(18),candidateSolution.charAt(19),candidateSolution.charAt(20)};
		Arrays.sort(firstGrid);
	    if(!numbers.equals(firstGrid)) return 2; 	
		return 0;
		//check
	}
}
