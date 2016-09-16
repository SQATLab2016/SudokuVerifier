
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		String[] subGrids; 
		
		if(!checkInputStringLength(candidateSolution) || !checkInputStringContainsOnlyPostiveInt(candidateSolution)){
			return -1;
		}
		else{
			subGrids = createSubGrids(candidateSolution);
		}
		
		
		// returns 0 if the candidate solution is correct
		
		return 0;
		
		
		
		//check
	}
	
	public boolean checkInputStringLength(String candidateSolution){
		boolean inputStringEquals81 = (candidateSolution.length() == 81) ? true : false;
		return inputStringEquals81;
	}
	
	public boolean checkInputStringContainsOnlyPostiveInt(String candidateSolution){
		boolean isPostiveInt = false;
		for(int i = 0; i < candidateSolution.length(); i++){
			char character = candidateSolution.charAt(i);
			try{
				Integer.parseInt(String.valueOf(character));
				isPostiveInt = true;
			}catch(NumberFormatException ex){
				return isPostiveInt = false;
			}
		}
		return isPostiveInt;
	}
	
	public String[] createSubGrids(String candidateSolution){
		String []subGrids = new String[9];
		for(int i=0; i<9; i++){
			switch(i){
				case 0:
					subGrids[i] = candidateSolution.substring(0,9);
					break;
				case 1:
					subGrids[i] = candidateSolution.substring(9,18);
					break;
				case 2:
					subGrids[i] = candidateSolution.substring(18,27);
					break;
				case 3:
					subGrids[i] = candidateSolution.substring(27,36);
					break;
				case 4:
					subGrids[i] = candidateSolution.substring(36,45);
					break;
				case 5:
					subGrids[i] = candidateSolution.substring(45,54);
					break;
				case 6:
					subGrids[i] = candidateSolution.substring(54,63);
					break;
				case 7:
					subGrids[i] = candidateSolution.substring(63,72);
					break;
				default:
					subGrids[i] = candidateSolution.substring(72);
					break;
			}
		}
		return subGrids;
	}
	
}
