
import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�����N�X�@(vip)�z�n���i��");
		int n1= input.nextInt();
		System.out.println("�п�J�����N�X�G(�]�[)�z�n���i��");
		int n2= input.nextInt();
		System.out.println("�п�J�����N�X�T(�e����)�z�n���i��");
		int n3= input.nextInt();
		System.out.println("�п�J�����N�X�|(���k��)�z�n���i��");
		int n4= input.nextInt();
		System.out.println("�п�J�����N�X��(�̰��Ϯy��)�z�n���i��");
		int n5= input.nextInt();
		
		int price = ((3000*n1)+(2500*n2)+(2000*n3)+(1000*n4)+(500*n5));
		System.out.println("�z�ʶR"+n1+"�i���g�N�X���@������  "+n2+"�i���g�N�X���G������ "+n3+"�i���g�N�X���T������ "+n4+"�i���g�N�X���|������ "+n5+"�i���g�N�X����������");
		System.out.println("�`���B��:"+price);
	

	}

}
