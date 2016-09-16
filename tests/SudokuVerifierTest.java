import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		int result = verifier.verify(candidateSolution);

		
		assertTrue("String is wrong!", result == 0 );
		//fail("Not yet implemented");
	}
	
	@Test
	public void testVerify2() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "12345678991234567889123456778912345667891234556789123445678912334567891223456789";
		
		int result = verifier.verify(candidateSolution);

		
		assertTrue("String is wrong!", result == 0 );
		//fail("Not yet implemented");
	}
	
	@Test
	public void TestVerifySudokuStringLengthIsCorrect(){
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		int result = verifier.VerifySudokuStringLengthIsCorrect(candidateSolution);
		
		assertTrue("Length of the string is incorrect!", result == 1);
	}
	
	@Test
	public void TestVerifySudokuStringLengthIsCorrect2(){
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "1234567899123456788912345677891234566789123455678912344567891233456789122345678911";
		
		int result = verifier.VerifySudokuStringLengthIsCorrect(candidateSolution);
		
		assertTrue("Length of the string is incorrect!", result == 1);
	}
	
	@Test
	public void TestVerifyDigitsArePositive(){
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution = "4444";
		
		int result = verifier.VerifyDigitsArePositive(candidateSolution);
		
		assertTrue("String includes negative digits!", result == 0);
	}
}
