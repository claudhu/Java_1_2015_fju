import java.util.Scanner;
public class OneTicket {

	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int sum =0;
		
		System.out.print("�п�J�����N�X: ");
		int kind = input.nextInt();
		
		System.out.print("�X�i? : ");
		int num = input.nextInt();
		
		if(kind == 1){
			sum = num*3000;
			System.out.print("�`���B��: "+sum);
		}
		else if(kind == 2){
			sum = num*2500;
			System.out.print("�`���B��: "+sum);
		}
		else if(kind == 3){
			sum = num*2000;
			System.out.print("�`���B��: "+sum);
		}
		else if(kind == 4){
			sum = num*1000;
			System.out.print("�`���B��: "+sum);
		}
		else if(kind == 5){
			sum = num*500;
			System.out.print("�`���B��: "+sum);
		}
		
		
	}
}
