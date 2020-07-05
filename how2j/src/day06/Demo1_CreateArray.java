package day06;

public class Demo1_CreateArray {
	public static void main(String[] args) {
		/*
			int[] a;声明一个数组变量
			[]表示该变量是一个数组
			int表示数组里的每一个元素都是一个整数
			a是变量名
		 */
		// 声明一个变量
		int[] a;
		/*
		 * 创建数组的时候，要指明数组的长度
		 * new int[5]
		 * 引用概念:
		 * 		如果变量代表一个数组，比如a，我们把a叫做引用
		 * a = new int[5]; 表示a这个引用指向数组
		 * */
		a = new int[5];
		// 创建引用
		int[] b = new int[5];
		
		// 访问数组
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[4] = 4;
//		a[5] = 5; // java.lang.ArrayIndexOutOfBoundsException
		/*
		 * .length表示数组的长度
		 * 数组访问下标范围是0到长度-1
		 * 一旦超过这个范围就会产生数组下标越界异常
		 * */
		System.out.println(a.length);
		// 数组最小值
		b[0] = (int)(Math.random() * 100);
		b[1] = (int)(Math.random() * 100);
		b[2] = (int)(Math.random() * 100);
		b[3] = (int)(Math.random() * 100);
		b[4] = (int)(Math.random() * 100);
		// 打印数组的每一项
		for(int i = 0; i < b.length; i++) {
			System.out.println("数组第" + i + "项的值：" + b[i]);
		}
		// 默认数组第一项是最小值
		int temp = b[0];
		// 遍历数组查找最小值
		for(int i = 1; i < b.length; i++) {
			if (b[i] < temp) {
				temp = b[i]; 
			}
		}
		System.out.println("数组的最小值是：" + temp);
	}
}
