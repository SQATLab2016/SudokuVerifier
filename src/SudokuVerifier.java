import java.util.BitSet;

public class SudokuVerifier {
	
	public static int verify(String candidateSolution) {		
		
		
		return 0;
		
	}
	
	public static int verifyLength(String candidateSolution) {		
		
		if (candidateSolution.length() == 81) 
			return 0;
		else
			return 1;
	}
	
	public static int verifyRow(String candidateSolution) {		
		
		int allNumbers = 0;
		
		for(int i=0; i<=81; i=i+9){
			String row = candidateSolution.substring(i,i+9);
			int intRow = Integer.parseInt(row);
		
			if (intRow != 45) //check rows
				allNumbers = 1;		
		}
		return  allNumbers;
		
	}
	
public static int verifyRowOrder(String candidateSolution) {		
		

		for(int i=1; i<=9; i++){
			BitSet filled = new BitSet(9);
			for(int j=1; j<=9; j++){
				filled.set(candidateSolution.charAt(i*j)-1);
			}
		}
		return 0;
	}
}
