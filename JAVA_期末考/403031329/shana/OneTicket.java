
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�п�J�����N�X ");
		int number=input.nextInt();
		
		switch(number){
		case 1:{
			System.out.println("�п�J�ƶq: ");
			int number1=input.nextInt();
			int total=number1*3000;
			System.out.println(total);
		}
		case 2:{
			System.out.println("�п�J�ƶq: ");
			int number2=input.nextInt();
			int total=number2*2500;
			System.out.println(total);
		}
		case 3:{
			System.out.println("�п�J�ƶq: ");
			int number3=input.nextInt();
			int total=number3*2000;
			System.out.println(total);
		}
		case 4:{
			System.out.println("�п�J�ƶq: ");
			int number4=input.nextInt();
			int total=number4*1000;
			System.out.println(total);
		}
		case 5:{
			System.out.println("�п�J�ƶq: ");
			int number5=input.nextInt();
			int total=number5*500;
			System.out.println(total);
		}
		}
		

	}

}
