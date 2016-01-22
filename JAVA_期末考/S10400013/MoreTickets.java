import java.util.Scanner;
	public class MoreTickets {

		public static void main(String[] args) {
			
			int code,a1=3000,a2=2500,a3=2000,a4=1000,a5=500;
			
			int num1=0,num2=0,num3=0,num4=0,num5=0;
			
			int totalnum1=0,totalnum2=0,totalnum3=0,totalnum4=0,totalnum5=0;
			
	         Scanner input = new Scanner(System.in);
	         
			do{
			System.out.println("Please enter the ticket code:");
			
			code = input.nextInt();
			
			if (code==0)
			{
				System.out.printf("The total price is:%d",((totalnum1*a1)+(totalnum2*a2)+(totalnum3*a3)+(totalnum4*a4)+(totalnum5*a5)));
				break;
			}
			if ((code<0)||(code>5))
			{
				System.out.printf("You entered the wrong code.");
			break;
			}
				
			System.out.println("Please enter the ticket numbers:");
			
			if(code==1){
			
			    num1 = input.nextInt();
			
			totalnum1 += num1;
			}
			
			else if(code==2)
			{
		        num2 = input.nextInt();
			
			totalnum2 += num2;
			}
			else if(code==3)
			{	
			    num3 = input.nextInt();
			    
			    totalnum3 += num3;
			}
			else if(code==4)
			{
				
				num4 = input.nextInt();
				
				totalnum4 += num4;
			}
			else if(code==5)
			{
				
				num5 = input.nextInt();

				totalnum5 += num5;
			}
			
			
				
			}while(code!=0);
			
			
		}
		
	
	}		
			
			
			
			
			
			
			

	
