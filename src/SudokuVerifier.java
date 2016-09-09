
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		if (candidateSolution.length() != 81) {
			return 1;
		} else {
			char[] arrayChars = candidateSolution.toCharArray();
			for (int loop = 0; loop < arrayChars.length; loop++) {
			}
			return 0;
		}
	}
}
