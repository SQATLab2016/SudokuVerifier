

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825 632158947 958724316 825437169 791586432 346912758 289643571 573291684 164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify_Correct_String() {
		SudokuVerifier verifier = new SudokuVerifier();
		int returnedValue = verifier.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		
		assertEquals("Correct string, should be 0.", 0, returnedValue);
	}

	@Test
	public void testVerify_error_1_invalid_string_length_less() {

		SudokuVerifier verifier = new SudokuVerifier();
		
		assertEquals("should be -1.", -1, verifier.verify("000"));
		
	}
	
	@Test
	public void testVerify_error_1_invalid_string_not_numbers() {

		SudokuVerifier verifier = new SudokuVerifier();
		
		assertEquals("should be -1.", -1, verifier.verify("000asfdadsfasf00"));
		
	}
	
	@Test
	public void testVerify_error_2_invalid_sub_grids() {
		
		SudokuVerifier verifier = new SudokuVerifier();
		
		assertEquals("should be -2.", -2, verifier.verify("123456789912345678891234567789123456678912345567891234456789123345678912234567891"));
	}
	
	
}
