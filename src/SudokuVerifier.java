
public class SudokuVerifier {

	public int verify(String candidateSolution) {
		if (candidateSolution.length() != 81) {
			return 1;
		} else {
			char[] arrayChars = candidateSolution.toCharArray();
			for (int loop = 0; loop < arrayChars.length; loop++) {
				try {
					int number = Integer.parseInt("" + arrayChars[loop]);
					if (number >= 0) {

					} else {
						return 1;
					}
				} catch (NumberFormatException ne) {
					ne.printStackTrace();
					return 1;
				}
			}
			return 0;
		}
	}
}
// returns 0 if the candidate solution is correct