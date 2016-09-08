
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		
		if (candidateSolution.length() != 81) {
			return -1;
		}
		String[] grids, rows, columns;
		rows = getRows(candidateSolution);
		columns = getColumns(candidateSolution);
		grids = getGrids(columns);
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

	// generates string array of sudoku sub-grids
	// Some real retarded @hacks here, but hey it work
	private String[] getGrids(String[] columns) {
		String[] grids = new String[9];
		int index = -1;
		for (int j = 0; j < 9; j += 3) {
			for (int i = 0; i < 9; i++) {
				if (i % 3 == 0) {
					index++;
				}
				if (grids[index] == null) {
					grids[index] = "";
				}
				grids[index] += columns[i].charAt(j) + "" + columns[i].charAt(j + 1) + "" + columns[i].charAt(j + 2);
			}
		}
		return grids;
	}

	// generates string array of sudoku rows
	private String[] getRows(String solution) {
		String[] rows = new String[9];
		String row;
		for (int i = 0; i < 9; i++) {
			row = "";
			for (int j = 0; j < 9; j++) {
				row += solution.charAt(i + j + (8 * i));
			}
			rows[i] = row;
		}
		return rows;
	}

	// generates string array of sudoku columns
	private String[] getColumns(String solution) {
		String[] columns = new String[9];
		String column;
		for (int i = 0; i < 9; i++) {
			column = "";
			for (int j = 0; j < solution.length(); j += 9) {
				column += solution.charAt(j + i);
			}
			columns[i] = column;
		}
		return columns;
	}

	// prints whole sudoku grid for debugging
	public void printSudoku(String solution) {
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
