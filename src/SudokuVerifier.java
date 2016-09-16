
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// Check the length of numbers
		if (candidateSolution.length() != 81) {
			return -1; // -5 will be any other error EDIT -1 is used to check
						// the format of string
		}

		// Insert to data structure
		Integer[][] sudokuTable = new Integer[9][9];
		int stringIndex = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				// Rule 1: check if all are positive digits
				char chaarat = candidateSolution.charAt(stringIndex);
				String charString = String.valueOf(chaarat);
				Integer digit = Integer.valueOf(charString);
				if (digit < 1 || digit > 9) {
					return -1;
				}
				sudokuTable[i][j] = digit;
				stringIndex++;
			}
		}

		// Check rows and columns
		for (int x = 0; x < 9; x++) {
			String row = "";
			String column = "";
			for (int y = 0; y < 9; y++) {
				row = row + String.valueOf(sudokuTable[x][y]);
				column = column + String.valueOf(sudokuTable[y][x]);
			}
			if (!isUniqueChars(row)) {
				return -3;
			}
			if (!isUniqueChars(column)) {
				return -4;
			}
		}

		// Check grids
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				String grid = "";
				for (int x = i; x < 9; x++) {
					for (int y = j; y < 9; y++) {
						grid = grid + String.valueOf(sudokuTable[x][y]);
					}
				}
				if (!isUniqueChars(grid)) {
					return -5;
				}
			}
		}

		return 0;
	}

	public static boolean isUniqueChars(String str)// from
													// http://stackoverflow.com/questions/8901446/regex-allow-value-only-once
	{
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}

}
