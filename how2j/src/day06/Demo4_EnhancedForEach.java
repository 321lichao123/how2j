package day06;

public class Demo4_EnhancedForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ǿ��forѭ��
		// ��ǿ��forѭ��ֻ������ȡֵ��ȴ���������޸��������ֵ
		int[] arr = {18,62,68,82,65,9};
		for (int value : arr) {  // �����value����ÿһ��
			System.out.println(value);
		}
		// ����ǿ��forѭ���ҳ������Ǹ���
		int maxValue = arr[0];
		int minValue = arr[0];
		for (int value : arr) {
			if (value > maxValue) {
				maxValue = value;
			}
			if (value < minValue) {
				minValue = value;
			}
		}
		System.out.println("��������ֵ:" + maxValue);
		System.out.println("������С��ֵ:" + minValue);
	}

}
