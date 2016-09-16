import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string1: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string2: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
// An incorrect Sudoku string3: 123123123456456456789789789312312312645645645978978978231231231564564564897897897
// An incorrect Sudoku string4: 4a7369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string5: 147369258258147369369258147147369258258147369369258147147369258258147369369258147
	@Test
	public void testVerify_String1_0() throws StringLengthNotEqual_81Exception{
		SudokuVerifier Sudoku = new SudokuVerifier();
		int t = Sudoku.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals(0,t);
	}
	
	@Test
	public void testVerify_String2_minus2() throws StringLengthNotEqual_81Exception{
		SudokuVerifier Sudoku = new SudokuVerifier();
		int t = Sudoku.verify("123456789912345678891234567789123456678912345567891234456789123345678912234567891");
		assertEquals(-2,t);
	}
	
	@Test ( expected=StringLengthNotEqual_81Exception.class )
	public void testVerify_throwException() throws StringLengthNotEqual_81Exception{
		SudokuVerifier Sudoku = new SudokuVerifier();
		Sudoku.verify("1234567890");
	}
	
	@Test
	public void testGetNumber_otherinput_return_minus1(){
		SudokuVerifier Sudoku = new SudokuVerifier();
		int t = Sudoku.get_number('a');
		assertEquals(-1,t);
	}
	
	@Test
	public void testVerify_String3_minus3() throws StringLengthNotEqual_81Exception{
		SudokuVerifier Sudoku = new SudokuVerifier();
		int t = Sudoku.verify("123123123456456456789789789312312312645645645978978978231231231564564564897897897");
		assertEquals(-3,t);
	}
	
	@Test
	public void testVerify_String4_minus1() throws StringLengthNotEqual_81Exception{
		SudokuVerifier Sudoku = new SudokuVerifier();
		int t = Sudoku.verify("4a7369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals(-1,t);
	}
	
	@Test
	public void testVerify_String5_minus4() throws StringLengthNotEqual_81Exception{
		SudokuVerifier Sudoku = new SudokuVerifier();
		int t = Sudoku.verify("147369258258147369369258147147369258258147369369258147147369258258147369369258147");
		assertEquals(-4,t);
	}
}
