

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 System.out.println("請輸入一串數字");
		String a =input.nextLine();
		char list1[] =a.toCharArray();
		char y=0;
		for(int i=0;i<list1.length;i++){
			y=list1[i];
			System.out.print(list1[i]);
		}
		
	    System.out.println();
		char list[] =a.toCharArray();
		char x =0;
	
		for(int i=list.length-1;i>=0;i--){
		x=(list[i]);
		System.out.print(list[i]);
	
		}	
		 System.out.println();
		if(x==y){
			System.out.println("yes");}
			else if(list!=list1)
				System.out.println("no");

	
	}
}
