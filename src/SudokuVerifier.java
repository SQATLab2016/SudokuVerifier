
public class SudokuVerifier {
	
	public int verify(String candidateSolution) throws StringLengthNotEqual_81Exception {
		int t = candidateSolution.length();
		if( t!= 81 )
			throw new StringLengthNotEqual_81Exception();
		int check_row;
		int[] check_col = new int[9];
		int[] check_grid = new int[9];
		for( int i=0 ; i<9 ; i++ ){
			check_col[i] = 1;
			check_grid[i] = 1;
		}
		for( int i=0 ; i<9 ; i++ ){
			check_row = 1;
			for( int j=0 ; j<9 ; j++ ){
				int get_number = get_number( candidateSolution.charAt(i*9+j));
				if( get_number<0 ) // The string contains other character rather than digits 1-9
					return -1;
				check_row *= get_number;
				check_col[j] *= get_number;
				check_grid[ (i/3)*3+(j/3) ] *= get_number;
			}
			if( check_row!= 9699690 ) // Some numbers appear for at least twice
				return -3;
		}
		for( int i=0 ; i<9 ; i++ ){
			if( check_grid[i]!=9699690 )
				return -2;
			if( check_col[i]!=9699690 )
				return -4;
		}
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	public int get_number(char t){
		int temp = -1;
		switch(t){
		case '1': temp = 1; break;
		case '2': temp = 2; break;
		case '3': temp = 3; break;
		case '4': temp = 5; break;
		case '5': temp = 7; break;
		case '6': temp = 11; break;
		case '7': temp = 13; break;
		case '8': temp = 17; break;
		case '9': temp = 19; 
		}
		return temp;
	}
	
}

class StringLengthNotEqual_81Exception extends Exception{
	public StringLengthNotEqual_81Exception(){}
}





