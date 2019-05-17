package myday18_afternoon;

/*
 * 不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，形成线程死锁
 * 
 * 说明：避免出现死锁
 */



public class DeadLocked {
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		
		new Thread() {
			public void run() {
				
				synchronized(s1) {
					s1.append("a");
					s2.append("1");
					
					synchronized(s2) {
						s1.append("b");
						s2.append("2");
					}
				}
			}
		}.start();
		
		
	}
}
