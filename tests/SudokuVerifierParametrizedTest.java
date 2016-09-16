import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierParametrizedTest {

	@Test
	public void testVertical() {
		SudokuVerifier ver = new SudokuVerifier();
		int[] line = {1,2,3,4,5,6,7,8,9};
		assertEquals("line not valid", true, ver.verityVertical('3', line.toCharArray()));
	}

}
