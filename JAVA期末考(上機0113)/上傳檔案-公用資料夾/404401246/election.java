
import java.util.Scanner;
public class election {

	public static void main(String args[]){
		
		
		
		System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦� 10 �i�ﲼ");
		System.out.println("(�@)������");
		System.out.println("(�G)�����^");
		System.out.println("(�T)������");
		System.out.println("(�|)�o��");
		
		
		int num[] = new int[10];
		System.out.println("�ɿ�J�A�����: (��10��)");
		Scanner input = new Scanner(System.in);
		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		for(int i=0;i<num.length; i++){
			num[i] = input.nextInt();
			if(num[i]==1){
				count1++;
			}
			else if(num[i]==2){
				count2++;
			}
			else if(num[i]==3){
				count3++;
			}
			else if(num[i]==4){
				count4++;
			}
		}
		
		
				
		
		System.out.println("�j��έp���G:");
		System.out.println("(�@)������  "+count1+" ��");
		System.out.println("(�G)�����^  "+count2+" ��");
		System.out.println("(�T)������  "+count3+" ��");
		System.out.println("(�|)�o��  "+count4+" ��");
		
	}
}
