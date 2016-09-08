
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		
		if (candidateSolution.length() != 81) {
			return -1;
		}
		String[] grids, rows, columns;
		grids = getGrids(candidateSolution);
		rows = getRows(candidateSolution);
		columns = getColumns(candidateSolution);
		// returns 0 if the candidate solution is correct

		if (!verifyGrids(grids)) {
			return -2;
		}

		else if (!verifyRows(rows)) {
			return -3;
		}

		else if (!verifyColumns(columns)) {
			return -4;
		}

		printSudoku(candidateSolution);

		return 0;

	}

	private boolean verifyGrids(String[] grids) {
		// TODO verify grid logic
		return true;
	}

	private boolean verifyRows(String[] rows) {
		// TODO verify rows logic
		return true;
	}

	private boolean verifyColumns(String[] columns) {
		// TODO verify columns logic
		return true;
	}

	private String[] getRows(String solution) {
		String[] rows = new String[9];
		// TODO get rows
		return rows;
	}

	private String[] getColumns(String solution) {
		String[] columns = new String[9];
		// TODO get columns
		return columns;
	}

	// generates string array of sudoku sub-grids
	private String[] getGrids(String solution) {
		String[] grids = new String[9];
		String grid;
		for (int i = 0; i < 9; i++) {
			grid = "";
			for (int j = 0; j < solution.length(); j += 9) {
				grid += solution.charAt(j+i);
			}
			grids[i] = grid;
		}
		return grids;
	}

	// prints whole sudoku grid for debugging
	private void printSudoku(String solution) {
		System.out.println("\nsudoku:");
		System.out.println("_____________");
		for (int i = 0; i < solution.length(); i += 9) {
			System.out.print("|" + solution.charAt(i) + solution.charAt(i + 1) + solution.charAt(i + 2));
			System.out.print("|" + solution.charAt(i + 3) + solution.charAt(i + 4) + solution.charAt(i + 5));
			System.out.print("|" + solution.charAt(i + 6) + solution.charAt(i + 7) + solution.charAt(i + 8) + "|\n");
			if (i == 18 || i == 45 || i == 72 || i == 81) {
				System.out.println("_____________");
			}
		}
	}
}
