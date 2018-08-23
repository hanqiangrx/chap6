package chap6;

class Pencil{
	String name;
	public Pencil(String name) {
		this.name = name;
	}
	
	public void write(){
		System.out.println("沙沙的写字.....");
	}
}
interface Eraser{
	void remove();
}

class PencilWithEraser extends Pencil implements Eraser{
	PencilWithEraser(String name){
		super(name);
	}

	@Override
	public void remove() {
		System.out.println("用橡皮修改..");
	}
	
	
}
public class Demo6 {

	public static void main(String[] args) {
		PencilWithEraser pwe = new PencilWithEraser("2B");
		pwe.write();
		pwe.remove();
	}
}
