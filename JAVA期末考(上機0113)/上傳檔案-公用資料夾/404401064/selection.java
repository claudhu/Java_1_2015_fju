
import java.util.Scanner;
public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("���إ����`�Τj��,�п�J�A���벼���,�ثe�A�٦��i�ﲼ");
		System.out.println("�]�@�^���߭�" + "\n" + "�]�G�^���^��" + "\n" + "�]�T�^������" + "\n" + "�]�|�^�o��");
		
		int number;
		number = input.nextInt();
		switch(number){
		case 1 : {
			     int total = 10;
			     int number1 ;
			     int number2 ;
			     int number3 ;
			     number1 = 1;number2 = 0;number3 = 0;total = 9;
			      System.out.print("�]�@�^���߭�"+number1+"��" + "\n" + 
		                           "�]�G�^���^��"+number2+"��" + "\n" + 
				                   "�]�T�^������"+number3+"��" + "\n" + 
		                           "�]�|�^�o��");
			      System.out.println("���إ����`�Τj��,�п�J�A���벼���,�ثe�A�٦��i"+total+"�ﲼ");break;
		}
		case 2:{
			 int total = 10;
		     int number1 ;
		     int number2 ;
		     int number3 ;
		     number1 = 0;number2 = 1;number3 = 0;total = 9;
		      System.out.print("�]�@�^���߭�"+number1+"��" + "\n" + 
	                           "�]�G�^���^��"+number2+"��" + "\n" + 
			                   "�]�T�^������"+number3+"��" + "\n" + 
	                           "�]�|�^�o��");
		      System.out.println("���إ����`�Τj��,�п�J�A���벼���,�ثe�A�٦��i"+total+"�ﲼ");break;
			
		}
		case 3:{
			int total = 10;
		     int number1 ;
		     int number2 ;
		     int number3 ;
		     number1 = 0;number2 = 0;number3 = 1;total = 9;
		      System.out.print("�]�@�^���߭�"+number1+"��" + "\n" + 
	                           "�]�G�^���^��"+number2+"��" + "\n" + 
			                   "�]�T�^������"+number3+"��" + "\n" + 
	                           "�]�|�^�o��");
		      System.out.println("���إ����`�Τj��,�п�J�A���벼���,�ثe�A�٦��i"+total+"�ﲼ");break;
		}
		case 4:{
		      System.out.println("byebye");break;
		}
		default:System.out.println("�Э��s���");
		
		}	

	}

}
