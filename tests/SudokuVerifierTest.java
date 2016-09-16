import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify() {
		SudokuVerifier n = new SudokuVerifier();
		String correct = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals("line not valid", 0, n.verify(correct));
	}
	@Test
	public void testVerifyFail() {
		SudokuVerifier n = new SudokuVerifier();
		String fail = "123456789912345678891234567789123456678332345567891234456999123345678912234567891";
		int solution = n.verify(fail);
		assertTrue("solution is incorrect", solution == -1 || solution == -2 || solution == -3 || solution == -4);
	}
	@Test
	public void testVerifyFail2(){
		SudokuVerifier n = new SudokuVerifier();
		String candidateSolution = ""
	            + "122456783"
	            + "456789129"
	            + "789123456"
	            + "123456789"
	            + "456789123"
	            + "789123456"
	            + "123456789"
	            + "456789123"
	            + "789123456"; 
		int solution = n.verify(candidateSolution);
		assertTrue("solution is incorrect", solution == -1 || solution == -2 || solution == -3 || solution == -4);
	}
	@Test
	public void testVerifyFail3(){
		SudokuVerifier n = new SudokuVerifier();
		String candidateSolution = ""
	            + "122456783"
	            + "456789129"
	            + "789123456"
	            + "123456789"
	            + "456789123"
	            + "789123456"
	            + "123456789"
	            + "456789123"
	            + "789123456"; 
		int solution = n.verify(candidateSolution);
		assertTrue("solution is incorrect", solution == -1 || solution == -2 || solution == -3 || solution == -4);
	}
	@Test
	public void testVerifyFail4(){
		SudokuVerifier n = new SudokuVerifier();
		String candidateSolution = ""
                + "113456789"
                + "922345678"
                + "891234567"
                + "789123456"
                + "678912345"
                + "567891234"
                + "456789123"
                + "345678912"
                + "234567891";
		int solution = n.verify(candidateSolution);
		assertTrue("solution is incorrect", solution == -1 || solution == -2 || solution == -3 || solution == -4);
	}
	@Test
	public void testVerifyFail5(){
		SudokuVerifier n = new SudokuVerifier();
		String candidateSolution = ""
                + "123456789"
                + "912345678"
                + "891234567"
                + "789123456"
                + "678912345"
                + "567891234"
                + "456789123"
                + "345678912"
                + "234567891";
		int solution = n.verify(candidateSolution);
		assertTrue("returned " +solution, solution == -1 || solution == -2 || solution == -3 || solution == -4);
	}
}
