
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		for(int i = 1 ; i <=10 ; i++){
		System.out.println("������`�Τj��A�i�H��Q�i���A�п�J�A���벼��ܡA�ثe�A��F�� " + i + " �i�ﲼ ");
		System.out.println("(�@)�B ������");
		System.out.println("(�G)�B�����^");
		System.out.println("(�T)�B������");
		System.out.println("(�|)�B�o��");
		
		int vote = sc.nextInt();
		
		
		switch(vote){
		
		case 1 : System.out.println("�A��F�����ۤ@��");break;
		case 2 : System.out.println("�A��F�����^�@��");break;
		case 3 : System.out.println("�A��F�������@��");break;
		case 4 : System.out.println("�A��F�o���@��");break;
		}
		System.out.println("�j�ﵲ�G�έp: ");
		System.out.println("(�@)�B ������ "+ vote + " ��");
		System.out.println("(�G)�B�����^ "+ vote + " ��");
		System.out.println("(�T)�B������ "+ vote + " ��");
		System.out.println("(�|)�B�o�� "+ vote + " ��");
	}

}
}