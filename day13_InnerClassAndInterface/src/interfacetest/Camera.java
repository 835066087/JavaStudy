package interfacetest;

public class Camera implements USB {

	private String factory;

	public Camera() {
		super();
	}

	public Camera(String factory) {
		super();
		this.factory = factory;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	@Override
	public void connect() {
		System.out.println("相机已连接");

	}

	@Override
	public void work() {
		System.out.println("相机正在工作");

	}

	@Override
	public void disconnect() {
		System.out.println("无可用相机");

	}

}
