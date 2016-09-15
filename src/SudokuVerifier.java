import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SudokuVerifier {
	
	private Map<Integer, Integer> sudokuMapping;
	int rowMultiplayer = 42;
	
	public SudokuVerifier(){
		this.sudokuMapping = new HashMap<Integer, Integer>();
	}
	
	public int verify(String candidateSolution) {
		
		if (!this.TestStringLenght(candidateSolution)){
			return -1;
		}
		int spliceResult =this.SpliceStringToMap(candidateSolution); 
		if (spliceResult != 0){
			return spliceResult;
		}
		int SubGridTest = this.TestSubGrids();
		if (SubGridTest != 0){
			return SubGridTest;
		}
		int LineTestResult = this.TestRows();
		if (LineTestResult != 0){
			return LineTestResult;
		}
		int ColumnTest = this.TestColumns();
		if (ColumnTest != 0){
			return ColumnTest;
		}
		
		
		// returns 0 if the candidate solution is correct
		return 0;
	}
	private int TestRows() {
		List<Integer> usedNumbers = new ArrayList<Integer>();
		for (int row=0; row<9; row++){
			for (int col=0; col<9; col++)
			{
				int value = this.GetValueByCoordinates(row, col);
				if (usedNumbers.contains(value)){
					return -2;
				}
				else {
					usedNumbers.add(value);
				}
			}
			usedNumbers.clear();
		}
		return 0;
	}
	private int TestColumns(){
		List<Integer> usedNumbers = new ArrayList<Integer>();
		for (int col=0; col<9; col++){
			for (int row=0; row<9; row++)
			{
				int value = this.GetValueByCoordinates(row, col);
				if (usedNumbers.contains(value)){
					return -3;
				}
				else {
					usedNumbers.add(value);
				}
			}
			usedNumbers.clear();
		}
		
		return 0;
	}
	private int TestSubGrids(){
		for (int row = 0; row<9; row +=3){
			for (int col = 0; col<9; col +=3){
				int result = this.TestSingleSubGrid(row, col);
				if (result != 0){
					return result;
				}
			}
		}
		return 0;
	}
	private int TestSingleSubGrid(int row, int col){
		List<Integer> usedNumbers = new ArrayList<Integer>();
		for (int x = row; x<(row+3); x++){
			for (int y = col; y<(col+3); y++){
				int value = this.GetValueByCoordinates(x, y);
				if (usedNumbers.contains(value)){
					return -4;
				}
				else {
					usedNumbers.add(value);
				}
			}
		}
		return 0;
	}
	private int GetValueByCoordinates(int row, int col){
		return this.sudokuMapping.get(row*this.rowMultiplayer+col);
	}

	private int SpliceStringToMap(String str){
		int index = 0;
		for (int row=0; row<9; row++){
			for (int column=0; column<9; column++){
				char value = str.charAt(index);
				int cellValue = this.GetNumberFromString(value);
				if (cellValue <= 0 || cellValue > 9){
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
