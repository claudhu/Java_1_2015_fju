import java.util.Scanner;
public class OneTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�һݪ����N�X:");
		int x = input.nextInt();
		System.out.print("�п�J�һݪ����ƶq:");
		int y = input.nextInt();
		int t1=3000;
		int t2=2500;
		int t3=2000;
		int t4=1000;
		int t5=500;
		if(x==1)
			System.out.print("�`���B:"+y*t1);
		else if(x==2)
			System.out.print("�`���B:"+y*t2);
		else if(x==3)
			System.out.print("�`���B:"+y*t3);
		else if(x==4)
			System.out.print("�`���B:"+y*t4);
		else if(x==5)
			System.out.print("�`���B:"+y*t5);
			
		
		
		

	}

}
