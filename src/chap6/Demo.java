package chap6;

// 3修饰类表示类不能被继承
final class Test{
	// 2 修饰方法不能被重写
	public final void test2(){
		System.out.println("test2");
	}
}
public class Demo{

	// 1 变量
	public final static double pi;
	
	static{
		pi = 3.14;
	}
	
	public static void main(String[] args) {
		
		final Demo demo = new Demo();
		//demo = new Demo();
		
		// System.out.println(10 * Demo.pi * 10);
		test(demo);
		
	}
	
	public static void test(Demo demo){
		demo = new Demo();
	}
	
/*	public void test2(){
		System.out.println("test2");
	}*/
}
