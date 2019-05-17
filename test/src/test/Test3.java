package test;

public class Test3 {

	public static void main(String[] args) {
		double money = 100;
		double pPrice = 3;
		double yPrice = 2;
		double qPrice = 0.5;
		int count = 100;
		for (int pen = 1; pen <= money / pPrice; pen++) {
			for (int yuan = 1; yuan <= money / yPrice; yuan++) {
				for (int qian = 1; qian <= money / qPrice; qian++) {
					if (pen + yuan + qian == count && pen * pPrice + yuan * yPrice + qian * qPrice == money) {

						System.out.println("购买" + pen + "支钢笔，" + yuan + "支圆珠" + qian + "支铅笔");
					}

				}
			}
		}
	}
}
