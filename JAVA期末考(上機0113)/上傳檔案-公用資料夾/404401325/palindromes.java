

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("輸入一個英文單字");
		String i=input.next();
        linerSearch(i);
		
		
		System.out.println(i+"是回文");
       
        	System.out.println("不是回文");
        
	}

	public static String linerSearch(String i) {
		String temp = null ;
        String k = null;
       while(i != null){
        if(i==k){
        k=temp;
		k=i;
		temp=i;
		return i;
        }
		// TODO Auto-generated method stub
		
       }
       return null;
	}

}
