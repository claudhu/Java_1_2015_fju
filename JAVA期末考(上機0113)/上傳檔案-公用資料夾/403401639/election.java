
import java.util.*;
public class election {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1=0,num2=0,num3=0,num4=0;
		System.out.printf("���إ����`�Τj��A�п�J�A���벼��ܡA\n(�@)�B������\n(�G)�B�����^\n(�T)�B������\n(�|)�B�o��\n");
		for(int i=0; i<10; i++){
		System.out.printf("�ثe�z�٦�%d�i�ﲼ\n",10-i);
		int a = input.nextInt();
		switch(a){
		case 1:num1++;break;
		case 2:num2++;break;
		case 3:num3++;break;
		default: num4++;break;
		}
     }
		System.out.printf("(�@)�B������%d��\n(�G)�B�����^%d��\n(�T)�B������%d��\n(�|)�B�o��%d��",num1,num2,num3,num4);

}
}