


import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int person1 = 0;
		int person2 = 0;
		int person3 = 0;
		int person4 = 0;
		for(int i =10;i>=1;i--)
		{
			System.out.printf("��������`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�%d�i�ﲼ\n",i);
			System.out.println("(�@)�B������");
			System.out.println("(�G)�B�����^");
			System.out.println("(�T)�B������");
			System.out.println("(�|)�B�o��");					

			int a =input.nextInt();
			switch(a)
			{
			case 1:
				person1++;
				break;
			case 2:
				person2++;
				break;
			case 3:
				person3++;
				break;
			case 4:
				person4++;
				break;
			default:
					break;
				
			}
		}
		
		System.out.println("�j�ﵲ�G�έp");
		System.out.println("(�@)�B������"+person1+"��");
		System.out.println("(�G)�B�����^"+person2+"��");
		System.out.println("(�T)�B������"+person3+"��");
		System.out.println("(�|)�B�o��"+person4+"��");					


			
	}

}
