
import java.util.Scanner;
public class multi_dim {

	public static void main(String args[]){
		
		
		System.out.println("         ���        �ƾ�       ");
		System.out.println("��     78   100 ");
		System.out.println("�A     59   80  ");
		System.out.println("��     90   70  ");
		System.out.println("�B     65   120 ");
		System.out.println();
	
		
		int list[][] = {
				{78,100},{59,80},{90,70},{65,120} };
		
		num1(list);
		num2(list);	
		num3(list);
		//89+69.5+80+92.5
	}
	
	public static void num1(int list[][]){
		System.out.print("1. ����������: ");
		int sum=0;
		int average = sum/2;
		
		sum = list[2][0]+list[2][1];
		average = sum/2;
		System.out.print(average);
		System.out.println();
	
	}
	
	public static void num2(int list[][]){
		System.out.print("2. ��妨�Z������: ");
		int sum=0;
		double average=0;
		
		for(int i=0; i<list.length; i++){
			sum += list[i][0];
		}
		average = sum/list.length;
		System.out.print(average);
		System.out.println();
	}
	
	public static void num3(int list[][]){
		
		System.out.print("3. ���Z����������: ");
		double a1 = (list[0][0]+list[0][1])/2;
		double a2 = (list[1][0]+list[1][1])/2;
		double a3 = (list[2][0]+list[2][1])/2;
		double a4 = (list[3][0]+list[3][1])/2;
		
		double average = (a1+a2+a3+a4)/4;
		System.out.print(average);
		
	}
	
	

}
