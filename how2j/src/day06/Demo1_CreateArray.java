package day06;

public class Demo1_CreateArray {
	public static void main(String[] args) {
		/*
			int[] a;����һ���������
			[]��ʾ�ñ�����һ������
			int��ʾ�������ÿһ��Ԫ�ض���һ������
			a�Ǳ�����
		 */
		// ����һ������
		int[] a;
		/*
		 * ���������ʱ��Ҫָ������ĳ���
		 * new int[5]
		 * ���ø���:
		 * 		�����������һ�����飬����a�����ǰ�a��������
		 * a = new int[5]; ��ʾa�������ָ������
		 * */
		a = new int[5];
		// ��������
		int[] b = new int[5];
		
		// ��������
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[4] = 4;
//		a[5] = 5; // java.lang.ArrayIndexOutOfBoundsException
		/*
		 * .length��ʾ����ĳ���
		 * ��������±귶Χ��0������-1
		 * һ�����������Χ�ͻ���������±�Խ���쳣
		 * */
		System.out.println(a.length);
		// ������Сֵ
		b[0] = (int)(Math.random() * 100);
		b[1] = (int)(Math.random() * 100);
		b[2] = (int)(Math.random() * 100);
		b[3] = (int)(Math.random() * 100);
		b[4] = (int)(Math.random() * 100);
		// ��ӡ�����ÿһ��
		for(int i = 0; i < b.length; i++) {
			System.out.println("�����" + i + "���ֵ��" + b[i]);
		}
		// Ĭ�������һ������Сֵ
		int temp = b[0];
		// �������������Сֵ
		for(int i = 1; i < b.length; i++) {
			if (b[i] < temp) {
				temp = b[i]; 
			}
		}
		System.out.println("�������Сֵ�ǣ�" + temp);
	}
}
