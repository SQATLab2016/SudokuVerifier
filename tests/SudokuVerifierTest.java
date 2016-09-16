import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SudokuVerifierTest {
	SudokuVerifier test;

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
	@Before
	public void setUp(){
		test = new SudokuVerifier();
	}
	@Test
	public void testVerify() {
		fail("Not yet implemented");
	}
	@Test
	public void testCheckInputStringLength_length81(){
		//SudokuVerifier test = new SudokuVerifier();
		String inputString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertTrue("expects true when string length is 81", test.checkInputStringLength(inputString));
	}
	@Test 
	public void testCheckInputStringLength_length82(){
		String inputString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293a";
		assertFalse("expects false when string length is larger than 81", test.checkInputStringLength(inputString));
	}
	@Test
	public void testCheckInputStringLength_length80(){
		String inputString = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
		assertFalse("expects false when string length is less than 81", test.checkInputStringLength(inputString));
	}
	@Test 
	public void testCheckInputStringContainsOnlyPostiveInt_correctInput(){
		String inputString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertTrue("expects true when the input string is correct", test.checkInputStringContainsOnlyPostiveInt(inputString));
	}
	@Test
	public void testCheckInputStringContainsOnlyPostiveInt_inputContainsChar(){
		String inputString = "41736982563215894795872431682543716979158643234691275828964357157329168416487529a";
		assertFalse("expect false when the input contains character", test.checkInputStringContainsOnlyPostiveInt(inputString));
	}

}
