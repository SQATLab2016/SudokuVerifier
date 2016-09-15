
public class SudokuVerifier {
	
	
	static boolean rowsClumns = false;
	static boolean subGird=false;
	
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		char temporal;
		int temp;
		
		
		
		
		
		for (int i = 0; i < 9; i++) { //colums
			for (int j = 0; j < 9; j++) { //rows
				temporal=candidateSolution.charAt(j+(9*i));
	
				if(Character.isDefined(temporal)){
					
				}
				
				//compare with all the row
				for (int j2 = 0; j2 < 9; j2++) {
					
				}
				
				
				
				
				
				
				
			}
		
		}
		
		
		return 0;
		
		//check
	}
	
	public boolean verifyDigits(String candidateSolution){
		
		boolean ok=true;
		for (int i = 0; i < 81; i++) {
			
			if(!Character.isDigit(candidateSolution.charAt(i)) && candidateSolution.charAt(i)!='0'){
				ok=false;
			}
			
			
		}
		
		return ok;
	}
	
	
		public boolean verifyRow(String candidateSolution){
			boolean ok=true;
			int candidateSol= Integer.parseInt(candidateSolution);
			int numTemp1=0, numTemp2=0;;
			for (int i = 0; i < 81; i=i+9) {
				//row
				boolean row= true;
				
				for (int j = 0; j < 9; j++) {
					numTemp1= Integer.parseInt( ""+candidateSolution.charAt(i+j));
					for (int j2 = 0; j2 < 9; j2++) {
						if (j!=j2 && numTemp1==Integer.parseInt( ""+candidateSolution.charAt(i+j2))) {
							row=false;
						}
					}
					
				}
				
				
				if (!row) ok=false;
			}
			
			
			
			return ok;
		}
		
}
