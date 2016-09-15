import java.util.Map;

public class SudokuVerifier {
	
	Map<Integer, Integer> sudokuMapping;
	int rowMultiplayer = 42;
	
	public int verify(String candidateSolution) {
		
		
		
		
		
		// returns 0 if the candidate solution is correct
		return 0;
	}
	private int SpliceStringToMap(String str){
		int index = 0;
		for (int row=0; row<9; row++){
			for (int column=0; column<9; column++){
				char value = str.charAt(index);
				int cellValue = this.GetNumberFromString(value);
				if (cellValue <= 0 && cellValue > 9){
					return -1;
				}
				else {
					this.sudokuMapping.put((row*this.rowMultiplayer+column), cellValue);
				}
				index++;
			}
		}
		
		return 0;
	}
	private boolean TestStringLenght(String str){
		if (str.length() != 81){
			return false;
		}
		return true;
	}
	private int GetNumberFromString(char str){
		String singleChar = String.valueOf(str);
		try {
			int returnValue = Integer.parseInt(singleChar);
			return returnValue;
		} catch (NumberFormatException e){
			return -1;
		}
	}
}
