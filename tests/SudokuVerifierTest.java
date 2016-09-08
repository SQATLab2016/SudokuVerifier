import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify_CorrectSolution_Returns_0() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		int result = verifier.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(0, result);
	}
	
	@Test
	public void testVerify_WrongFormat_Returns_Minus5() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		int result = verifier.verify("41736982563215894795872431682543716979158643234691275828964357157329168416487529");
				
		// Assert
		assertEquals(-5, result);
	}
	
	@Test
	public void testVerify_WrongBecauseOfRow_Returns_Minus3() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		int result = verifier.verify("417349825632158947958724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(-5, result);
	}


}
