

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 10;
		
        System.out.println("(�@)������");
		
		System.out.println("(�G)�����^");
		
		System.out.println("(�T)������");
		
		System.out.println("(�|)�o��");
		
		
		for(;;){
			
			int k1 = 0;
			int k2 = 0;
			int k3 = 0;
			int k4 = 0;
		
		                                    
		System.out.println("���إ����`�Τj��A�п�J�A���벼��ܡA�ثe�٦�"+count+"�i���: ");
		
		int n=input.nextInt();
		
		switch (n) {
		
			case 1: k1++; count--;
			break;
			
			case 2: k2++; count--;
			break;
			
			case 3: k3++; count--;
			break;
			
			case 4: k4++; count--;
			
			
			default:
			
			System.out.printf("��J����: \n");
		}
		if(count==0){
			System.out.println("�j��έp���G");
			System.out.printf("(�@)������     \n"+"(�G)�����^    \n"+"(�T)������     \n"+"(�|)�o��    \n",k1,k2,k3,k4);
			break;
		}
	
		
		}	
	
		
	}
	}



