import java.util.*;

public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		// if the string has only integers
		// -> no other chars are allowed.
		if(candidateSolution.matches("^[0-9]+$") && candidateSolution.length() == 81) {
			
			// create a helper list.
			List<Character> charList = new ArrayList<Character>();
			
			/*	Check things in this order:
			 *  1. global rows
			 *  2. global columns
			 *  3. sub-grid
			 */
			
			// loop through all of the nine rows.
			// -> "global" rows.
			for(int i = 0; i < 9; i++) {
				
				// create substring
				// min should be 0, 9, 18, 27, 36 etc...
				// max should be 8, 17, 26, 35, 44 etc...
				String subString = candidateSolution.substring(i * 9, ((i + 1) * 9) - 1);
				
				// iterate through substring,
				// where substring is one global row in sudoku grid.
				for (char c : subString.toCharArray()) {
					
					// if charList is empty 
					// -> add char to it.
					if(charList.isEmpty()) {
						charList.add(c);
					} else {
						
						// if charList is not empty
						// -> check if it contains same characters.
						// --> if it does it violates rule #3.
						if(charList.contains(c)) {
							return -3;
						} else {
							charList.add(c);
						}
					}
				}
				charList.clear();
			}
			
			// loop through all of the nine columns.
			// -> "global" columns.
			for(int i = 0; i < 9; i++) {
				
				// calculates substring length so that it takes every n:th element of the string.
				String subString = candidateSolution.substring(i, ((((i + 1) * 9) * 8) / (i + 1) + i));
				
				for (char c : subString.toCharArray()) {
					if(charList.isEmpty()) {
						charList.add(c);
					} else {
						if(charList.contains(c)) {
							return -4;
						} else {
							charList.add(c);
						}
					}
				}
				charList.clear();
			}
			
			// helper integer.
			int rowStartAddition = 0;
			
			// loop through all sub-grids
			for(int i = 0; i < 9; i++) {
				
				if(i == 3) {
					rowStartAddition = 18;
				} else if (i == 6) {
					rowStartAddition = 36;
				}
				
				// first row of sub-grid
				String subString = candidateSolution.substring(i * 3 + rowStartAddition, i + 3);
				
				// second row ...
				subString += candidateSolution.substring();
				
				// third row ...
				subString += candidateSolution.substring();
				
				for (char c : subString.toCharArray()) {
					if(charList.isEmpty()) {
						charList.add(c);
					} else {
						if(charList.contains(c)) {
							return -2;
						} else {
							charList.add(c);
						}
					}
				}
				charList.clear();
			}
			
			// solution is correct.
			return 0;
		}
		
		// if the given solution string is not correct.
		return -1;
	}
}
