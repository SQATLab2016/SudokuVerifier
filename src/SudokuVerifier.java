
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		String sudoku = candidateSolution;
		int x = 0;
		
		if (sudoku.length() != 81){
			x = x - 1;
		}else if (this.checknumbers(sudoku) == false){
			x = x - 1;
		}else if(){
			
		}
		
		
		
		
		// returns 0 if the candidate solution is correct
		return x;
		
		//check
	}
	
	public boolean Checknumbers(String testsudoku){
		int i = 0;
		int y = 0;
		int total = 9;
		boolean B = false;
		String TestString;
		int TestNumber = 1;
		TestString = testsudoku;
			
			while (y < 9){
				
				if (TestString.CharAt(y) == TestNumber){
				y = 0;
				TestNumber++;
				}else if (y == 8){
					B = true;
				}else{
					y = 0;
					Testnumber = 1;
					B = false
				}
			
			}
		
		
		return B;
	}
	
}
