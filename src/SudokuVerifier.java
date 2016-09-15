import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SudokuVerifier {
	
	private Map<Integer, Integer> sudokuMapping;
	public static final int AllOk = 0;
	public static final int FailedNumbers = -1;
	public static final int FailedSubGrid = -2;
	public static final int FailedRow = -3;
	public static final int FailedColumn = -4;
	int rowMultiplayer = 42;
	
	public SudokuVerifier(){
		this.sudokuMapping = new HashMap<Integer, Integer>();
	}
	
	public int verify(String candidateSolution) {
		
		if (!this.TestStringLenght(candidateSolution)){
			return FailedNumbers;
		}
		int spliceResult =this.SpliceStringToMap(candidateSolution); 
		if (spliceResult != AllOk){
			return spliceResult;
		}
		int SubGridTest = this.TestSubGrids();
		if (SubGridTest != AllOk){
			return SubGridTest;
		}
		int LineTestResult = this.TestRows();
		if (LineTestResult != AllOk){
			return LineTestResult;
		}
		int ColumnTest = this.TestColumns();
		if (ColumnTest != AllOk){
			return ColumnTest;
		}
		
		
		// returns 0 if the candidate solution is correct
		return AllOk;
	}
	private int TestRows() {
		List<Integer> usedNumbers = new ArrayList<Integer>();
		for (int row=0; row<9; row++){
			for (int col=0; col<9; col++)
			{
				int value = this.GetValueByCoordinates(row, col);
				if (usedNumbers.contains(value)){
					return FailedRow;
				}
				else {
					usedNumbers.add(value);
				}
			}
			usedNumbers.clear();
		}
		return AllOk;
	}
	private int TestColumns(){
		List<Integer> usedNumbers = new ArrayList<Integer>();
		for (int col=0; col<9; col++){
			for (int row=0; row<9; row++)
			{
				int value = this.GetValueByCoordinates(row, col);
				if (usedNumbers.contains(value)){
					return FailedColumn;
				}
				else {
					usedNumbers.add(value);
				}
			}
			usedNumbers.clear();
		}
		
		return AllOk;
	}
	private int TestSubGrids(){
		for (int row = 0; row<9; row +=3){
			for (int col = 0; col<9; col +=3){
				int result = this.TestSingleSubGrid(row, col);
				if (result != AllOk){
					return result;
				}
			}
		}
		return AllOk;
	}
	private int TestSingleSubGrid(int row, int col){
		List<Integer> usedNumbers = new ArrayList<Integer>();
		for (int x = row; x<(row+3); x++){
			for (int y = col; y<(col+3); y++){
				int value = this.GetValueByCoordinates(x, y);
				if (usedNumbers.contains(value)){
					return FailedSubGrid;
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
			return FailedNumbers;
		}
	}
}
