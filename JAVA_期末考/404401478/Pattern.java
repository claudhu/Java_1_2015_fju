

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("�п�J�@�ӥ����");
		int k = input.nextInt();
		
		for(int j=0;j<=k;j++){
			System.out.printf("*",j);
			
			for(int q=k-1;q<k;q++){
				System.out.printf("#",q);
				System.out.println();
				
			}
			
		}
		
	}

}
