import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify_StringWithTooManyChars() {
		String testCandidate = "4173698256321589479587243168254371697915864323469127582896435715732916841648752935";
		SudokuVerifier verifier = new SudokuVerifier();
		
		int result = verifier.verify(testCandidate);
		assertEquals("String has too many chars", -1, result);
	}
	
	@Test
	public void testVerify_StringWithTooLittleChars() {
		String testCandidate = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
		SudokuVerifier verifier = new SudokuVerifier();
		
		int result = verifier.verify(testCandidate);
		assertEquals("String has too little chars", -1, result);
	}
	
	@Test
	public void testVerify_StringWithIllegalChars() {
		String testCandidate = "4173698256321589479587243168254371697915864323469127582896435715732916841648752-3";
		SudokuVerifier verifier = new SudokuVerifier();
		
		int result = verifier.verify(testCandidate);
		assertEquals("String has invalid chars", -1, result);
	}
	

}
