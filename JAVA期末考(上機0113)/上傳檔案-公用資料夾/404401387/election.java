import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��J1��(�@)������ ��J2��(�G)�����^ ��J3��(�T)������ ");
		int i =10;
		int u1=0,u2=0,u3=0,u4=0;
		for(i=10;i>0;i--)
		{
		System.out.print("�A��"+i+"�i�ﲼ"+" �п�J�벼��H:");
		int u = input.nextInt();
		switch (u)
		{
		case 1:u1++;break;
		case 2:u2++;break;
		case 3:u3++;break;
		default:u4++;break;
		} 
		if(i==1){
			System.out.println("�j�ﵲ�G�έp:");
			System.out.println("(�@)������"+u1+"��");
			System.out.println("(�G)�����^"+u2+"��");
			System.out.println("(�T)������"+u3+"��");
			System.out.println("(�|)�o��"+u4+"��");
			}
		}


	}

}
