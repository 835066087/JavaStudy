package morning;

import morning.Frock;

public class FrockTest {

	public static void main(String[] args) {
		System.out.println(Frock.getNextNum());
		System.out.println(Frock.getNextNum());
		
		Frock fro1 = new Frock("大号","绿色",100);
		Frock fro2 = new Frock("大号","绿色",100);
		Frock fro3 = new Frock("大号","绿色",100);
		
		System.out.println(fro1);
		System.out.println(fro2);
		System.out.println(fro3);
	}

}
