import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	
	
	
	
	@Test
	public void testVerifyDigitsCorrectString() {
		
		SudokuVerifier sf= new SudokuVerifier();
		
		assertTrue(		sf.verifyDigits("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
		
	}
	@Test
	public void testVerifyDigitsIncorrectString() {
		
		SudokuVerifier sf= new SudokuVerifier();
		
		assertTrue(		sf.verifyDigits("123456789912345678891234567789123456678912345567891234456789123345678912234567891"));
		
	}
	@Test
	public void testVerifyRowCorrectString() {
		
		SudokuVerifier sf= new SudokuVerifier();
		
		assertTrue(		sf.verifyRow("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
		
	}
	@Test
	public void testVerifyRowIncorrectString() {
		
		SudokuVerifier sf= new SudokuVerifier();
		
		assertTrue(		sf.verifyRow("111116789912345678891234567789123456678912345567891234456789123345678912234567891"));
		
	}
	
	
	@Test
	public void testVerifyColumnCorrectString() {
		
		SudokuVerifier sf= new SudokuVerifier();
		
		assertTrue(		sf.verifyColumns("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
		
	}
	@Test
	public void testVerifyColumnIncorrectString() {
		
		SudokuVerifier sf= new SudokuVerifier();
		
		assertTrue(		sf.verifyColumns("417369824442158947958724316825437169791586432346912758289643571573291684164875293"));
		
	}
	
}
