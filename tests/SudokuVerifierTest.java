import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testLength() {
		int[][] matrix = SudokuVerifier.toM2("4173698256321583947958724316825437169791586432346912758289643571573291684164875293", 9);
		int result = SudokuVerifier.verifyLength(matrix);
		
		assertEquals("Sudokus length is OK", 0, result);	
	}

	@Test
	public void testRow() {
		int[][] matrix = SudokuVerifier.toM2("417369825632158947958724316825437169791586432346912758289643571573291684164875293", 9);
		int rowOrder = SudokuVerifier.verifyRowOrder(matrix);
		
		//int result = rowNumber + rowOrder;
		
		assertEquals("Sudokus row OK", 0, rowOrder);	
	}
}
