import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
	
	SudokuVerifier sV;
	
	@Before
	public void init() {
		sV = new SudokuVerifier();
	}

	@Test
	public void testVerifyStringLength81Characters() {
		String characters81 = "417369825632158947958724316825437169791586432346912758289643571573291684164875293"; 
		try {
			assertEquals(0, sV.verify(characters81));
		}
		catch (Exception e) {	
		}
	}
	
	@Test
	public void testVerifyStringLength82CharactersFails() {
		String characters82 = "4417369825632158947958724316825437169791586432346912758289643571573291684164875293"; 
		boolean thrown = false;
		try {
			sV.verify(characters82);
		}
		catch (Exception e) {
			thrown = true;	
			System.out.println(e.toString() + " testVerifyStringLength82CharactersFails");
		}
		
		assertEquals(true, thrown);
	}
	
	@Test
	public void testVerifyStringLength80CharactersFails() {
		String characters80 = "17369825632158947958724316825437169791586432346912758289643571573291684164875293"; 
		boolean thrown = false;
		
		try {
			sV.verify(characters80);
		}
		catch (Exception e) {
			thrown = true;	
			System.out.println(e.toString() + " testVerifyStringLength80CharactersFails");
		}
		
		assertEquals(true, thrown);
	}
	
	@Test
	public void testStringHasEmptySpacesFails() {
		String characters81emptyspaces = "4 736982563215894 95872431 825437169791586432346912758289643571573291684164875293"; 
		int result = 0;
		
		try {
			result = sV.verify(characters81emptyspaces);
		}
		catch (Exception e) {
		}
		
		assertEquals(-1, result);
	}
	
	@Test
	public void testStringContainsOnlyDigits(){
		String characters81 = "41736982563a158947958724316825437b697915864f2346912758289643571573291684164875293";
		int result = 0;
		
		try {
			result = sV.verify(characters81);
		}
		catch (Exception e) {
		}
		
		assertEquals(-1, result);
	}
	
	@Test
	public void testStringContainsOnlyPositiveDigits(){
		String characters81 = "-1736982-63a158947958724316825437b697915864f2346912758289643571573291684164875293";
		int result = 0;
		
		try {
			result = sV.verify(characters81);
		}
		catch (Exception e) {
		}
		
		assertEquals(-1, result);
	}
	
	@Test
	public void testStringRowContainsOnlyUniqueDigits() {
		String characters81 = "417369825632158947958724316825437169791586432346912758289643571573291684164875233";
		int result = 0;
		
		try {
			result = sV.verify(characters81);
		}
		catch (Exception e) {
		}
		
		assertEquals(-3, result);
	}
	
	@Test
	public void testStringColumnContainsOnlyUniqueDigits() {
		String characters81 = "417369825632158947958724316825437169791586432346912758289643571573291684461875293";
		int result = 0;
		
		try {
			result = sV.verify(characters81);
		}
		catch (Exception e) {
		}
		assertEquals(-4, result);
	}
	
	@Test
	public void testSubGridContainsOnlyUniqueDigits() {
		String characters81 = "417369825"
							+ "642158937"
							+ "958724316"
				
							+ "825437169"
							+ "791586432"
							+ "346912758"
				
							+ "289643571"
							+ "578291634"
							+ "164875293";
		int result = 0;
		
		try {
			result = sV.verify(characters81);
		}
		catch (Exception e) {
		}
		assertEquals(-2, result);
	}
	
}
