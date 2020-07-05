package day07;

public class Demo4_ConstructorObject {

	public static void main(String[] args) {
		// 通过一个类创建一个对象，这个过程叫做实例化
		// 实例化是通过调用构造方法(又叫做构造器)实现的
		/*	如果只提供有参构造函数，那么默认无参构造就会失效必须加上无参构造
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
	 * 方法名和类名一样（包括大小写） 没有返回类型 实例化一个对象的时候，必然调用构造方法,
	 * 这个无参的构造方法，如果不写，就会默认提供一个无参的构造方法
	 */
	public Hero() { 
		System.out.println("实例化一个对象的时候，必然调用构造方法"); 
	}
	public Hero(String heroname) {
		name = heroname;
	}
	// 构造函数也是可以重载的
	public Hero(String heroname,float herohp, float heroArmor, int heroMoveSpeed){ 
        name = heroname;
        hp = herohp;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }
}
