import java.util.Scanner;

public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("�п�J�����N�X : ");
		int Ticket=input.nextInt();
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
		if(Ticket==1){
			System.out.println("�`���B�� : "+ 3000*count);
		}
		if(Ticket==2){
			System.out.println("�`���B�� : "+ 2500*count);
		}
		if(Ticket==3){
			System.out.println("�`���B�� : "+ 2000*count);
		}
		if(Ticket==4){
			System.out.println("�`���B�� : "+ 1000*count);
		}
		if(Ticket==5){
			System.out.println("�`���B�� : "+ 500*count);
		}

	}

}
