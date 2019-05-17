package myday14_afternoon;
/*
 * 异常即程序在运行时出现的非正常状况，会导致程序的崩溃
 * 两种分类方法
 * 第一种按照程度来分
 * 1） Error : 严重错误，JVM也无法处理
 * 2） Exception ： 一般性错误，通常可以处理的
 * 
 * 第二种按照处理方式来分
 * 1）受检异常（编译时异常） ： 在程序中必须对其进行检查处理的异常-由Exception表示
 * 		Exception及其子类(RuntimeException及其子类除外)
 * 2）非受检异常（运行时异常） ： 在程序中不是必须对其进行处理的异常-由Error表示
 * 		Error及其子类（太严重）
 * 		RuntimeException及其子类（太轻微）
 * 
 * 
 * 异常的堆栈式抛出机制
 * 异常通常以对象的方式出现
 * 
 * 异常对象的生成
 * 由虚拟机自动生成
 * 由开发人员手动创建：Exception exception = new ClassCastException();
 * 
 *
 */
import java.util.Scanner;

public class TestException {
	
	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int n1 = scan.nextInt();
		System.out.println("请输入第二个数字");
		int n2 = scan.nextInt();*/
		
		int n3 = Integer.parseInt(args[0]);
		int n4 = Integer.parseInt(args[1]);
		
		
		/*System.out.println(n1);
		System.out.println(n2);
		System.out.println("********************");
		System.out.println(n1/n2);*/
		
		System.out.println("********************");
		System.out.println(n3/n4);
	}
}
