
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    
	    int []b= new int[4];
		for(int c=10;c>0;c--){
			System.out.println("���إ����`�Τj��A�п�J"
					+ "�A���벼��ܡA�ثe�A�٦�"+c+"�i�ﲼ");
			System.out.println("1.������");
			System.out.println("2.�����^");
			System.out.println("3.������");
			System.out.println("4.�o��");
					
			int a=input.nextInt();
		
		switch(a){
		
		case 1 : b[0]+=1;
        break;
		case 2 : b[1]+=1;
		break;
		case 3 : b[2]+=1;
		break;
		
		case 4 : b[3]+=1;
		break;
		
				
	}
		}
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("1.������"+b[0]+"��");
		System.out.println("2.�����^"+b[1]+"��");
		System.out.println("3.������"+b[2]+"��");
		System.out.println("4.�o��"+b[3]+"��");
	}
}
