import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testLength() {
		int[][] matrix = SudokuVerifier.toM2("417369825632158947958724316825437169791586432346912758289643571573291684164875293", 9);
		int result = SudokuVerifier.verifyLength(matrix);
		
		assertEquals("Sudokus length is OK", 0, result);	
	}

	@Test
	public void testRowOK() {
		int[][] matrix = SudokuVerifier.toM2("417369825632158947958724316825437169791586432346912758289643571573291684164875293", 9);
		int result = SudokuVerifier.verifyRow(matrix);
	
		
		assertEquals("Sudokus row OK", 0, result);	
	}
	
	@Test
	public void testRowER() {
		int[][] matrix = SudokuVerifier.toM2("417469825632158947958723316825347169791586432346912758289634571573291684164875293
", 9);
		int result = SudokuVerifier.verifyRow(matrix);
	
		
		assertEquals("Sudokus row OK", 0, result);	
	}
	
	@Test
	public void testColumnOK() {
		int[][] matrix = SudokuVerifier.toM2("417369825632158947958724316825437169791586432346912758289643571573291684164875293", 9);
		int rowOrder = SudokuVerifier.verifyColumn(matrix);
		
		//int result = rowNumber + rowOrder;
		
		assertEquals("Sudokus row OK", 0, rowOrder);	
	}

	@Test
	public void testColumnER() {
		int[][] matrix = SudokuVerifier.toM2("123456789912345678891234567789123456678912345567891234456789123345678912234567891", 9);
		int rowOrder = SudokuVerifier.verifyColumn(matrix);
		
		//int result = rowNumber + rowOrder;
		
		assertEquals("Sudokus row OK", 0, rowOrder);	
	}
}
