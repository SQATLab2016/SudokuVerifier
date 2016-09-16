import java.util.Vector;

public class SudokuVerifier {
	

	public int verify(String candidateSolution) {
		
		int i,j,k,a,b,l,t;
		
		
		//change string into square
		int square[][] = new int [9][9];
		for(i=0;i<9;i++){
			for(j=0;j<9;j++){
				square[i][j] = candidateSolution.charAt(i*9+j)-'0';		
			}
		}
		
		
		//check R1
		for(i=0;i<9;i++ ){
			for(j=0;j<9;j++){
				if(square[i][j]<'1'||square[i][j]>'9'){
					return -1;
				}
			}	
		}
		return 0;
		
		
		//check R2-sub_grid
/*		Vector check = new Vector();
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(a=i*3;a<(i+1)*3;a++){
					for(b=j*3;b<(j+1)*3;b++){
						for(k=0;k<check.size();k++){
							if(k==0){
							check.addElement(square[i][j]);
							}
							else{
								t = (int) check.get(k);
								if(square[i][j] - t == 0 ){
									return -2;
								}
								else{
									check.addElement(square[i][j]);
								}		
							}
						}		
					}
				}	
			}
		}
		return 0;
*/		
/*		
		//check R3-Row
		Vector check = new Vector();
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<check.size();k++){
					if(k==0){
					check.addElement(square[i][j]);
					}
					else{
						t = (int) check.get(k);
						if(square[i][j] - t == 0 ){
							return -3;
						}
						else{
							check.addElement(square[i][j]);
						}		
					}
				}		
			}
		}
		return 0;
*/			
/*		
		//check R4-Column
		Vector check = new Vector();
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<check.size();k++){
					if(k==0){
					check.addElement(square[j][i]);
					}
					else{
						t = (int) check.get(k);
						if(square[j][i] - t == 0 ){
							return -4;
						}
						else{
							check.addElement(square[j][i]);
						}		
					}
				}		
			}
		}	
		return 0;
*/				
		
	
		
		//check
	}
}
