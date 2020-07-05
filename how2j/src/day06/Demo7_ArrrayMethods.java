package day06;

import java.util.Arrays;

public class Demo7_ArrrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 数组复制copyOfRange(int[], original, int form, int to);
		// 第一个参数表示源数组
		// 第二参数表示开始位置(取得到)
		// 第三个参数表示结束位置(取不到)
		/*
		 * 与使用System.arraycopy进行数组复制类似的， Arrays提供了一个copyOfRange方法进行数组复制。
		 * 不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。 copyOfRange
		 * 只需要源数组就就可以了，通过返回值，就能够得到目标数组了。 除此之外，需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的
		 */
		int[] a = {10, 11, 12, 13, 14, 15};
		int[] b = Arrays.copyOfRange(a, 0, 3);
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]); // 10, 11, 12
		}
		// 数组转为字符串Arrays.toString();
		System.out.println(Arrays.toString(b));
		
		// 数组排序Arrays.sort();
		int[] c = new int[5];
		for(int i = 0; i < 5; i++) {
			c[i] = (int)(Math.random() * 100);
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		// 搜索Arrays.binarySearch()
		/*
		 * 使用binarySearch进行查找之前，必须使用sort进行排序 如果数组中有多个相同的元素，查找结果是不确定的
		 */
		int[] d = {11, 15, 12, 14, 16};
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.binarySearch(d, 12));
		
		// 判断两个数组是否相同Arrays.equals(a, b)
		int[] f = {10, 11, 12, 13, 14};
		int[] e = {10, 11, 12, 13, 15};
		int[] g = {10, 11, 12, 13, 14};
		System.out.println(Arrays.equals(f, e));
		System.out.println(Arrays.equals(f, g));
		
		// 数组填充Arrays.fill();
		int[] h = new int[5];
		Arrays.fill(h, 2);
		System.out.println(Arrays.toString(h));
		
		/*
		 * 首先定义一个5X8的二维数组，然后使用随机数填充满。 借助Arrays的方法对二维数组进行排序。
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
