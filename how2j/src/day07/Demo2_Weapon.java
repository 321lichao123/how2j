package day07;

public class Demo2_Weapon extends Item {
	int damage;		// ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2_Weapon infinityEdge = new Demo2_Weapon();
		infinityEdge.name = "�޾�֮��";
		infinityEdge.price = 3600;
		infinityEdge.damage = 65;
		System.out.println(infinityEdge.name);
		System.out.println(infinityEdge.price);
		System.out.println(infinityEdge.damage);
	}

}
