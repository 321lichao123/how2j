package day07;

public class Demo2_ArmorObject extends Item{
	int armorClass;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2_ArmorObject armor1 = new Demo2_ArmorObject();
		armor1.name = "����";
		armor1.price = 300;
		armor1.armorClass = 15;
		Demo2_ArmorObject armor2 = new Demo2_ArmorObject();
		armor2.name = "���Ӽ�";
		armor2.price = 500;
		armor2.armorClass = 40;
		 System.out.println("����:"+ armor1.name +",�۸�:"+ armor1.price +",���׵ȼ�:"+ armor1.armorClass);
		 System.out.println("����:"+ armor2.name +",�۸�:"+ armor2.price +",���׵ȼ�:"+ armor2.armorClass);
	}

}
