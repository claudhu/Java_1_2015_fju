
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double elec[] = new double [10];
		int count =10;
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
		
		for(int i=0;i<10;i++){
			
			System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�z�٦�"+ count +"�i�ﲼ");
			System.out.println("(�@)������");
			System.out.println("(�G)�����^");
			System.out.println("(�T)������");
			System.out.println("(�|)�o��");
			
			elec[i]=input.nextDouble();
			count--;
			if(elec[i]==1){
				t1 += 1;
			}
			else if (elec[i]==2){
				t2 += 1;
			}
			else if(elec[i]==3){
				t3 += 1;
			}
			else 
				t4 += 1;
			
			
		}
	
		
		System.out.println("�j�ﵲ�G�έp:");
		System.out.println("(�@)������"+t1);
		System.out.println("(�G)�����^"+t2);
		System.out.println("(�T)������"+t3);
		System.out.println("(�|)�o��"+t4);
		
	}
	
	
	

}
