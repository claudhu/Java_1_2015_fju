import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int choice [] = new int [4];
		int per = 0;
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�A�٦� " + (10-i) + " �i�ﲼ�C");
			System.out.print("1�B������  \n2�B�����^\n3�B������\n4�B�o��\n�A��]�п�J�Ʀr1-4�^�G");	
			per = input.nextInt();
			
			if(per == 1){
				choice[0]++;
				
			}
			else if(per == 2){
				choice[1]++;
			}
			else if(per == 3){
				choice[2]++;
			}
			else if(per == 4){
				choice[3]++;
			}		
			System.out.println("");
			
		}
		
		System.out.println("�j�ﵲ�G�έp:1�B������ " + choice[0] + " ��");
		System.out.println("�j�ﵲ�G�έp:2�B�����^ " + choice[1] + " ��");
		System.out.println("�j�ﵲ�G�έp:3�B������ " + choice[2] + " ��");
		System.out.println("�j�ﵲ�G�έp:4�B�o�� " + choice[3] + " ��");

		
		
		
	}

}
