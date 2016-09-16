import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;


public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify_CorrectString() {
		//Arrange
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = ""
				+ "417369825"
				+ "632158947"
				+ "958724316"
				+ "825437169"
				+ "791586432"
				+ "346912758"
				+ "289643571"
				+ "573291684"
				+ "164875293";
		//act
		int result = verifier.verify(candidateSolution );
		//assert
		assertTrue("the correct sudoku result retuns incorrectly", result == 0);
	}
	
	@Test
	public void testVerify_TooShortString() {
		//Arrange
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "1241524364";
		//act
		int result = verifier.verify(candidateSolution);
		//assert
		assertTrue("too short candidate results an incorrect return", result == -1);
	}
	
	@Test
	public void testVerify_negativeNumberinString() {
		//Arrange
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = ""
				+ "417369825"
				+ "632158947"
				+ "958724316"
				+ "825437169"
				+ "791586432"
				+ "346912758"
				+ "289643571"
				+ "573291684"
				+ "-164875293";
		//act
		int result = verifier.verify(candidateSolution);
		//assert
		assertTrue("negative number displays a wrong return", result == -1);
	}
	
	@Test
	public void testVerify() {
		fail("Not yet implemented");
	}

}
