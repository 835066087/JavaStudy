package myday21_homework;

import java.util.ArrayList;
import java.util.List;

public class DAOTest {

	public static <T> void main(String[] args) {
		String name;
		int age;
		User user[] = new User[5];

		String[] name1 = { "李", "王", "赵", "钱", "周", "吴", "郑", "王" };
		String[] name2 = { "维", "强", "林", "苞", "明", "闵", "旻", "雯" };

		// 随机创建对象5个，前4个用来添加，第5个用来测试替换功能
		for (int i = 0; i < user.length; i++) {
			int randIndex1 = (int) (Math.random() * 100) % name1.length;
			int randIndex2 = (int) (Math.random() * 100) % name2.length;
			name = name1[randIndex1] + name2[randIndex2];
			age = (int) (Math.random() * 100 + 1);

			user[i] = new User(i + 1, age, name);
		}

		DAO<User> dao = new DAO<>();
		
		//添加功能测试
		System.out.println("添加功能测试");
		
		dao.save("A", user[0]);
		dao.save("B", user[1]);
		dao.save("C", user[2]);
		dao.save("D", user[3]);
		
		System.out.println(dao.toString());
		
		System.out.println("添加功能测试结束");
		System.out.println();
		
		
		//获取id对应对象测试
		System.out.println("获取对象测试");
		
		System.out.println(dao.get("A"));
		
		System.out.println("获取对象结束");
		System.out.println();
		
		
		//替换内容测试
		System.out.println("替换内容测试");
		
		System.out.println(dao.get("B"));
		try {
			dao.update("B",user[4]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(dao.get("B"));
		
		System.out.println("替换内容测试结束");
		System.out.println();
		
		
		//返回map中的value值到集合
		System.out.println("返回T对象测试");
		List<T> list = new ArrayList<>();
		list = (List<T>) dao.list();
		System.out.println(list.toString());
		
		System.out.println("返回T对象测试结束");
		System.out.println();

		//删除功能测试
		System.out.println("删除功能测试");
		
		dao.delete("A");
		System.out.println(dao.toString());
		System.out.println("删除功能测试结束");
		
		
	}
}
