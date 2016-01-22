

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (char) (Math.random()*10);
		int b = (char) (Math.random()*10);
		int c = (char) (Math.random()*10);
		
		String lotnum = ""+a+b+c;
		//System.out.println(lotnum);
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個介於100~999的數");
		int guess =input.nextInt();
		System.out.println(guess);
		char g1 =(char)guess; 
		char g2 =(char)guess; 
		char g3 =(char)guess; 
		
	  if(a==g1&&b==g2&&c==g3){
		  System.out.println(lotnum);
		  System.out.println("You win the first prize,money award is 10000");
		
	  }else if(a==g1&&b==g3&&c==g2||a==g2&&b==g3&&c==g1||a==g2&&b==g1&&c==g3||
			  a==g3&&b==g2&&c==g1||a==g3&&b==g1&&c==g2){
		  System.out.println(lotnum);
		  System.out.println("You win the second prize,money award is 8000");
	  }else if(b==g2&&c==g3){
		  System.out.println(lotnum);
		  System.out.println("You win the third prize,money award is 6000");
	  }else
		  System.out.println("The Lottery number is "+lotnum);
		  System.out.println("Sorry");
		
		
		
		
		

	}

}
