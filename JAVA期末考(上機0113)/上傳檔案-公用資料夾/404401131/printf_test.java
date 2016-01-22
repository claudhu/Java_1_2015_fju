

import java.util.Scanner;

public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("¿é¤J8­Ó¼Æ¦r");
		int list[]=new int[8];
		for(int i=0;i<list.length;i++){
			list[i]=input.nextInt();
		}
		for(int i =0;i<4;i++){
			System.out.printf("%8d",list[i]);}
		System.out.println();
		for(int i=4;i<list.length;i++){
			System.out.printf("%8d",list[i]);}
		
	}

}
