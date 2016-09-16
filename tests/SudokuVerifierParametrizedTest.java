import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith ( Parameterized.class )
public class SudokuVerifierParametrizedTest {
	private char origin;
	private int result;
	
	public SudokuVerifierParametrizedTest(char origin, int result){
		this.result = result;
		this.origin = origin;
	}
	
	@Parameters
	public static Collection<Object[]> myData(){
		return Arrays.asList(new Object[][] { {'1',1},{'2',2},{'3',3},{'4',5},{'5',7},{'6',11},{'7',13},{'8',17},{'9',19} } );
	}
	
	@Test
	public void checkGetNumberMethod() {
		SudokuVerifier Sudoku = new SudokuVerifier();
		assertEquals(result,Sudoku.get_number(origin));
	}

}
