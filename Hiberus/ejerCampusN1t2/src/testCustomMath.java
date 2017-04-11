import static org.junit.Assert.*;

import org.junit.Test;

public class testCustomMath {
	@Test
	public void testMCM(){
		assertEquals(7954, CustomMaths.getMCM(97, 82));
		assertEquals(17, CustomMaths.getMCM(0, 17));
		assertEquals(500, CustomMaths.getMCM(0, 500));
		assertEquals(1012, CustomMaths.getMCM(23, 44));

	}
	@Test
	public void testMCD(){
		assertEquals(1, CustomMaths.getMCD(97, 82));
		assertEquals(1, CustomMaths.getMCD(0, 17));
		assertEquals(100, CustomMaths.getMCD(300, 500));
		assertEquals(1, CustomMaths.getMCD(23, 44));

	}
	
	@Test
	public void testFibonacci(){
		assertEquals(23416728348467685L, CustomMaths.getFibonacci(80));
		assertEquals(2971215073L, CustomMaths.getFibonacci(47));
		assertEquals(832040, CustomMaths.getFibonacci(30));
		assertEquals(0, CustomMaths.getFibonacci(-4));

	}
	
	@Test
	public void testPrimo(){
		assertEquals(true, CustomMaths.getPrimo(23));
		assertEquals(true, CustomMaths.getPrimo(13));
		assertEquals(false, CustomMaths.getPrimo(-4));
		assertEquals(false, CustomMaths.getPrimo(0));

	}
}