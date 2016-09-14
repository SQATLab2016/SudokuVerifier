import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		if(checkR1(candidateSolution)) {
			return 0;
		} else if (checkR2(candidateSolution)) {
			return 1;
		}
		else if (checkR3(candidateSolution)) {
			return 2;
		}
		else if (checkR4(candidateSolution)) {
			return 3;
		}
		else if (checkR2(candidateSolution)) {
			return 4;
		}
		return -1;
			
		
		//check
	}
	
	//R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
	public boolean checkR1(String candidateSolution){
		int number = Integer.parseInt(candidateSolution);
		if(number > 0){
			return true;
		}
		return false;
	}
	
	public boolean checkR2(String candidateSolution){
		
		
		return false;
	}	
	
	//R3: All digits appear only once in a sub-grid, i.e. they cannot repeat.
	public boolean checkR3(String candidateSolution){
		//Split the string to a number of 9 digits
		String []candSol = candidateSolution.split("(?<=\\G.........)");
		int candSolIndex = 0;
		
		while(candSolIndex < 9){

			String testPart = candSol[candSolIndex];
			//R2 part
			boolean ok = checkIfDublicate(testPart);
			candSolIndex++;
			if(ok){
				continue;
			}
			return true;				
		}
		return false;
	}
	
	//R3 part
	//Return true if no duplicates
	public boolean checkIfDublicate(String testPart){
		
		char[] characters = testPart.toCharArray();
        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }


        // Iterate through HashMap and return true if duplicates
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
 
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                return false;
            }
        }
        return true;

//Read more: http://www.java67.com/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html#ixzz4KEbZ7fhC	
	}
	
	
	public boolean checkR4(String candidateSolution){
		
		
		return false;
	}
	public boolean checkR5(String candidateSolution){
		
		
		return false;
	}
}
