
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		if(checkLenght(candidateSolution))return -5;
		if(checkFormat(candidateSolution))return -1;
		//if(checkSubGrids(candidateSolution))return -2;
		if(checkRows(candidateSolution))return -3;
		if(checkColumns(candidateSolution))return -4;
		
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	private void initializeChecker(Boolean[] checker){
		for(int i = 0; i<9; i++) checker[i]=false;
	}
	
	public boolean checkColumns(String candidateSolution){
		Boolean[] checker = new Boolean[9];
		int currentNumber;
		
		//Checks if all columns are valid
		for(int i = 0; i < 9; i++){
			initializeChecker(checker);
			for(int j = i; j < 81; j = j + 9){
				currentNumber = Character.getNumericValue(candidateSolution.charAt(j));
				if(checker[currentNumber-1]==false) checker[currentNumber-1]=true;
				else return true;
			}
		}
		return false;
	}
	
	public boolean checkRows(String candidateSolution){
		Boolean[] checker = new Boolean[9];
		int currentNumber;
		
		// Checks if all rows are valid
		for(int i=0; i<81; i = i + 9){
			initializeChecker(checker);
			for(int j=i; j<i+9; j++){
				currentNumber = Character.getNumericValue(candidateSolution.charAt(j));
				if(checker[currentNumber-1]==false) checker[currentNumber-1]=true;
				else return true;
			}
		}
		return false;
	}
	
	public boolean checkSubGrids(String candidateSolution){
		Boolean[] checker = new Boolean[9];
		int currentNumber;
		
		//Checks if all sub-grids are valid
		for(int i = 0; i<8; i = i + 3){
			initializeChecker(checker);
			for(int j = i; j<i+3; j++){
				for(int k = j; k<j+21; k = k+6){
					currentNumber = Character.getNumericValue(candidateSolution.charAt(j));
					if(checker[currentNumber-1]==false) checker[currentNumber-1]=true;
					else return true;
				}
			}
		}
		for(int i = 27; i<34; i = i + 3){
			initializeChecker(checker);
			for(int j = i; j<i+3; j++){
				for(int k = j; k<j+21; k = k+9){
					currentNumber = Character.getNumericValue(candidateSolution.charAt(j));
					if(checker[currentNumber-1]==false) checker[currentNumber-1]=true;
					else return true;
				}
			}
		}
		for(int i = 54; i<61; i = i + 3){
			initializeChecker(checker);
			for(int j = i; j<i+3; j++){
				for(int k = j; k<j+21; k = k+9){
					currentNumber = Character.getNumericValue(candidateSolution.charAt(j));
					if(checker[currentNumber-1]==false) checker[currentNumber-1]=true;
					else return true;
				}
			}
		}
		return false;
	}
	
	public boolean checkLenght(String candidateSolution){
		
		if(candidateSolution.length()!=81) return true;
		return false;
	}
	
	public boolean checkFormat(String candidateSolution){
		char currentChar;
		
		// Checks if every char is a positive number
		for(int i=0; i<81; i++){
			currentChar = candidateSolution.charAt(i);
			if(!Character.isDigit(currentChar) || currentChar=='0') return true;
		}
		return false;
	}

}
