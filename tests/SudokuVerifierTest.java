import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify_StringWithTooManyChars() {
		String testCandidate = "4173698256321589479587243168254371697915864323469127582896435715732916841648752935";
		SudokuVerifier verifier = new SudokuVerifier();
		
		int result = verifier.verify(testCandidate);
		assertEquals("String has too many chars", -1, result);
	}
	
	@Test
	public void testVerify_StringWithTooLittleChars() {
		String testCandidate = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
		SudokuVerifier verifier = new SudokuVerifier();
		
		int result = verifier.verify(testCandidate);
		assertEquals("String has too little chars", -1, result);
	}
	
	@Test
	public void testVerify_StringWithIllegalChars() {
		String testCandidate = "4173698256321589479587243168254371697915864323469127582896435715732916841648752-3";
		SudokuVerifier verifier = new SudokuVerifier();
		
		int result = verifier.verify(testCandidate);
		assertEquals("String has invalid chars", -1, result);
	}
	
	@Test
	public void testGetGlobalRowsFirstRowCorrect() {
		String testCandidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier verifier = new SudokuVerifier();
		
		verifier.verify(testCandidate);
		
		String[] verifierGlobalRows = verifier.getGlobalRows();
		String correctRow = "417369825";
		assertEquals(correctRow, verifierGlobalRows[0]);
	}
	
	@Test
	public void testGetGlobalRowsLastRowCorrect() {
		String testCandidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier verifier = new SudokuVerifier();
		
		verifier.verify(testCandidate);
		
		String[] verifierGlobalRows = verifier.getGlobalRows();
		String correctRow = "164875293";
		assertEquals(correctRow, verifierGlobalRows[8]);
	}
	
	@Test
	public void testGetGlobalRowsCheckAllRows() {
		String testCandidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier verifier = new SudokuVerifier();
		
		verifier.verify(testCandidate);
		
		String[] verifierGlobalRows = verifier.getGlobalRows();
		String[] correctRows = new String[]{"417369825", "632158947", "958724316", "825437169", "791586432", "346912758", "289643571", "573291684", "164875293"};
		assertArrayEquals(verifierGlobalRows, correctRows);
	}
	
	@Test
	public void testGetGlobalColumnsFirstRowCorrect() {
		String testCandidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier verifier = new SudokuVerifier();
		
		verifier.verify(testCandidate);
		
		String[] verifierGlobalColumns = verifier.getGlobalColumns();
		String correctColumn = "469873251";
		assertEquals(correctColumn, verifierGlobalColumns[0]);
	}
	
	@Test
	public void testGetGlobalColumnsLastRowCorrect() {
		String testCandidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier verifier = new SudokuVerifier();
		
		verifier.verify(testCandidate);
		
		String[] verifierGlobalColumns = verifier.getGlobalColumns();
		String correctColumn = "576928143";
		assertEquals(correctColumn, verifierGlobalColumns[8]);
	}
	
	@Test
	public void testGetGlobalColumnsGetAllColumns() {
		String testCandidate = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier verifier = new SudokuVerifier();
		
		verifier.verify(testCandidate);
		
		String[] verifierGlobalColumns = verifier.getGlobalColumns();
		String[] correctColumns = new String[]{"469873251", "135294876", "728516934", "317459628", "652381497", "984762315", "893147562", "241635789", "576928143"};
		assertArrayEquals(correctColumns, verifierGlobalColumns);
	}

}
