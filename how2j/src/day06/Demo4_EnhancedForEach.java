package day06;

public class Demo4_EnhancedForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 增强型for循环
		// 增强型for循环只能用来取值，却不能用来修改数组里的值
		int[] arr = {18,62,68,82,65,9};
		for (int value : arr) {  // 这里的value就是每一项
			System.out.println(value);
		}
		// 用增强型for循环找出最大的那个数
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
		System.out.println("数组最大的值:" + maxValue);
		System.out.println("数组最小的值:" + minValue);
	}

}
