package day07;

public class Demo3_HeavyLoadObject {

	public static void main(String[] args) {
		// ����������ָ���Ƿ�����һ�������ǲ������Ͳ�һ��
		ADHero ah = new ADHero();
		ah.name = "�ͽ�����";
		Hero h1 = new Hero();
		h1.name = "����";
		Hero h2 = new Hero();
		h2.name = "��Ī";
		ah.attack();
		ah.attack(h1);
		ah.attack(h1, h2);
		
		Support su = new Support();
		su.name = "��Ů";
		su.heal();
		su.heal(h1);
		su.heal(h1, h2);
		
	}

}

class ADHero extends Hero {
	public void attack() {
		System.out.println(name + "������һ�ι��� �����ǲ�ȷ������˭��");
	}
//	public void attack(Hero h1) {
//		System.out.println(name + "��" + h1.name + "������һ�ι��� ");
//	}
//	public void attack(Hero h1, Hero h2) {
//		System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
//	}
	// �����أ����в��ÿɱ������Ĳ���
	public void attack(Hero...heros) {
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name + " ������ " + heros[i].name);
		}
	}
}


class Support extends Hero {
	public void heal() {
		System.out.println(name + "Ϊ���Ѽ�Ѫ");
	}
	public void heal(Hero...heros) {
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name + "Ϊ" + heros[i].name + "��Ѫ");
		}
	}
}
