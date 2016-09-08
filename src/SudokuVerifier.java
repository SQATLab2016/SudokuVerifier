
public class SudokuVerifier {
	
	
	public void convert(String candidateSolution){
		 String [] solution =candidateSolution.split("");
		 int i=0;
		 String[] Line1 = new String[9] ;
		 String[] Line2 = new String[9];
		 String[] Line3 = new String[9];
		 String[] Line4 = new String[9];
		 String[] Line5 = new String[9];
		 String[] Line6 = new String[9];
		 String[] Line7 = new String[9];
		 String[] Line8 = new String[9];
		 String[] Line9 = new String[9];
		for(i=0;i<9; i++){Line1[i]=solution[i];}
		for(i=9;i<18; i++){Line2[i-9]=solution[i];}
		for(i=18;i<27; i++){Line3[i-18]=solution[i];}
		for(i=27;i<36; i++){Line4[i-27]=solution[i];}
		for(i=36;i<45; i++){Line5[i-36]=solution[i];}
		for(i=45;i<54; i++){Line6[i-45]=solution[i];}
		for(i=54;i<63; i++){Line7[i-54]=solution[i];}
		for(i=63;i<72; i++){Line8[i-63]=solution[i];}
		for(i=72;i<81; i++){Line9[i-72]=solution[i];}
		
}
	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		if (candidateSolution.length()==81){
			candidateSolution.convert();
		
		return 0;
		
		//check
		
		}
	return -5; //return -5 means that the solution isn't 81 caracters long
		
	}
}
