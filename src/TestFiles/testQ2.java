package TestFiles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import SourceFiles.Q2;

public class testQ2 {
	//EdgeCoverage: "aacbabababababad"

	@Test
	public void testEdgeCoverage() {
		Q2 test = new Q2();
		test.forInput('a');
		test.forInput('a');
		test.forInput('c');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('a');
		test.forInput('d');
		
		assertEquals("NORMAL",test.getState());
		assertEquals("time",test.getInnerState());
		assertEquals("1 : 1", test.getTime());
		assertEquals("2/2/2001",test.getDate());
		
	}
	//ADUP Coverage for m,h,D,M,Y is "cbbabbabbabbabb"
	@Test
	public void testADUP() {
		Q2 test = new Q2();
		test.forInput('c');
		test.forInput('b');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('b');
		test.forInput('a');
		test.forInput('b');
		test.forInput('b');
		
		assertEquals("UPDATE",test.getState());
		assertEquals("year",test.getInnerState());
		assertEquals("2 : 2", test.getTime());
		assertEquals("3/3/2002",test.getDate());
		
	}

	

}
