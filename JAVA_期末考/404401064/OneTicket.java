
import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�����N�X: ");
		int number = input.nextInt();
		
		switch(number){
		case 1:{
			System.out.print("�п�J�ƶq:");
			int i = input.nextInt();
			int total = i*3000;
			System.out.print("�`���B:" + total);break;
		
		}
		case 2:{
			System.out.print("�п�J�ƶq:");
			int i = input.nextInt();
			int total = i*2500;
			System.out.print("�`���B:" + total);break;
		}
		case 3:{
			System.out.print("�п�J�ƶq:");
			int i = input.nextInt();
			int total = i*2000;
			System.out.print("�`���B:" + total);break;
		}
		case 4:{
			System.out.print("�п�J�ƶq:");
			int i = input.nextInt();
			int total = i*1000;
			System.out.print("�`���B:" + total);break;
		}
		case 5:{
			System.out.print("�п�J�ƶq:");
			int i = input.nextInt();
			int total = i*500;
			System.out.print("�`���B:" + total);break;
		}
		default:System.out.print("�Э��s��J:");
		}
			
				
				
			}
		
		
}
		
		
		

	



