import static org.junit.Assert.*;
import org.junit.Test;

public class Array_dealTest {

	@Test
	public void testPrintarray() {
		Array_deal TestArray_deal = new Array_deal();
		
		int[] Array1= {1, 2, 3};
		int[] Array2= {10, 100, 1000};
		
		String Testans1 = TestArray_deal.printarray(Array1);
		String Testans2 = TestArray_deal.printarray(Array2);
		
		assertEquals("当前数组: {1,2,3}",Testans1);
		assertEquals("当前数组: {10,100,1000}",Testans2);
	}

	@Test
	public void testFind_num_500() {
		Array_deal TestArray_deal = new Array_deal();
		
		int[] Array1= {1, 2, 3};
		int[] Array2= {1, 155, 500};
		
		boolean Testans1 = TestArray_deal.find_num_500(Array1);
		boolean Testans2 = TestArray_deal.find_num_500(Array2);
		
		assertEquals(false,Testans1);
		assertEquals(true,Testans2);
	}

	@Test
	public void testFix_array() {
		Array_deal TestArray_deal = new Array_deal();
		
		int[] Array1= {1, 2, 3};
		int[] Array2= {-1, 103, 500};
		
		int[] Testans1 = TestArray_deal.fix_array(Array1);
		int[] Testans2 = TestArray_deal.fix_array(Array2);
		
		assertEquals(3,Testans1[1]);
		assertEquals(3,Testans2[1]);
	}

}
