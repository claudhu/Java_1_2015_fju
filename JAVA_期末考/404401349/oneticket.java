import java.util.Scanner;


public class oneticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("�п�ܤ@�Ӫ����N�X�μƶq");
		int n=input.nextInt();
		int n2=input.nextInt();
		
		int total=0;
		if(n==1)
		total=n2*3000;
		else if(n==2)
		total=n2*2500;
		
		else if(n==3)
		total=n2*2000;
		
		else if(n==4)
		total=n2*1000;
		
		else if(n==5)
		total=n2*500;
		
		System.out.println("total money="+total);
		input.close();
	}

}
