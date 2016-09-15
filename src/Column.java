import java.util.ArrayList;

public class Column {

        ArrayList<Integer> column = new ArrayList<Integer>(9);
        
        private void insertNumbersColumn(int columnIndex, int input) {
        	
    		column.add(columnIndex,input);
    	}
      
	    private void replaceNumber(int columnIndex, int input){	
	    	
	    	column.set(columnIndex, input);
	  
	    }
	
	
}
