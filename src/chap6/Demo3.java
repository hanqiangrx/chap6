/*package chap6;

abstract class Animal{
	String name;
	String color;
	
	public Animal(String name,String color) {
		this.name = name;
		this.color = color;
	}
	
	public abstract void run();
	public void run(){
		System.out.println("用四条腿在移动。。。。");
	}
}

class Dog extends Animal{
	
	public Dog(String name,String color){
		super(name,color);
	}

	@Override
	public void run() {
		System.out.println(name + "飞快的跑");
	}
}
class Fish extends Animal{
	
	public Fish(String name,String color){
		super(name,color);
	}

	@Override
	public void run() {
		System.out.println(name + "用尾巴飞快的游");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("旺财", "黄色");
		dog.run();
		Fish fish= new Fish("swim", "金色");
		fish.run();
	}
}
*/