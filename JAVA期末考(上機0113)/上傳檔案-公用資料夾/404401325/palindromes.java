

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��J�@�ӭ^���r");
		String i=input.next();
        linerSearch(i);
		
		
		System.out.println(i+"�O�^��");
       
        	System.out.println("���O�^��");
        
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
