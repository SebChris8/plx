import org.apache.commons.lang3.ArrayUtils;

public class Array_deal {
	public String printarray(int[] Array) {												//����ArrayUtils.toString�����������������ַ���
		return "��ǰ����: " +ArrayUtils.toString(Array);
	}
		
	public boolean find_num_500(int[] Array) {												//����ArrayUtils.contains��������Ԫ��
		return ArrayUtils.contains(Array, 50);												//����ע�룺��500�ĳ���50
	}
	
	public int[] reserve_array(int[] Array) {												//����ArrayUtils.reverse���������鵹������
		if(Array[0] > 0 ) {
			ArrayUtils.reverse(Array);
		}
		return Array;
	}
	
	public int[] fix_array(int[] Array) {													//���ݵ�һ��Ԫ���Ƿ�Ϊ�������޸ĵڶ���Ԫ��
		if(Array[0] > 0) {
			Array[1] = Array[1] + 1;
		}
		else {
			Array[1] = Array[1] - 100;
		}
		System.out.println("���޸ĵڶ���");
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
