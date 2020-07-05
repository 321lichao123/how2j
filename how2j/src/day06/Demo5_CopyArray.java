package day06;

public class Demo5_CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 数组赋值
		int[] a = {100, 200, 300, 400, 500};
		int[] b = new int[3];
		// 第一种方式
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
		// 第二种通过System.arraycopy(src, srcPos, destPos, length)
		// src: 源数组
		// srcPos: 从源数组复制数据的起始位置
		// dest: 目标数组
		// destPos: 复制到目标数组的起始位置
		// length: 复制的长度
		int[] c = new int[3];
		System.arraycopy(a, 0, c, 0, 3);
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("------------");
		// 合并数组
		int[] d = {24, 49, 23, 28, 26};
		int[] e = {76, 45, 32, 56, 78};
		int[] f = new int[d.length + e.length];
		System.arraycopy(d, 0, f, 0, d.length);
		System.arraycopy(e, 0, f, d.length, e.length);
		for(int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
	}

}
