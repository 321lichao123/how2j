package day07;

public class Demo1_QuoteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h1 = new Hero(); // ������ʹ�ñ���h����
		System.out.println(h1);
		Hero h2 = h1;
		Hero h3 = h1;
		// ������ͬһ����������ͬ�����ûᵼ�´����µ����ã�֮ǰ�� ������
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
