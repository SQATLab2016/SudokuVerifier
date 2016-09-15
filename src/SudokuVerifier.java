
public class SudokuVerifier {
	
	public boolean check(String[] Part){
		return checknumber(Part, "1")&&checknumber(Part, "2")&&checknumber(Part, "3")&&checknumber(Part, "4")&&checknumber(Part, "5")&&checknumber(Part, "6")&&checknumber(Part, "7")&&checknumber(Part, "8")&&checknumber(Part, "9");
	
	}
	
	public boolean checknumber(String[] Part, String number){
		int i=0;
		int occurence=0;
		for(i=0;i<9;i++){	if (Part[i]==number){occurence++;}}
		return occurence==1;
	}
	

	public boolean checkLines(String candidateSolution){
		 String [] solution =candidateSolution.split("");
		 int i = 0;
		 String[] Line1 = new String[9];
		 //String[] Line2 = new String[9];
		 //String[] Line3 = new String[9];
		 //String[] Line4 = new String[9];
		 //String[] Line5 = new String[9];
		 //String[] Line6 = new String[9];
		 //String[] Line7 = new String[9];
		 //String[] Line8 = new String[9];
		 //String[] Line9 = new String[9];
		for(i=0;i<9; i++){Line1[i]=solution[i];}
		//for(i=0;i<9; i++){Line2[i]=solution[i+9];}
		//for(i=0;i<9; i++){Line3[i]=solution[i+18];}
		//for(i=0;i<9; i++){Line4[i]=solution[i+27];}
		//for(i=0;i<9; i++){Line5[i]=solution[i+36];}
		//for(i=0;i<9; i++){Line6[i]=solution[i+45];}
		//for(i=0;i<9; i++){Line7[i]=solution[i+54];}
		//for(i=0;i<9; i++){Line8[i]=solution[i+63];}
		//for(i=0;i<9; i++){Line9[i]=solution[i+72];}
		//return check(Line1)&&check(Line2)&&check(Line3)&&check(Line4)&&check(Line5)&&check(Line6)&&check(Line7)&&check(Line8)&&check(Line9);
		String[] test = {"1","2","3","4","5","6","7","8","9"};
		return test==Line1;
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
		for(i=0;i<9; i++){Column4[i]=solution[3+i*9];}
		for(i=0;i<9; i++){Column5[i]=solution[4+i*9];}
		for(i=0;i<9; i++){Column6[i]=solution[5+i*9];}
		for(i=0;i<9; i++){Column7[i]=solution[6+i*9];}
		for(i=0;i<9; i++){Column8[i]=solution[7+i*9];}
		for(i=0;i<9; i++){Column9[i]=solution[8+i*9];}
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
	return -5; //return -5 means that the solution isn't 81 characters long
		
	}

	
	
	
}