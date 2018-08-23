package chap6;

/*
 * 形状、圆形、矩形
 * 面积和周长
 */
abstract class Shape{
	String name;
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract void getArea();
	
	public abstract void getLength();
}

class Circle extends Shape{
	double r;
	public final static double PI = 3.1415926;
	public Circle(String name,double r) {
		super(name);
		this.r = r;
	}
	@Override
	public void getArea() {
		System.out.println(name+"面积为:" + PI * r * r);
	}
	@Override
	public void getLength() {
		System.out.println(name + "周长:" + 2 * PI * r);
	}
}
class Rect extends Shape{
	int width;
	int height;
	public Rect(String name,int width,int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	@Override
	public void getArea() {
		System.out.println(name+"面积为:" + width * height);
		
	}
	@Override
	public void getLength() {
		System.out.println(name + "周长:" + 2 * (width + height));
		
	}
}
public class Demo4 {

	public static void main(String[] args) {
		Circle c = new Circle("园", 10);
		c.getArea();
		c.getLength();
		
		Rect r = new Rect("矩形", 10, 20);
		r.getArea();
		r.getLength();
	}
}
