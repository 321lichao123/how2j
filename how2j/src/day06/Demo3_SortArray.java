package day06;

public class Demo3_SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ѡ������
		/*
		 * ѡ�������˼·�� 
		 * 	�ѵ�һλ���������еĽ��бȽϣ�ֻҪ�ȵ�һλС�ģ��ͻ�����һ��λ���� �Ƚ���󣬵�һλ������С��
		 *  Ȼ���ٴӵڶ�λ��ʣ����������н��бȽϣ�ֻҪ�ȵڶ�λС���ͻ����ڶ���λ���� �Ƚ���󣬵ڶ�λ���ǵڶ�С��
		 */
		// ����5�������������
		int[] arr = {100, 55, 75, 120, 45};
		for(int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		// ð������
		/*
		 * ð�ݷ������˼·�� ��һ�����ӵ�һλ��ʼ����������λ���бȽ� �������ǰ��ıȺ���Ĵ󣬾ͰѴ�����ݽ����ں��棬ѭ���Ƚ���Ϻ����һλ��������
		 * �ڶ����� ����һ�Σ�ֻ�������ñȽ����һλ
		 */
		int[] arr1 = {120, 88, 44, 150, 66};
		for(int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length - i - 1; j++) {
				if (arr1[j] > arr1[j+1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		/*
		 * �ܽ��¾��裺 
		 * 	1��ѡ������i��j�Ƚϵġ�
		 *  2��ð�ݷ�������Ƚϣ�����Ҫע�����ѭ���ǱȽϴ�������Ҫ��ѡ�񷨸���ˡ��������׻����
		 */
	}

}
