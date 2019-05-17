package myday14_morning;

/*
 * 枚举：对象可以穷举，列举的特殊类
 */
enum TrafficSignal{
	STOP,GO,CAUTION
}

public class EnumTest {
	
	public static void main(String[] args) {
		
		TrafficSignal ts = TrafficSignal.CAUTION;
		System.out.println(ts);
		
		ts = TrafficSignal.valueOf("GO");//根据对象名获取对象
		System.out.println(ts);
		
		TrafficSignal[] values = TrafficSignal.values();
		ts = values[2];
		System.out.println(ts);
		
		switch(ts) {//switch（变量），类型是非long整数，字符串，枚举
			case STOP :
				System.out.println("红灯停");
				break;
			case GO :
				System.out.println("绿灯行");
				break;
				
			case CAUTION :
				System.out.println("黄灯注意");
				break;
		}
	}
}
