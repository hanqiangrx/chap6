package chap6;

class Baby{
	
	String name;
	String id;
	
	Baby(){
		System.out.println("黑户");
	}
	
	Baby(String name){
		this.name = name;
		System.out.println("一个参数构造方法");
	}
	
	Baby(String name,String id){
		this(name);
		this.id = id;
		System.out.println("两个参数构造方法");
	}
	
	public void cry(){
		System.out.println(name + "在哇哇的哭");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		
/*		Baby baby = new Baby();
		baby.name = "张三";
		baby.id = "110";
		baby.cry();*/
		 
		Baby b2 = new Baby("李四", "111");
		
		b2.cry();
		
	}
}
