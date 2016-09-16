import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify_80characters_should_fail_rule1() {
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.verify("41736982563215894795872431682543716979158643234691275828964357157329168416487529");
		
		assertEquals("Character count is not checked. ", result, -1);
	}
	
	@Test
	public void testVerify_string_with_0_should_fail_rule1(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.verify("417369825632158947958724316805437169791586432346912758289643571573291684164875293");
		
		assertEquals("Character count is not checked. ", result, -1);
	}

	@Test
	public void testVerify_String_with_repetition_in_row_should_fail_rule3(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.verify("417364825632158947958724316825437169791586432346912758289643571573291684164875293");
		
		assertEquals("repetition in rows not checked. ", result, -3);
	}
	
	@Test
	public void testVerify_String_with_repetition_in_column_should_fail_rule4(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.verify("417369825432158967958724316825437169791586432346912758289643571573291684164875293");
		
		assertEquals("repetition in columns not checked. ", result, -4);
	}
	
	@Test
	public void testVerify_String_with_repetition_in_grid_should_fail_rule2(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.verify("417469825632158947958724316825437169791586432346912758289643571573291684164875293");
		
		assertEquals("repetition in columns not checked. ", result, -2);
	}
}
