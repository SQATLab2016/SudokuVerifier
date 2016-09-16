
public class SudokuVerifier {

	public static final int LENGTH = 81;

	public int verify(String candidateSolution) {
		int[][] sudoku = new int[9][9];
		char[] arrayChars;
		int sudokuRowSize = 0;
		int sudokuColumnSize = 0;

		if (!lengthChecker(candidateSolution)) {
			return 1;
		} else {
			arrayChars = candidateSolution.toCharArray();
			for (int loop = 0; loop < arrayChars.length; loop++) {
				try {
					int number = Integer.parseInt("" + arrayChars[loop]);
					if (number > 0 && number <= 9) {
						if (loop > 0 && loop % 9 == 0) {
							sudokuColumnSize = 0;
							sudokuRowSize++;
						}
						sudoku[sudokuRowSize][sudokuColumnSize] = number;
						sudokuColumnSize++;
					} else {
						return -1;
					}
				} catch (NumberFormatException ne) {
					ne.printStackTrace();
					return 1;
				}
			}

			if (sudokuRuleChecker(sudoku))
				return 0;
			else
				return 1;
		}
	}

	private boolean sudokuRuleChecker(int[][] sudoku) {
		boolean result = true;

		return result;
	}

	public boolean duplicateChecker(int[] arrayToCheck) {
		boolean result = false;

		return result;
	}

	public int[] gridToArrayConverter(int[][] arrayToConvert) {
		int[] result = new int[9];

		return result;
	}

	public boolean lengthChecker(String stringToCheck) {
		boolean result = false;
		if (stringToCheck.length() == LENGTH) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		SudokuVerifier sudokuObject = new SudokuVerifier();
		int result = sudokuObject
				.verify("123456789912345678891234567789123456678912345567891234456789123345678912234567891");
		System.out.println("Result: " + result);
	}
}
// returns 0 if the candidate solution is correct