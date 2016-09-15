
public class SudokuVerifier {
	
	public boolean check(String[] Part){
		return checknumber(Part, "1")&&checknumber(Part, "2")&&checknumber(Part, "3")&&checknumber(Part, "4")&&checknumber(Part, "5")&&checknumber(Part, "6")&&checknumber(Part, "7")&&checknumber(Part, "8")&&checknumber(Part, "9");
	
	}
	
	public boolean checknumber(String[] Part, String number){
		int i=0;
		int occurence=0;
		for(i=0;i<9;i++){
			if (Part[i]==number)occurence++;
		}
		return occurence==1;
	}
	
	public boolean checkLines(String candidateSolution){
		 String [] solution =candidateSolution.split("");
		 int i = 0;
		 String[] Line1 = new String[9];
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
		return check(Line1)&&check(Line2)&&check(Line3)&&check(Line4)&&check(Line5)&&check(Line5)&&check(Line7)&&check(Line8)&&check(Line9);
		
 }  
	public boolean checkColumns(String candidateSolution){
		String[] solution = candidateSolution.split("");
		int i = 0;
		String[] Column1 = new String[9];
		String[] Column2 = new String[9];
		String[] Column3 = new String[9];
		String[] Column4 = new String[9];
		String[] Column5 = new String[9];
		String[] Column6 = new String[9];
		String[] Column7 = new String[9];
		String[] Column8 = new String[9];
		String[] Column9 = new String[9];
		for(i=0;i<9; i++){Column1[i]=solution[i*9];}
		for(i=0;i<9; i++){Column2[i]=solution[1+i*9];}
		for(i=0;i<9; i++){Column3[i]=solution[2+i*9];}
		for(i=0;i<9; i++){Column3[i]=solution[3+i*9];}
		for(i=0;i<9; i++){Column4[i]=solution[4+i*9];}
		for(i=0;i<9; i++){Column5[i]=solution[5+i*9];}
		for(i=0;i<9; i++){Column6[i]=solution[6+i*9];}
		for(i=0;i<9; i++){Column7[i]=solution[7+i*9];}
		for(i=0;i<9; i++){Column8[i]=solution[8+i*9];}
		for(i=0;i<9; i++){Column9[i]=solution[9+i*9];}
		return check(Column1)&&check(Column2)&&check(Column3)&&check(Column4)&&check(Column5)&&check(Column6)&&check(Column7)&&check(Column8)&&check(Column9);
	}
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		if (candidateSolution.length()==81){
			if (checkLines(candidateSolution)==true){
				if (checkColumns(candidateSolution)==true){
					return 0;
				}
				else return -4;
				
			}
			else return -3;
			
		
			
			
		
		
		//check
		
		}
	return -5; //return -5 means that the solution isn't 81 caracters long
		
	}
}
