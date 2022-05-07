package TestFiles;

import static org.junit.Assert.*;

import org.junit.Test;

import SourceFiles.Q1;

public class testQ1 {

	@Test
	public void testEvenOddWithEven() {
		Q1 tes = new Q1();
		assertEquals("EVEN", tes.EvenOdd(6));
	}
	@Test
	public void testEvenOddWithZero() {
		Q1 tes = new Q1();
		assertEquals("EVEN", tes.EvenOdd(0));
	}
	@Test
	public void testEvenOddWithOdd() {
		Q1 tes = new Q1();
		assertEquals("ODD", tes.EvenOdd(7));
	}
	@Test
	public void testMinMaxValues() {
		Q1 tes = new Q1();
		int[] arr= {0,1,5,7,11,6,5};
		int[] ans= tes.MinMaxValues(arr);
		assertEquals(0, ans[0]);
		assertEquals(11, ans[1]);
	}

	@Test
	public void testMinMaxValuesWithNegative() {
		Q1 tes = new Q1();
		int[] arr= {0,-1,5,7,-11,6,5};
		int[] ans= tes.MinMaxValues(arr);
		assertEquals(-11, ans[0]);
		assertEquals(7, ans[1]);
	}
	@Test
	public void testMinMaxValuesWithRepeated() {
		Q1 tes = new Q1();
		int[] arr= {0,1,-1};
		int[] ans= tes.MinMaxValues(arr);
		assertEquals(-1, ans[0]);
		assertEquals(1, ans[1]);
	}
}
