package day06;

public class Demo2_InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ռ��븳ֵ�ֲ�����
		int[] a = new int[5]; // ����ռ�
		a[0] = 100; // ��ֵ
		a[1] = 200; // ��ֵ
		a[2] = 300; // ��ֵ
		a[3] = 400; // ��ֵ
		a[4] = 500; // ��ֵ
		// ����ռ�ͬʱ��ֵ
		// ��һ��д����
		int[] b = new int[]{100, 110, 120, 130, 140};
		// �ڶ���д��:
		int[] c = {100, 110, 120, 130, 140};
		// ����ƶ�����������ݣ��Ͳ���ͬʱ��������ĳ���
		// Cannot define dimension expressions when an array initializer is provided
		// int[] d = new int[3]{100, 110, 120};
		// System.out.println(d);
		/*
		 * ���ȴ���һ��������5������,������������ (���������������İ취���ο�����)
		 * ʹ��forѭ������whileѭ�������������ʵ�ַ�תЧ��
		 */
		int[] arr = new int[5];
		arr[0] = (int)(Math.random() * 100);
		arr[1] = (int)(Math.random() * 100);
		arr[2] = (int)(Math.random() * 100);
		arr[3] = (int)(Math.random() * 100);
		arr[4] = (int)(Math.random() * 100);
		// ��ӡ�����ÿһ��
		for(int i = 0; i < arr.length; i++) {
			System.out.println("�����" + i + "���ֵ��" + arr[i]);
		}
		int i = 0;
		int length = arr.length;
//		int temp = 0;
		while (i > length / 2) {
			int temp = arr[i];
			arr[i] = arr[length - i - 1];
			arr[length - i - 1] = temp;
			i++;
		}
		System.out.println("----------------------");
		// ��ӡ�����ÿһ��
		for(int j = 0; j < arr.length; j++) {
			System.out.println("�����" + j + "���ֵ��" + arr[j]);
		}
	}

}
