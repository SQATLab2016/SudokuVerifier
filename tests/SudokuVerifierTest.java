import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;



public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void test() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "";
		int result = verifier.verify(candidateSolution );
		assertTrue(result == - 2 || result == -3);
		
		//
	}
	
	@Test 
	public void test_RowColumnViolation() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "";
		
		String correctSolution = ""
								+ "123456789"
								+ "123456789"
								+ "123456789"
								+ "123456789"
								+ "123456789"
								+ "123456789"
								+ "123456789"
								+ "123456789"
								+ "123456789";
		
	//	int result = verifier.verify(candidateSolution );
	//	assertThat(result, anyOf(is(-2), is(-3)));
		
		
	}
	


}
