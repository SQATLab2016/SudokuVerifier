import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testForCorrectLength() {
		// Arrange
		SudokuVerifier sv = new SudokuVerifier();
		// Act
		int result = sv.verify("4173698256321589479587243888168254371697915864323469127582896435715732916841648752938");
		// Assert
		assertEquals(result, -5);
	}

	@Test
	public void testForValidDigits() {
		// Arrange
		SudokuVerifier sv = new SudokuVerifier();
		// Act
		int result = sv.verify("017369825632158947958724316825437169791586432346912758289643571573291684164875293");
		// Assert
		assertEquals("Should be -1", -1, result);
	}
	
	@Test
	public void testForValidRows() {
		// Arrange
		SudokuVerifier sv = new SudokuVerifier();
		// Act
		int result = sv.verify("414369825632158947958724316825437169791586432346912758289643571573291684164875293");
		// Assert
		assertEquals("Should be -3", -3, result);
	}
	
	@Test
	public void testForValidColumns() {
		// Arrange
		SudokuVerifier sv = new SudokuVerifier();
		// Act
		int result = sv.verify("417369825432158967958724316825437169791586432346912758289643571573291684164875293");
		// Assert
		assertEquals("Should be -4", -4, result);
	}

	@Test
	public void testVerify() {
		fail("Not yet implemented");
	}
}
