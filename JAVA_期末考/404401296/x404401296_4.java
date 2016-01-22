

import java.util.Scanner;

public class x404401296_4 {

	public static void main(String[] args) {
	
		
		String lo=""+(int)((Math.random()*9)+1)+(int)((Math.random()*9)+1)+(int)((Math.random()*9)+1);
		Scanner input=new Scanner(System.in);
		System.out.print("please enter the num:");
		String a=input.next();
		char[] l=new char[3];
		char[] an=new char[3];
		
		for(int i=0;i<3;i++)
			l[i]=lo.charAt(i);
		
		for(int i=0;i<3;i++)
			an[i]=a.charAt(i);
		
		
		 System.out.println("the random num:"+lo);
		 
		 boolean v=false;
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 if(l[i]==an[j])
					 v=true;
				 else 
					 v=false;
			 }
		 }
		 
		 
		 if(v==true)
			 System.out.println("you got second prize,money award:8000");
				
		 if(l[0]==an[0] && l[2]==an[2] && l[1]==an[1])
			 System.out.println("you got first prize,money award:10000");
		 else if (l[2]==an[2] && l[1]==an[1])
			 System.out.println("you got third prize,money award:6000");
		 else
			 System.out.println("you did not win");
		 
		 
	}

}

		 