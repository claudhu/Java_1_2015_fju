import java.util.Scanner;
public class election {

	public election() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 10;
			System.out.println("���إ����Τj��A�п�J�A���벼��ܡA�ثe�A�ٳ�"+ count+"�i�ﲼ  : "); 
		    System.out.println("(�@)�B ������\n(�G)�B�����^\n(�T)�B������\n(�|)�B�o��"); 
		    
		    Scanner input = new Scanner(System.in);
		    int vote = input.nextInt();
			 switch(vote){case 1 :System.out.println("(�@)�B ������ "+vote) ;break;
			case 2 : System.out.println("(�G)�B�����^");break;
			case 3 : System.out.print("(�T)�B������");break;
			case 4 : System.out.println("(�|)�B�o��");}
	for( count = 10;count<=0;count--){  
		System.out.print("�п�J�A���ﲼ�� : ");
		
		count--;continue;}
			
			}

}
