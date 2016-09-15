import java.util.ArrayList;

public class Board {
	
	 ArrayList<ArrayList> board = new ArrayList<ArrayList>(18);
	 
	 private void insertRow(ArrayList<Integer> row) {
	    	
			board.add(row);
		}
	 
	 private void insertColumn(ArrayList<Integer> column) {
	    	
			board.add(column);
		}
	  

}
