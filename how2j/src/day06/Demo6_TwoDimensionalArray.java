package day06;

public class Demo6_TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ά����: �����ÿһ��Ԫ�أ�����һ��һά����
		int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int[][] c = new int[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				c[i][j] = (int)(Math.random() * 100);
				System.out.println(c[i][j]);
			}
		}
		// Ĭ�϶�ά����ĵ�һ��c[0][0]λ���ֵ
		int temp = c[0][0];
		int x = 0;
		int y = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (c[i][j] > temp) {
					temp = c[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println("------------");
		System.out.println(temp);
		System.out.println("[" + x + "," + y +"]");
	}

}
