package day07;

public class Demo1_QuoteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero(); // 创建并使用变量h引用
		System.out.println(h1);
		Hero h2 = h1;
		Hero h3 = h1;
		// 当对于同一个变量赋相同的引用会导致创建新的引用，之前的 覆盖了
		h1 = new Hero();
		System.out.println(h1);
		System.out.println(h2);
	}
}

class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
}
