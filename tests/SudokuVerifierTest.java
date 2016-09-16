import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	String corrSol = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String inorrSol = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	
	String row = "123456789";
	//String wrongSol = "";
	SudokuVerifier sv = new SudokuVerifier();
	
	public SudokuVerifierTest() {
		/*
		for (int i=0; i<8; i++) {
			wrongSol.concat(row);
		}
		*/
	}
	
	@Before
	public void init() {
	}
	
	@Test
	public void testVerify() {
		fail("Not yet implemented");
	}
	
	
	
	/*
	 * Test for valid characters (numbers from 1-9)
	 */
	
	@Test
	public void testValidCharacters_CorrectChars() {
		assertEquals(true, sv.containsOnlyValidCharacters(corrSol));
	}
	
	@Test
	public void testValidCharacters_LetterChars() {
		String solWithLetters = corrSol.substring(0, 80).concat("a");
		assertEquals(false, sv.containsOnlyValidCharacters(solWithLetters));
	}
	
	@Test
	public void testValidCharacters_SymbolChars() {
		String solWithLetters = corrSol.substring(0, 80).concat("+");
		assertEquals(false, sv.containsOnlyValidCharacters(solWithLetters));
	}
	
	
	/*
	 * Test for valid number of characters
	 */
	
	@Test
	public void testValidNumberOfChar_CorrectNumber() {
		assertEquals(true, sv.hasValidNumberOfChars(corrSol));
	}
	
	@Test
	public void testValidNumberOfChar_OneRowMissing() {
		String sol = "";
		for (int i=0; i<8; i++) {
			sol.concat(row);
		}
		
		assertEquals(false, sv.hasValidNumberOfChars(sol));
	}
	
	@Test
	public void testValidNumberOfChar_OneCharMissing() {		
		// remove last character from wrong solution
		String solOneCharMissing = corrSol.substring(0, 80);
		
		assertEquals(false, sv.hasValidNumberOfChars(solOneCharMissing));
	}
	
	@Test
	public void testValidNumberOfChar_OneCharMore() {
		// add character to wrong solution
		String solOneCharMore = corrSol.concat("1");
		
		assertEquals(false, sv.hasValidNumberOfChars(solOneCharMore));
	}
	
	
	
	/*
	 * Test for rule 1
	 */
	
	@Test
	public void testVerify_IncorrectNr_LessChars() {
		assertEquals(-1, sv.verify(corrSol.substring(0, 80)));
	}
	
	@Test
	public void testVerify_IncorrectNr_MoreChars() {
		assertEquals(-1, sv.verify(corrSol.concat("1")));
	}
	
	@Test
	public void testVerify_InvalidChars() {
		assertEquals(-1, sv.verify(corrSol.substring(0, 80).concat("%")));
	}
	
	
	@Test
	public void testGetSubGrids() {
		String[] grids = sv.getSubGrids(corrSol);
		assertEquals("417632825958", grids[0]);
	}
	
	
	/*
	 * Test for rule 2
	 */

}
