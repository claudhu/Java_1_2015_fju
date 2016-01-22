

import java.util.Scanner;

public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] list = new int [8] ;
		System.out.println("請輸入8個整數");
		for(int i = 0 ; i < list.length ; i++){
			list[i] = input.nextInt();
		}
		System.out.printf("%8d %8d %8d %8d\n" , list[0] , list[1] , list[2] , list[3]);
		System.out.printf("%8d %8d %8d %8d\n" , list[4] , list[5] , list[6] , list[7]);

	}

}
