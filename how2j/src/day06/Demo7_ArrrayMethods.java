package day06;

import java.util.Arrays;

public class Demo7_ArrrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���鸴��copyOfRange(int[], original, int form, int to);
		// ��һ��������ʾԴ����
		// �ڶ�������ʾ��ʼλ��(ȡ�õ�)
		// ������������ʾ����λ��(ȡ����)
		/*
		 * ��ʹ��System.arraycopy�������鸴�����Ƶģ� Arrays�ṩ��һ��copyOfRange�����������鸴�ơ�
		 * ��ͬ����System.arraycopy����Ҫ����׼����Ŀ�����飬�����䳤�ȡ� copyOfRange
		 * ֻ��ҪԴ����;Ϳ����ˣ�ͨ������ֵ�����ܹ��õ�Ŀ�������ˡ� ����֮�⣬��Ҫע����� copyOfRange �ĵ�3����������ʾԴ����Ľ���λ�ã���ȡ������
		 */
		int[] a = {10, 11, 12, 13, 14, 15};
		int[] b = Arrays.copyOfRange(a, 0, 3);
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]); // 10, 11, 12
		}
		// ����תΪ�ַ���Arrays.toString();
		System.out.println(Arrays.toString(b));
		
		// ��������Arrays.sort();
		int[] c = new int[5];
		for(int i = 0; i < 5; i++) {
			c[i] = (int)(Math.random() * 100);
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		// ����Arrays.binarySearch()
		/*
		 * ʹ��binarySearch���в���֮ǰ������ʹ��sort�������� ����������ж����ͬ��Ԫ�أ����ҽ���ǲ�ȷ����
		 */
		int[] d = {11, 15, 12, 14, 16};
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.binarySearch(d, 12));
		
		// �ж����������Ƿ���ͬArrays.equals(a, b)
		int[] f = {10, 11, 12, 13, 14};
		int[] e = {10, 11, 12, 13, 15};
		int[] g = {10, 11, 12, 13, 14};
		System.out.println(Arrays.equals(f, e));
		System.out.println(Arrays.equals(f, g));
		
		// �������Arrays.fill();
		int[] h = new int[5];
		Arrays.fill(h, 2);
		System.out.println(Arrays.toString(h));
		
		/*
		 * ���ȶ���һ��5X8�Ķ�ά���飬Ȼ��ʹ�������������� ����Arrays�ķ����Զ�ά�����������
		 */
		int[][] k = new int[5][8];
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				k[i][j] = (int)(Math.random() * 100);
			}
		}
		int[] arr = new int[40];
		for(int i = 0; i < 5; i++) {
			System.arraycopy(k[i], 0, arr, i * 8, 8);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < 5; i++) {
			System.arraycopy(arr, i * 8, k[i], 0, 8);
			System.out.println(Arrays.toString(k[i]));
		}
		
		
	}

}
