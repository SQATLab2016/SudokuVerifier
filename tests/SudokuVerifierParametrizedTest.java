import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierParametrizedTest {

	@Test
	public void testHorizontalTrue() {
		SudokuVerifier ver = new SudokuVerifier();
		int[] line = {1,2,3,4,5,6,7,8,9};
		assertEquals("line not valid", true, ver.verifyHorizontal(3, line));
	}
	@Test
	public void testHorizontalFail() {
		SudokuVerifier ver = new SudokuVerifier();
		int[] line = {1,2,3,4,4,6,7,8,9};
		assertEquals("line not valid", false, ver.verifyHorizontal(3, line));
	}
	@Test
	public void testHorizontalFail() {
		SudokuVerifier ver = new SudokuVerifier();
		int[][] line = {1,2,3,4,4,6,7,8,9};
		assertEquals("line not valid", false, ver.verifyHorizontal(3, line));
	}
}
