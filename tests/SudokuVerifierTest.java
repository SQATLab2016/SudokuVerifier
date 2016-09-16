import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;


public class SudokuVerifierTest {

// A correct Sudoku string: 417369825|632158947|958724316|825437169|791586432|346912758|289643571|573291684|164875293
// An incorrect Sudoku string: 123456789|912345678|891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify() {
		fail("Not yet implemented");
	}

	@Test
	public void testOnlyNumbers(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.hasOnlyNumbers("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("Only contains numbers", 1, result);
	}
	
	@Test
	public void testOnlyNumbersFail(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.hasOnlyNumbers("417369825632158947958724316825437169791586k432346912758289643571573291684164875293");
		assertEquals("Contains a character", 0, result);
	}
	
	@Test
	public void test81numbers(){
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.hasOnlyNumbers("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals("Contains a character", 0, result);
	}
	
	
}
