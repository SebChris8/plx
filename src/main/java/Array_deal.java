import org.apache.commons.lang3.ArrayUtils;

public class Array_deal {
	public String printarray(int[] Array) {												//调用ArrayUtils.toString方法生成输出数组的字符串
		return "当前数组: " +ArrayUtils.toString(Array);
	}
		
	public boolean find_num_500(int[] Array) {												//调用ArrayUtils.contains方法查找元素
		return ArrayUtils.contains(Array, 50);												//错误注入：将500改成了50
	}
	
	public int[] reserve_array(int[] Array) {												//调用ArrayUtils.reverse方法将数组倒序排列
		if(Array[0] > 0 ) {
			ArrayUtils.reverse(Array);
		}
		return Array;
	}
	
	public int[] fix_array(int[] Array) {													//根据第一个元素是否为正数，修改第二个元素
		if(Array[0] > 0) {
			Array[1] = Array[1] + 1;
		}
		else {
			Array[1] = Array[1] - 100;
		}
		System.out.println("已修改第二项");
		return Array;
	}
	
	public void run() {
		int[] Array = { 1, 3, 5, 7, 2, 4, 8, 16, 32, 500 };
		
		System.out.println(printarray(Array));
		
		Array = fix_array(Array);
		System.out.println(printarray(Array));
		
		System.out.println("Array contains '500'? " + find_num_500(Array));
		
		Array = reserve_array(Array);
		System.out.println(printarray(Array));
	}
}
