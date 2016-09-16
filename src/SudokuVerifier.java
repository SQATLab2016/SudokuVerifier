
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
		boolean containsTwo=FirstRow.contains("2");
		boolean containsThree=FirstRow.contains("3");
		boolean containsFour=FirstRow.contains("4");
		boolean containsFive=FirstRow.contains("5");
		boolean containsSix=FirstRow.contains("6");
		boolean containsSeven=FirstRow.contains("7");
		boolean containsEight=FirstRow.contains("8");
		boolean containsNine=FirstRow.contains("9");
		if (containsOne == false){
			return 1;
		}else if (containsTwo == false){
			return 1;
		}else if (containsThree == false){
			return 1;
		}else if (containsFour == false){
			return 1;
		}else if (containsFive == false){
			return 1;
		}else if (containsSix == false){
			return 1;
		}else if (containsSeven == false){
			return 1;
		}else if (containsEight == false){
			return 1;
		}else if (containsNine == false){
			return 1;
		}
		
		return 0;
		
	}
	
	public int checkNineRows(String candidateSolution){
		return 0;
	}
	
}
