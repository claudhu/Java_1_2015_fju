import java.util.Scanner;


public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int keep=-1;
		int all=0;
		while(keep==-1){
			int Ticket;
			System.out.println("�п�J�����N�X : ");
			Ticket=input.nextInt();
			switch(Ticket){
				case 1 : System.out.println("�z�ʶR�������W�٬�VIP");
				break;
				case 2 : System.out.println("�z�ʶR�������W�٬��]�[");
				break;
				case 3 : System.out.println("�z�ʶR�������W�٬��e����");
				break;
				case 4 : System.out.println("�z�ʶR�������W�٬����k��");
				break;
				case 5 : System.out.println("�z�ʶR�������W�٬��̰��Ϯy��");
				break;
			
			}
			System.out.println("�п�J�ʶR�ƶq : ");
		
			int count = input.nextInt();
			int M=0;
			
			if(Ticket==1){
				M = 3000*count;
				all=all+M;
			}
			if(Ticket==2){
				M =2500*count;
				all=all+M;
			}
			if(Ticket==3){
				M =2000*count;
				all=all+M;
			}
			if(Ticket==4){
				M =1000*count;
				all=all+M;
			}
			if(Ticket==5){
				M =500*count;
				all=all+M;
			}
			System.out.println("�p�n�����ʶR�Ы�"+"-1"+"�_�Ы�"+"0" );
			keep = input.nextInt();
			if(keep==0){
				System.out.println("�`���B�� : " + all);
			break;
			}
			if(keep==-1){
			continue;
			}
		}
		
		

	}

}
