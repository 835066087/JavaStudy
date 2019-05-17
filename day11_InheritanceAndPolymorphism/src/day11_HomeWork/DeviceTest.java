package day11_HomeWork;

public class DeviceTest {

	public static void main(String[] args) {

		// 到60行前都是随机产生7个不同种类的产品的操作，真正的有关于父类与子类的操作在60行分割线以后

		Device[] arr = new Device[7];
		// 随机起名，分配厂商名和颜色,和速度
		// 创建数组
		String[] factory1 = { "惠普", "联想", "英特尔", "微软", "骁龙", "高通", "华为", "小米" };
		String[] name1 = { "机器名好难写的啊但是没事", "我真的不知道机器名该叫啥", "没关系就让我们去随机产生", "随到什么就叫什么愉快开心", "这样就免去了起名的痛苦啊", "带来了崭新的同长度的人生", "所以随机真好用啊点个赞吧" };
		String[] color1 = { "红色", "黄色", "绿色", "青色", "蓝色", "紫色", "黑色", "白色", "彩色" };

		// 随机产生2台显示器
		for (int i = 0; i < 2; i++) {
			int randIndex1 = (int) (Math.random() * 100) % factory1.length;
			int randIndex2 = (int) (Math.random() * 100) % name1.length;
			int randIndex3 = (int) (Math.random() * 100) % color1.length;
			// 无法控制随机double的小数点，因而转而将价格定义为int型
			int randprice = (int) (Math.random() * 100000);
			int size = (int) (Math.random() * 10 + 10);

			arr[i] = new Monitor(name1[randIndex2], randprice, factory1[randIndex1], size, color1[randIndex3]);
		}

		// 随机产生2个鼠标
		for (int i = 2; i < 4; i++) {
			int randIndex1 = (int) (Math.random() * 100) % factory1.length;
			int randIndex2 = (int) (Math.random() * 100) % name1.length;
			int randprice = (int) (Math.random() * 100000);
			int speed1 = (int) (Math.random() * 200);
			
			// 这里想做一个随机true或false的功能
			boolean flag;
			double jud = Math.random();
			if (jud >= 0.5) {
				flag = true;
			} else {
				flag = false;
			}

			arr[i] = new Mouse(name1[randIndex2], randprice, factory1[randIndex1], speed1, flag);

		}

		// 随机产生3个键盘
		for (int i = 4; i < 7; i++) {
			int randIndex1 = (int) (Math.random() * 100) % factory1.length;
			int randIndex2 = (int) (Math.random() * 100) % name1.length;
			int randprice = (int) (Math.random() * 100000);
			int speed1 = (int) (Math.random() * 200);
			int keycount = (int) (Math.random() * 200);

			arr[i] = new Keyboard(name1[randIndex2], randprice, factory1[randIndex1], speed1, keycount);
		}

		for (Device n : arr) {
			System.out.println(n.showDetail());
		}

		System.out.println("*****************************************************************");

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].getPrice() > arr[j + 1].getPrice()) {
					Device tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		for (Device n : arr) {
			System.out.println(n.showDetail());
		}

	}
}
