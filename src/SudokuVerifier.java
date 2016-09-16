
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		int[][] sudoku = new int[10][10];
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
						if (loop > 0 && loop % 9 == 0) {
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

	public static void main(String[] args) {
		SudokuVerifier sudokuObject = new SudokuVerifier();
		int result = sudokuObject
				.verify("123456789912345678891234567789123456678912345567891234456789123345678912234567891");
		System.out.println("Result: " + result);
	}
}
// returns 0 if the candidate solution is correct