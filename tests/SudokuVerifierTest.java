import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string1: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string2: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify_String1_0() throws StringLengthNotEqual_81Exception{
		SudokuVerifier Sudoku = new SudokuVerifier();
		int t = Sudoku.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals(0,t);
	}
	
	@Test
	public void testVerify_String2_minus1() throws StringLengthNotEqual_81Exception{
		SudokuVerifier Sudoku = new SudokuVerifier();
		int t = Sudoku.verify(" 123456789912345678891234567789123456678912345567891234456789123345678912234567891");
		assertEquals(0,t);
	}
}
