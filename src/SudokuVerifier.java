
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		//Check the length of numbers
		if(candidateSolution.length()!=81){
			return -1; //-5 will be any other error EDIT -1 is used to check the format of string
		}
		
		//Insert to data structure
		Integer[][] sudokuTable = new Integer[9][9];
		int stringIndex=0;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				//Rule 1: check if all are positive digits
				Integer digit = Integer.getInteger(String.valueOf(candidateSolution.charAt(stringIndex)));
				if(digit<1 || digit >9){
					return -1;
				}
				sudokuTable[i][j]= digit;
				stringIndex++;
			}
		}
		
		//Check rows
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				int checkedDigit = sudokuTable[x][y];
			}
		}
		
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
}
