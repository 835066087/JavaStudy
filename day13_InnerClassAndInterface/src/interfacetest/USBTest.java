package interfacetest;

public class USBTest {
	
	public static void main(String[] args) {
		
		USB u1 = new Udisk(32);
		Udisk u2 = new Udisk(32);
		USB c1 = new Camera("索尼");
		Camera c2 = new Camera("松下");
		
		u1.connect();
		u2.connect();
		c1.connect();
		c2.connect();
		
	}
	
	
}
