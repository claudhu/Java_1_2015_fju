

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pig = 0 ;
		int inin = 0 ;
		int fish = 0 ;
		int nono = 0 ;
       
		for(int i = 0 ; i < 10 ; i++ ){
			System.out.println("���إ����`�Τj��A�п�J�z���벼���!\n"
					+ "�z�ثe�٦�"+(10-i)+"�i�ﲼ"
							+ "\n(�@)�B������\n (�G)�B�����^\n (�T)�B������\n (�|)�o��\n") ;
			int vote = input.nextInt();
			switch ( vote % 4){
			case 0 :  nono += 1 ; break ;
			case 1 :  pig += 1 ; break ;
			case 2 :  inin += 1 ; break ;
			case 3 :  fish += 1 ; break ;
		}
		
		}
		System.out.println("�j�ﵲ�G�έp:\n"
				+ "\n(�@)�B������:"+pig+"\n"
						+ " (�G)�B�����^:"+inin+"\n"
								+ " (�T)�B������:"+fish+"\n"
										+ " (�|)�o��:\n"+nono) ;
		

	}

}
