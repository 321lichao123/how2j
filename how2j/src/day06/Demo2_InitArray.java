package day06;

public class Demo2_InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 分配空间与赋值分布进行
		int[] a = new int[5]; // 分配空间
		a[0] = 100; // 赋值
		a[1] = 200; // 赋值
		a[2] = 300; // 赋值
		a[3] = 400; // 赋值
		a[4] = 500; // 赋值
		// 分配空间同时赋值
		// 第一种写法：
		int[] b = new int[]{100, 110, 120, 130, 140};
		// 第二种写法:
		int[] c = {100, 110, 120, 130, 140};
		// 如果制定了数组的内容，就不能同时设置数组的长度
		// Cannot define dimension expressions when an array initializer is provided
		// int[] d = new int[3]{100, 110, 120};
		// System.out.println(d);
		/*
		 * 首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
		 * 使用for循环或者while循环，对这个数组实现反转效果
		 */
		int[] arr = new int[5];
		arr[0] = (int)(Math.random() * 100);
		arr[1] = (int)(Math.random() * 100);
		arr[2] = (int)(Math.random() * 100);
		arr[3] = (int)(Math.random() * 100);
		arr[4] = (int)(Math.random() * 100);
		// 打印数组的每一项
		for(int i = 0; i < arr.length; i++) {
			System.out.println("数组第" + i + "项的值：" + arr[i]);
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
		// 打印数组的每一项
		for(int j = 0; j < arr.length; j++) {
			System.out.println("数组第" + j + "项的值：" + arr[j]);
		}
	}

}
