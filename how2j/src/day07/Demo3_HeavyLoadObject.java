package day07;

public class Demo3_HeavyLoadObject {

	public static void main(String[] args) {
		// 方法的重载指的是方法名一样，但是参数类型不一样
		ADHero ah = new ADHero();
		ah.name = "赏金猎人";
		Hero h1 = new Hero();
		h1.name = "盖伦";
		Hero h2 = new Hero();
		h2.name = "提莫";
		ah.attack();
		ah.attack(h1);
		ah.attack(h1, h2);
		
		Support su = new Support();
		su.name = "琴女";
		su.heal();
		su.heal(h1);
		su.heal(h1, h2);
		
	}

}

class ADHero extends Hero {
	public void attack() {
		System.out.println(name + "进行了一次攻击 ，但是不确定打中谁了");
	}
//	public void attack(Hero h1) {
//		System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
//	}
//	public void attack(Hero h1, Hero h2) {
//		System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
//	}
	// 当重载，可有采用可变数量的参数
	public void attack(Hero...heros) {
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name + " 攻击了 " + heros[i].name);
		}
	}
}


class Support extends Hero {
	public void heal() {
		System.out.println(name + "为队友加血");
	}
	public void heal(Hero...heros) {
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name + "为" + heros[i].name + "加血");
		}
	}
}
