import java.util.ArrayList;

public class Row {
	
	ArrayList<Integer> row = new ArrayList<Integer>(9);
    
    private void insertNumbersRow(int rowIndex, int input) {
    	
		row.add(rowIndex,input);
	}
  
    private void replaceNumberRow(int rowIndex, int input){	
    	
    	row.set(rowIndex, input);
  
    }


}
