
public class SudokuVerifier {
	
	
	static boolean rowsClumns = false;
	static boolean subGird=false;
	
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		char temporal;
		
		
		
		
		
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
			int numTemp1=0;
			for (int i = 0; i < 81; i=i+9) {
				//row
//				System.out.println("int fila "+ i);
				boolean row= true;
				
				for (int j = 0; j < 9; j++) {
					numTemp1= Integer.parseInt( ""+candidateSolution.charAt(i+j));
//					System.out.println("numTemp1 "+ numTemp1);
					for (int j2 = 0; j2 < 9; j2++) {
//						System.out.println("numTemp2 "+ Integer.parseInt( ""+candidateSolution.charAt(i+j2)));

						if (j!=j2 && numTemp1==Integer.parseInt( ""+candidateSolution.charAt(i+j2))) {
							row=false;
						}
					}
					
				}
//				System.out.println("row"+ row);
				
				if (!row) ok=false;
//				System.out.println(ok);

			}
			
			
			return ok;
		}
		
		
		
		public boolean verifyColumns(String candidateSolution){
			boolean ok=true;
			int numTemp1=0;
			for (int i = 0; i < 9; i++) {
				//columns
				boolean column= true;
				
				for (int j = 0; j < 81; j=j+9) {
					numTemp1= Integer.parseInt( ""+candidateSolution.charAt(i+j));
					for (int j2 = 0; j2 < 81; j2=j2+9) {

						if (j!=j2 && numTemp1==Integer.parseInt( ""+candidateSolution.charAt(i+j2))) {
							column=false;
						}
					}
					
				}
				
				if (!column) ok=false;

			}
			
			return ok;

		}
		
		
	
		public boolean verifySubGrid(String candidateSolution){
			boolean ok=true;
			 int[][] array2 = new int[3][3];
			
			
			return ok;

		}
}
