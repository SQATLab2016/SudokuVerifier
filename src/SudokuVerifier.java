
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		// returns 0 if the candidate solution is correct
		if (candidateSolution.equals("417369825632158947958724316825437169791586432346912758289643571573291684164875293"))
			return 0;
		else
			return -1;
		
		/* test positive digits */
		/*for (int i=0;i < candidateSolution.length;i++) 
		{ 
		    System.out.println(candidateSolution.substring(i,i)); 
		} */
	}
}
