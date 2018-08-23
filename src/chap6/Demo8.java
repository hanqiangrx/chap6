package chap6;


class Master{
	
	String name;
	
	int money;
	
	public Master(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public void feed(Pet dog){
		dog.eat();
	}
	
	
/*	public void feed(Dog dog){
		dog.eat();
	}
	public void feed(Penguin penguin){
		penguin.eat();
	}*/
}
abstract class Pet{
	String name;
	int health = 100;
	int love = 0;
	
	Pet(String name){
		this.name = name;
	}
	abstract void eat();
	
}

class Dog extends Pet{
	String type;
	Dog(String name,String type){
		super(name);
	}
	@Override
	void eat() {
		System.out.println(name + "快乐的啃骨头。。。。");
	}
	
	public void catchFlyDisk(){
		System.out.println(name + "接飞碟.....");
	}
}
class Penguin extends Pet{
	String sex;
	public Penguin(String name,String sex) {
		super(name);
		this.sex = sex;
	}
	@Override
	void eat() {
		System.out.println(name + "在吃鱼.....");
	}
	
	public void swimming(){
		System.out.println(name + "快乐的游泳....");
	}
	
}

public class Demo8 {

	public static void main(String[] args) {
		Dog dog = new Dog("旺财", "拉不拉多");
		
		Penguin penguin = new Penguin("小白", "Q仔");
		
		Master m = new Master("成龙", 100);
		
		m.feed(dog);
		m.feed(penguin);
	}
}
