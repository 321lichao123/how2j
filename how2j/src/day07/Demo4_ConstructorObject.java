package day07;

public class Demo4_ConstructorObject {

	public static void main(String[] args) {
		// ͨ��һ���ഴ��һ������������̽���ʵ����
		// ʵ������ͨ�����ù��췽��(�ֽ���������)ʵ�ֵ�
		/*	���ֻ�ṩ�вι��캯������ôĬ���޲ι���ͻ�ʧЧ��������޲ι���
		 *  The constructor Hero() is undefined 
		 * */
		Hero h = new Hero();
	}

}

class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	/*
	 * ������������һ����������Сд�� û�з������� ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��,
	 * ����޲εĹ��췽���������д���ͻ�Ĭ���ṩһ���޲εĹ��췽��
	 */
	public Hero() { 
		System.out.println("ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��"); 
	}
	public Hero(String heroname) {
		name = heroname;
	}
	// ���캯��Ҳ�ǿ������ص�
	public Hero(String heroname,float herohp, float heroArmor, int heroMoveSpeed){ 
        name = heroname;
        hp = herohp;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }
}
