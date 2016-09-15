import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert.*;


public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify() {
		
		fail("Not yet implemented");
	}
	
	
	
	
	@Test
	public void testchecknumber_1_true() {
		SudokuVerifier SV =new SudokuVerifier();
		String[] test = {"1","2","3","4","5","6","7","8","9"};
		boolean checknumber = SV.checknumber(test,"1");
		assertEquals( "There is not only 1 '1'", true, checknumber);
	} 	
	
	@Test
	public void testcheckFalse(){
		SudokuVerifier SV=new SudokuVerifier();
		String[] test = {"1","2","3","4","4","6","7","8","9"};
		boolean check = SV.check(test);
		assertEquals("The string given isn't valid but got verified", false, check);
	}
	
	@Test
	public void testcheck_2lines(){
		SudokuVerifier SV = new SudokuVerifier();
		String[] test = {"1","2","3","4","4","6","7","8","9"};
		String[] test2 = {"1","2","3","4","4","6","7","8","9"};
		assertEquals("the lines are not checked", true, SV.check(test)&&SV.check(test2));
		
	}
	
	@Test
	public void testcheckLines_True(){
		SudokuVerifier SV=new SudokuVerifier();
		String solution = "123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789";
		boolean checklines = SV.checkLines(solution);
		assertEquals("The lines are checked false despite being true", true, checklines);
	}

	

}
