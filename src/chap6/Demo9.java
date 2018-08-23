package chap6;

class Fu{
	static int i = 10;
	
	public static void test(){
		System.out.println(i);
	}
}
class Zi extends Fu{
	static int i = 20;
	public static void test(){
		System.out.println(i);
	}
}
public class Demo9 {

	public static void main(String[] args) {
		Fu zi = new Zi();
		zi.test();
	}
}
