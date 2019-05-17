package interfacetest;

public class Mouse extends Device implements USB {

	public Mouse() {
		super();
	}

	public Mouse( String name) {
		super(name);
	}

	@Override
	public void connect() {
		System.out.println("鼠标已连接");
		
	}

	@Override
	public void work() {
		System.out.println("鼠标正在运行");
		
	}

	@Override
	public void disconnect() {
		System.out.println("鼠标未连接");
		
	}

	@Override
	public void startup() {
		System.out.println("鼠标已开启");
		
	}

	@Override
	public void shutdown() {
		System.out.println("鼠标已关闭");
		
	}

	
}
