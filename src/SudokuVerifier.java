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
			res = verifyRows(candidateSolution);			
		}
			
		// returns 0 if the candidate solution is correct
		return res;
	}
	

	public int checkStringSequence(String sequence)	{
		
		for(int indx = 0; indx != 9; indx++) {
			char c = sequence.charAt(indx);
			StringBuilder tmp = new StringBuilder(sequence);
			tmp.deleteCharAt(indx);
			
			if(verifyOnlyOnce(c, tmp.toString()) == -1)
				return -1;
		}
			
		return 0;		
	}
	
	public int verifyOnlyOnce(char target, String candiateSolution)
	{
		if(candiateSolution.contains(Character.toString(target)))
			return -1;
		else				
			return 0;
	}
	
	private int verifyPositiveNumeric(String candidateSolution)
	{
		if(candidateSolution.matches("[1-9]+"))
			return 0;
		else
			return -1;
	}
	

	public int verifyRows(String candidateSolution) {		
		
		int res = 0;
		for(int indx = 0; indx != 9; indx++) {
			String row = candidateSolution.substring(indx*9, indx*9+9);
			res = checkStringSequence(row);
		}	
				
		if(res == -1)
			return -3;
		
		return 0;
	}
}
