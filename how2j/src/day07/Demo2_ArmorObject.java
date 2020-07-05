package day07;

public class Demo2_ArmorObject extends Item{
	int armorClass;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2_ArmorObject armor1 = new Demo2_ArmorObject();
		armor1.name = "布甲";
		armor1.price = 300;
		armor1.armorClass = 15;
		Demo2_ArmorObject armor2 = new Demo2_ArmorObject();
		armor2.name = "锁子甲";
		armor2.price = 500;
		armor2.armorClass = 40;
		 System.out.println("名称:"+ armor1.name +",价格:"+ armor1.price +",护甲等级:"+ armor1.armorClass);
		 System.out.println("名称:"+ armor2.name +",价格:"+ armor2.price +",护甲等级:"+ armor2.armorClass);
	}

}
