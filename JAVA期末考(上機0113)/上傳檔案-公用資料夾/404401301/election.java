
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�A���벼���(1~4)");
		int choose = input.nextInt();
		
		int one = 0 ;//������
		int two = 0 ;//�����^
		int three = 0 ;//������
		int four = 0 ;//�o��
		
		for(int i = 9; i>0;i--){
			
			
				switch(choose){
				
				case 1 : one++;
				break;
				case 2 : two++;
				break;
				case 3 : three++;
				break;
				case 4 : four++;
				

				}
		System.out.println("������`�Τj��A�п�J�A���벼��ܡA�ثe�A�٦� "+i+ "�i�벼");
		System.out.println("�п�J�A���벼���(1~4)");
		choose = input.nextInt();
		
		
		}
		
		
			
			
			System.out.println("(�@).������ " + one++ + "��");
			
			System.out.println("(�G).�����^ " + two++ + "��");
			
		    System.out.println("(�T).������ " + three++ + "��");
			
		    System.out.println("(�|).�o��     " + four++ + "��");
		}
		}
		
		
		
	


