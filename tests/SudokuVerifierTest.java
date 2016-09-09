import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testSudokuVerifier_too_shot_sudoku_string() {
		SudokuVerifier verifier = new SudokuVerifier();
		String sudoku = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
		int result = verifier.verify(sudoku);
		assertEquals("Too short sudoku return wront code", -1, result);
	}

	@Test
	public void testSudokuVerifier_too_long_sudoku_string() {
		SudokuVerifier verifier = new SudokuVerifier();
		String sudoku = "4173698256321589479587243168254371697915864323469127582896435715732916841648752931";
		int result = verifier.verify(sudoku);
		assertEquals("Too long sudoku return wront code", -1, result);
	}

	@Test
	public void testSudokuVerifier_correct_sudoku() {
		SudokuVerifier verifier = new SudokuVerifier();
		String sudoku = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int result = verifier.verify(sudoku);
		assertEquals("Wrong return code on correct sudoku", 0, result);
	}

	@Test
	public void testSudokuVerifier_number_appears_twice_in_subGrid() {
		SudokuVerifier verifier = new SudokuVerifier();
		String sudoku = "447369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int result = verifier.verify(sudoku);
		assertEquals("Wrong return code on same number twice in subgrid", -2, result);
	}

	@Test
	public void testSudokuVerifier_number_appears_twice_in_row() {
		SudokuVerifier verifier = new SudokuVerifier();
		String sudoku = "417364825632158947958729316825437169791586432346912758289643571573291684164875293";
		int result = verifier.verify(sudoku);
		assertEquals("Wrong return code on same number twice in row", -3, result);
	}

	@Test
	public void testSudokuVerifier_number_appears_twice_in_column() {
		SudokuVerifier verifier = new SudokuVerifier();
		String sudoku = "714369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int result = verifier.verify(sudoku);
		assertEquals("Wrong return code on same number twice in column", -4, result);
	}

}
