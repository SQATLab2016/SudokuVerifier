import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierParametrizedTest {

	public static final String CORRECT_SOLUTION = "417369825632158947958724316825437169791586432346912758289643571573291684164875293"; 
	public static final String INCORRECT_SOLUTION = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	public static final String INCORRECT_LENGHT_SOLUTION = "12345678991234567889123456778912345667891234556789123445678912334567891223456";		
	public static final String INCORRECT_NONNUMERIC = "4a7369825632158947958724316825437169791586432346912758289643571573291684164875293";	
	
	@Test
	public void testCandidateStringLenght81() {
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
		
		// Act
		// Assert
		assertEquals("Invalid solution lenght", -1, verifier.verify(INCORRECT_LENGHT_SOLUTION));				

	}

	@Test 
	public void testVerifyRowsRuleFollowed()	{		
		SudokuVerifier verifier = new SudokuVerifier();
		
		String rowsRule = "122456789"+
						  "123456789"+
						  "123456789"+
						  "123456789"+
						  "123456789"+
						  "123456789"+
						  "123456789"+
						  "123456789"+
						  "123456789";
						  
		assertEquals(-3, verifier.verifyRows(rowsRule));
		
	}
	
	@Test	
	public void testNumber8AtStringOnlyOnce() {
		SudokuVerifier verifier = new SudokuVerifier();		
	
		String candidateSolution = "123456789";
		
		assertEquals(0, verifier.verifyOnlyOnce('8', candidateSolution));
	}
	
	@Test	
	public void testNumber3AtStringOnlyOnce() {
		SudokuVerifier verifier = new SudokuVerifier();		
	
		String candidateSolution = "123356789";
		
		assertEquals(-1, verifier.verifyOnlyOnce('3', candidateSolution));
	} 
	
	
	@Test 
	public void testCheckStringSequenceForDublicates()
	{
		SudokuVerifier verifier = new SudokuVerifier();
		
		String candidateSolution = "123456789";
		
		assertEquals(0, verifier.checkStringSequence(candidateSolution));
	}
	
	@Test 
	public void testCheckStringSequenceHasDublicate()
	{
		SudokuVerifier verifier = new SudokuVerifier();
		
		String candidateSolution = "122456789";
		
		assertEquals(-1, verifier.checkStringSequence(candidateSolution));
	}
	
	
	@Test
	public void testCandidateStringOnlyNumeric()
	{
		// Arrange
		SudokuVerifier verifier = new SudokuVerifier();
		
		// Act
		// Assert
		assertEquals("Solution not valid in 1-9 positive range", -1, verifier.verify(INCORRECT_NONNUMERIC));
	}
	
}
