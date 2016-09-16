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
			res = verifyColumsRows(candidateSolution);			
		}
			
		// returns 0 if the candidate solution is correct
		return res;
	}
	
	private int verifyRows(String candidateSolution) {
		Vector<String> rows = new Vector<String>();
		
		for(int indx = 0; indx != 9; indx++) {
			rows.add(candidateSolution.substring(indx*9, indx*9+9));
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
	
	
}
