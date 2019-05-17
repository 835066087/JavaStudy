package myday23_afternoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * 对象流的使用
 * ObjectInputStream和OjbectOutputSteam
   作用：写入、读取基本数据类型，对象。
   
   
   重点，自定义类序列化
   对象的序列化机制
   允许把内存中的Java对象转换成平台无关的二进制流，从而允许把这种二进制流持久地保存在磁盘上，
   或通过网络将这种二进制流传输到另一个网络节点。
   //当其它程序获取了这种二进制流，就可以恢复成原来的Java对象

   
 */
public class ObjectInputOutputStreamTest {
	
	@Test
	public void Test() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
		
		
		oos.writeInt(123);
		oos.flush();
		oos.writeBoolean(true);
		oos.flush();
		oos.writeObject("liming");
		
		//序列化过程
		//
		//
		
		oos.writeObject(new Person(23,"Tom"));
		oos.flush();
		
		oos.close();
		
	}
	
	//反序列化过程：将文件中的数据还原为内存中的java对象，
	//或通过网络方式将传输过来的数据转换为内存中的java对象
	//使用ObjectInputStream类
	
	
	@Test
	public void Test2() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));
		
		int i1  = ois.readInt();
		System.out.println(i1);
		
		boolean b1 = ois.readBoolean();
		System.out.println(b1);
		
		Object o1 = ois.readObject();
		System.out.println(o1);
		
		Person p1 = (Person) ois.readObject();
		System.out.println(p1);
		
		ois.close();
		
	}
	
	class Account{
		int id;

		public Account(int id) {
			super();
			this.id = id;
		}

		@Override
		public String toString() {
			return "Account [id=" + id + "]";
		}
		
		
	}
	
	
}
