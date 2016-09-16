import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierParametrizedTest {
	

	@Test
	public void testHorizontalTrue() {
		SudokuVerifier ver = new SudokuVerifier();
		int[][] line = {{1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9}};
		assertEquals("line not valid", true, ver.verifyHorizontal(0, 3, line));
	}
	@Test
	public void testHorizontalFail() {
		SudokuVerifier ver = new SudokuVerifier();
		int[][] line = {{1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9},
				   {1,2,3,4,4,6,7,8,9}};
		assertEquals("line not valid", false, ver.verifyHorizontal(0, 3, line));
	}
	@Test
	public void testVerticalFail() {
		SudokuVerifier ver = new SudokuVerifier();
		int[][] line = {{1,2,3,4,4,6,7,8,9},
					   {1,2,3,4,4,6,7,8,9},
					   {1,2,3,4,4,6,7,8,9},
					   {1,2,3,4,4,6,7,8,9},
					   {1,2,3,4,4,6,7,8,9},
					   {1,2,3,4,4,6,7,8,9},
					   {1,2,3,4,4,6,7,8,9},
					   {1,2,3,4,4,6,7,8,9},
					   {1,2,3,4,4,6,7,8,9}};
		assertEquals("line not valid", false, ver.verifyVertical(3, 2, line));
	}
	@Test
	public void testVerticalTrue() {
		SudokuVerifier ver = new SudokuVerifier();
		int[][] line = {{1,2,3,4,4,6,7,8,9},
					   {2,2,3,4,4,6,7,8,9},
					   {3,2,3,4,4,6,7,8,9},
					   {4,2,3,4,4,6,7,8,9},
					   {5,2,3,4,4,6,7,8,9},
					   {6,2,3,4,4,6,7,8,9},
					   {7,2,3,4,4,6,7,8,9},
					   {8,2,3,4,4,6,7,8,9},
					   {9,2,3,4,4,6,7,8,9}};
		assertEquals("line not valid", true, ver.verifyVertical(0, 0, line));
	}
	@Test
	public void testBoxTrue() {
		SudokuVerifier ver = new SudokuVerifier();
		int[][] line = {{1,2,3,4,4,6,7,8,9},
					   {4,5,6,4,4,6,7,8,9},
					   {7,8,9,4,4,6,7,8,9},
					   {4,2,3,4,4,6,7,8,9},
					   {5,2,3,4,4,6,7,8,9},
					   {6,2,3,4,4,6,7,8,9},
					   {7,2,3,4,4,6,7,8,9},
					   {8,2,3,4,4,6,7,8,9},
					   {9,2,3,4,4,6,7,8,9}};
		assertEquals("line not valid", true, ver.verifyVertical(0, 0, line));
	}
}
