import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierParametrizedTest {

	@Test
	public void testVertical() {
		SudokuVerifier ver = new SudokuVerifier();
		String line = "123456789";
		assertEquals("line not valid", true, ver.verityVertical(3, line.to))
	}

}
