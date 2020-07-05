package day06;

public class Demo3_SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 选择排序法
		/*
		 * 选择法排序的思路： 
		 * 	把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来 比较完后，第一位就是最小的
		 *  然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来 比较完后，第二位就是第二小的
		 */
		// 创建5个随机数的数组
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
		// 冒泡排序
		/*
		 * 冒泡法排序的思路： 第一步：从第一位开始，把相邻两位进行比较 如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
		 * 第二步： 再来一次，只不过不用比较最后一位
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
		 * 总结下精髓： 
		 * 	1、选择法是用i，j比较的。
		 *  2、冒泡法是自身比较，但是要注意外层循环是比较次数，不要和选择法搞混了。【很容易混掉】
		 */
	}

}
