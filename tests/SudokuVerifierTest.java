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
	public void testVerify_WrongLenght_Returns_true() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkLenght("41736982563215894795872431682543716979158643234691275828964357157329168416487529");
				
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void testVerify_WrongBecauseOfRow_Returns_true() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkRows("417369825632158947958724316825437169791586432346912758289643571573291684164875393");
				
		// Assert
		assertEquals(true, result);
	}

	@Test
	public void testVerify_WrongBecauseOfColumn_Returns_true() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkColumns("147369258258147369369258147147369258258147369369258147147369258258147369369258147");
				
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void testVerify_WrongBecauseOfFormat_Returns_true() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkFormat("4173698256321589479-8724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void testVerify_WrongBecauseOfInvalidSubgrid_Returns_true() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkSubGrids("417369825642158947958724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void testVerify_CorrectLenght_Returns_false() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkLenght("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void testVerify_CorrectBecauseOfRow_Returns_false() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkRows("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(false, result);
	}

	@Test
	public void testVerify_CorrectBecauseOfColumn_Returns_false() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkColumns("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void testVerify_CorrectBecauseOfFormat_Returns_false() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkFormat("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void testVerify_CorrectBecauseOfInvalidSubgrid_Returns_false() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
				
		// Act
		boolean result = verifier.checkSubGrids("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
				
		// Assert
		assertEquals(false, result);
	}
}
