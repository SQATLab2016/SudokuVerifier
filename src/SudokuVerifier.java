
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		if(candidateSolution.length()!=81) return -5;
		
		Boolean[] checker = new Boolean[9];
		int currentNumber;
		char currentChar;
		
		// Checks if every char is a positive number
		for(int i=0; i<81; i++){
			currentChar = 'a';
			if(!Character.isDigit(currentChar) && currentChar==0) return -1;
		}
		
		// Checks if all rows are valid
		for(int i=0; i<81; i = i + 9){
			initializeChecker(checker);
			for(int j=i; j<i+9; j++){
				currentNumber = Character.getNumericValue(candidateSolution.charAt(j));
				//currentNumber = (int) candidateSolution.charAt(j) - '0';
				if(checker[currentNumber-1]==false) checker[currentNumber-1]=true;
				else return -3;
			}
		}
		
		//Checks if all columns are valid
		for(int i = 0; i < 9; i++){
			initializeChecker(checker);
			for(int j = i; j < 81; j = j + 9){
				currentNumber = Character.getNumericValue(candidateSolution.charAt(j));
				//currentNumber = (int) candidateSolution.charAt(j) - '0';
				if(checker[currentNumber-1]==false) checker[currentNumber-1]=true;
				else return -4;
			}
		}

		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	private void initializeChecker(Boolean[] checker){
		for(int i = 0; i<9; i++) checker[i]=false;
	}
}
