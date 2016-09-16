import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SudokuVerifierParametrizedTest {

	@Test
	public void test() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution ="417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int result= verifier.verify(candidateSolution);
		int[] numbers={1,2,3,4,5,6,7,8,9};
		int[][] rows = new int[9][9];
		int row=0;
		for(int a=0 ; a<9 ; a++){
			for(int b=0 ; b<9 ; b++){
				rows[a][b]=row;
				row++;
			}
		}
		int[] test;
		for(int i=0; i<9 ; i++){
			
		}
	}

}
