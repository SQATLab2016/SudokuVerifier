import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
	    String forCheck = candidateSolution;
		while(!forCheck.isEmpty()){
		  	if(!(forCheck.charAt(0)=='1' ||
		  			forCheck.charAt(0)=='2'|| forCheck.charAt(0)=='3' ||
		  			forCheck.charAt(0)=='4'|| forCheck.charAt(0)=='5' ||
		  			forCheck.charAt(0)=='6'|| forCheck.charAt(0)=='7' ||
		  			forCheck.charAt(0)=='8'|| forCheck.charAt(0)=='9')) return -1;		
			
			
		forCheck = forCheck.substring(1);
		}
		int[] numbers={1,2,3,4,5,6,7,8,9};
		
		char[] firstGrid = {candidateSolution.charAt(0),candidateSolution.charAt(1),candidateSolution.charAt(2),
				candidateSolution.charAt(9),candidateSolution.charAt(10),candidateSolution.charAt(11),
				candidateSolution.charAt(18),candidateSolution.charAt(19),candidateSolution.charAt(20)};
		Arrays.sort(firstGrid);
		
		char[] secondGrid = {candidateSolution.charAt(3),candidateSolution.charAt(4),candidateSolution.charAt(5),
				candidateSolution.charAt(12),candidateSolution.charAt(13),candidateSolution.charAt(14),
				candidateSolution.charAt(21),candidateSolution.charAt(22),candidateSolution.charAt(23)};
		Arrays.sort(secondGrid);
		
		char[] thirdGrid = {candidateSolution.charAt(6),candidateSolution.charAt(7),candidateSolution.charAt(8),
				candidateSolution.charAt(15),candidateSolution.charAt(16),candidateSolution.charAt(17),
				candidateSolution.charAt(24),candidateSolution.charAt(25),candidateSolution.charAt(26)};
		Arrays.sort(thirdGrid);
		
		char[] forthGrid = {candidateSolution.charAt(27),candidateSolution.charAt(28),candidateSolution.charAt(29),
				candidateSolution.charAt(36),candidateSolution.charAt(37),candidateSolution.charAt(38),
				candidateSolution.charAt(45),candidateSolution.charAt(46),candidateSolution.charAt(47)};
		Arrays.sort(forthGrid);
	
		char[] fifthGrid = {candidateSolution.charAt(30),candidateSolution.charAt(31),candidateSolution.charAt(32),
				candidateSolution.charAt(39),candidateSolution.charAt(40),candidateSolution.charAt(41),
				candidateSolution.charAt(48),candidateSolution.charAt(49),candidateSolution.charAt(50)};

		Arrays.sort(fifthGrid);
		
		char[] sixthGrid = {candidateSolution.charAt(33),candidateSolution.charAt(34),candidateSolution.charAt(35),
				candidateSolution.charAt(42),candidateSolution.charAt(43),candidateSolution.charAt(44),
				candidateSolution.charAt(51),candidateSolution.charAt(52),candidateSolution.charAt(53)};

		Arrays.sort(sixthGrid);
		
		char[] seventhGrid = {candidateSolution.charAt(54),candidateSolution.charAt(55),candidateSolution.charAt(56),
				candidateSolution.charAt(63),candidateSolution.charAt(64),candidateSolution.charAt(65),
				candidateSolution.charAt(72),candidateSolution.charAt(73),candidateSolution.charAt(74)};

		Arrays.sort(seventhGrid);
		
		char[] eightGrid = {candidateSolution.charAt(57),candidateSolution.charAt(58),candidateSolution.charAt(59),
				candidateSolution.charAt(66),candidateSolution.charAt(67),candidateSolution.charAt(68),
				candidateSolution.charAt(75),candidateSolution.charAt(76),candidateSolution.charAt(77)};

		Arrays.sort(eightGrid);
		
		char[] ninethGrid = {candidateSolution.charAt(60),candidateSolution.charAt(61),candidateSolution.charAt(62),
				candidateSolution.charAt(69),candidateSolution.charAt(70),candidateSolution.charAt(71),
				candidateSolution.charAt(78),candidateSolution.charAt(79),candidateSolution.charAt(80)};

		Arrays.sort(ninethGrid);
		
		
		if((!Arrays.toString(numbers).equals(Arrays.toString(firstGrid)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(secondGrid)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(thirdGrid)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(forthGrid)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(fifthGrid)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(sixthGrid)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(seventhGrid)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(eightGrid)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(ninethGrid)))
				) {
	    	
	    return -2; 	
	    }
		char[] firstRow = {candidateSolution.charAt(0),candidateSolution.charAt(1),candidateSolution.charAt(2),
				candidateSolution.charAt(3),candidateSolution.charAt(4),candidateSolution.charAt(5),
				candidateSolution.charAt(6),candidateSolution.charAt(7),candidateSolution.charAt(8)};
		Arrays.sort(firstRow);
		
		char[] secondRow = {candidateSolution.charAt(9),candidateSolution.charAt(10),candidateSolution.charAt(11),
				candidateSolution.charAt(12),candidateSolution.charAt(13),candidateSolution.charAt(14),
				candidateSolution.charAt(15),candidateSolution.charAt(16),candidateSolution.charAt(17)};
		Arrays.sort(secondRow);
		
		char[] thirdRow = {candidateSolution.charAt(18),candidateSolution.charAt(19),candidateSolution.charAt(20),
				candidateSolution.charAt(21),candidateSolution.charAt(22),candidateSolution.charAt(23),
				candidateSolution.charAt(24),candidateSolution.charAt(25),candidateSolution.charAt(26)};
		Arrays.sort(thirdRow);
		
		char[] forthRow = {candidateSolution.charAt(27),candidateSolution.charAt(28),candidateSolution.charAt(29),
				candidateSolution.charAt(30),candidateSolution.charAt(31),candidateSolution.charAt(32),
				candidateSolution.charAt(33),candidateSolution.charAt(34),candidateSolution.charAt(35)};
		Arrays.sort(forthRow);
	
		char[] fifthRow = {candidateSolution.charAt(36),candidateSolution.charAt(37),candidateSolution.charAt(38),
				candidateSolution.charAt(39),candidateSolution.charAt(40),candidateSolution.charAt(41),
				candidateSolution.charAt(42),candidateSolution.charAt(43),candidateSolution.charAt(44)};

		Arrays.sort(fifthRow);
		
		char[] sixthRow = {candidateSolution.charAt(45),candidateSolution.charAt(46),candidateSolution.charAt(47),
				candidateSolution.charAt(48),candidateSolution.charAt(49),candidateSolution.charAt(50),
				candidateSolution.charAt(51),candidateSolution.charAt(52),candidateSolution.charAt(53)};

		Arrays.sort(sixthRow);
		
		char[] seventhRow = {candidateSolution.charAt(54),candidateSolution.charAt(55),candidateSolution.charAt(56),
				candidateSolution.charAt(57),candidateSolution.charAt(58),candidateSolution.charAt(59),
				candidateSolution.charAt(60),candidateSolution.charAt(61),candidateSolution.charAt(62)};

		Arrays.sort(seventhRow);
		
		char[] eightRow = {candidateSolution.charAt(63),candidateSolution.charAt(64),candidateSolution.charAt(65),
				candidateSolution.charAt(66),candidateSolution.charAt(67),candidateSolution.charAt(68),
				candidateSolution.charAt(79),candidateSolution.charAt(70),candidateSolution.charAt(71)};

		Arrays.sort(eightRow);
		
		char[] ninethRow = {candidateSolution.charAt(72),candidateSolution.charAt(73),candidateSolution.charAt(74),
				candidateSolution.charAt(75),candidateSolution.charAt(76),candidateSolution.charAt(77),
				candidateSolution.charAt(78),candidateSolution.charAt(79),candidateSolution.charAt(80)};

		Arrays.sort(ninethRow);
		
		if((!Arrays.toString(numbers).equals(Arrays.toString(firstRow)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(secondRow)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(thirdRow)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(forthRow)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(fifthRow)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(sixthRow)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(seventhRow)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(eightRow)))
				||(!Arrays.toString(numbers).equals(Arrays.toString(ninethRow)))
				) {
	    	
	    return -3; 	
	    
		}
	    
		
	    
	    return 0;
	
		
	}
	
	
}
