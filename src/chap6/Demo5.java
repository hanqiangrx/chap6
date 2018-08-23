package chap6;

interface Usb{
	
	String name = "abc";
	
	void a();
}

interface Usb2{
	
}

class UsbDisk implements Usb,Usb2{

	@Override
	public void a() {
		
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
		UsbDisk disk = new UsbDisk();
	}
}
