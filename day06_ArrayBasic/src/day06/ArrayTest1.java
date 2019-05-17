package day06;
import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
				System.out.println("请输入学生人数");
				int number = scan.nextInt();
				int[] studentScore = new int[number];
				
				
				for(int i = 0; i < studentScore.length;i++){
					System.out.println("请输入学生分数" + " (共" + number +"个) ");	
					studentScore[i] = scan.nextInt();;
				}
				
				int maxScore = 0;
				for(int i = 0; i < number;i++){
					if(maxScore < studentScore[i]){
						maxScore = studentScore[i];
					}
				}System.out.println(maxScore);
					
				for(int i = 0; i < studentScore.length;i++){
					if(studentScore[i] > maxScore - 10){
						System.out.println("student" + i + "\tscore is :" + studentScore[i] + "\tgrade is : A");
					}else if(studentScore[i] > maxScore - 20){
						System.out.println("student" + i + "\tscore is :" + studentScore[i] + "\tgrade is : B");
					}else if(studentScore[i] > maxScore - 30){
						System.out.println("student" + i + "\tscore is :" + studentScore[i] + "\tgrade is : C");
					}else{
						System.out.println("student" + i + "\tscore is :" + studentScore[i] + "\tgrade is : D");
					}
					
					
				}					
					
	}
				
}

