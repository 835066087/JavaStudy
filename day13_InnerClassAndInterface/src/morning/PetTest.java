package morning;

public class PetTest {

	public static void main(String[] args) {
		Pet[] arrPet = new Pet[6];

		Pet b1 = new Bird("小飞", 2, 1, 30);
		Pet b2 = new Bird("小飞秃", 3, 2, 50);
		Pet c1 = new Cat("小喵", 5, 7, "绿色");
		Pet c2 = new Cat("小喵秃", 1, 8, "蓝色");
		Pet d1 = new Dog("小汪", 3, 10, "拉布拉多");
		Pet d2 = new Dog("小飞", 2, 13, "哈士奇");

		arrPet[0] = b1;
		arrPet[1] = b2;
		arrPet[2] = c1;
		arrPet[3] = c2;
		arrPet[4] = d1;
		arrPet[5] = d2;

		for (int i = 0; i < arrPet.length - 1; i++) {//-1是为了防止溢出，因为下面有J+1
			for (int j = 0; j < arrPet.length - 1 - i; j++) {//i是为了简化运算，实际上不加也可以
				if (arrPet[j].getWeight() < arrPet[j + 1].getWeight()) {
					Pet tmp = arrPet[j];
					arrPet[j] = arrPet[j + 1];
					arrPet[j + 1] = tmp;
				}
			}
		}
		for (Pet n : arrPet) {
			System.out.println(n.toString());
		}
	}
}
