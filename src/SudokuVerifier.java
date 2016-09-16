
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
	      int n=0;
	      for (char c : candidateSolution.toCharArray()) {
	    	  if (Character.isDigit(c) == false) {
	    		  return -1;
	    	  }
	      }
	      
	      return 0;
	}
}
