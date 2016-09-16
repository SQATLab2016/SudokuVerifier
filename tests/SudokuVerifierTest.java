import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

	public static final int RULE_1_VOILATION_RESULT = -1;
	public static final int RULE_2_VOILATION_RESULT = -2;
	public static final int RULE_3_VOILATION_RESULT = -3;
	public static final int RULE_4_VOILATION_RESULT = -4;
	public static final int APPROVAL_RESULT = 0;

	SudokuVerifier sudokuVerifier = new SudokuVerifier();

	@Test
	public void testVerify_Verify() {
		assertEquals("Test to verify length", APPROVAL_RESULT, sudokuVerifier
				.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
	}

	@Test
	public void testVerify_NumberCheckRule1() {
		assertEquals("Test to verify rule 1", RULE_1_VOILATION_RESULT, sudokuVerifier
				.verify("417369825032158947958720316825437169791586432346912758289643571573291684164875293"));
	}

	@Test
	public void testVerifyRule2Check() {
		assertEquals("Test to verify rule 2", RULE_2_VOILATION_RESULT, sudokuVerifier
				.verify("417369825342158967958724316825437169791586432346912758289643571573291684164875293"));
	}
	
	
	@Test
	public void testVerifyRule4Check() {
		assertEquals("Test to verify rule 4", RULE_4_VOILATION_RESULT, sudokuVerifier
				.verify("417369825632158947958724316825437169791586432346912758289643571573291684461875293"));
	}
}
