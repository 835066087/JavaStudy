package interfacetest;

public class DeviceTest {

	public static void main(String[] args) {
		Device d1 = new Mouse("华硕");

		d1.startup();
		d1.shutdown();

		System.out.println("*************************");

		USB d2 = new Mouse();

		d2.connect();
		d2.disconnect();
		d2.work();
		System.out.println("*************************");

		Mouse d3 = new Mouse( "联想");

		d3.shutdown();
		d3.connect();
		d3.disconnect();
		d3.startup();
		d3.work();
		System.out.println("*************************");
		
		
		Mouse d4 =(Mouse)d1;
		d4.connect();
		d4.disconnect();
		d4.work();
		

	}
}
