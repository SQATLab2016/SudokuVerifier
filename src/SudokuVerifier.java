
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		int[][] sudoku = new int[9][9];
		char[] arrayChars;
		int sudokuRowSize = 0;
		int sudokuColumnSize = 0;
		
		if (candidateSolution.length() != 81) {
			return 1;
		} else {
			arrayChars = candidateSolution.toCharArray();
			
			for (int loop = 0; loop < arrayChars.length; loop++) {
				try {
					int number = Integer.parseInt("" + arrayChars[loop]);
					if (number >= 0) {
						if(loop > 0 && loop % 9 == 0)
						{
							sudokuRowSize++;
						}
						sudoku[sudokuRowSize][sudokuColumnSize] = number;
						sudokuColumnSize++;
					} else {
						return 1;
					}
				} catch (NumberFormatException ne) {
					ne.printStackTrace();
					return 1;
				}
			}
			return 0;
		}
	}
}
// returns 0 if the candidate solution is correct