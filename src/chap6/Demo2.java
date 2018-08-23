package chap6;

class Person{
	String name = "名字";
	public void test(){
		String name = "老鼠";
		System.out.println(this.name);
		//System.out.println(this);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Person p = new Person();
		p.test();
		//System.out.println(p);
	}
}
