

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�@�ӳ���A�˴���O�_���^��?");
		String a = input.nextLine();
		
		int low = 0;
		int high = a.length()-1;
		
		for(int i = 0;i<a.length();i++){
			if(a.charAt(low) == a.charAt(high)){
				low--;
			    high++;
			}
			else{
				System.out.print("�ӳ�������^��");
				break;
			}
				
			System.out.println("�ӳ�����^��");
			
		}
		input.close();

	}

	
	}


