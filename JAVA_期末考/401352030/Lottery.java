import java.util.*;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num = (int)(Math.random()*900+100);
		System.out.println("Please enter the number");
		int user=input.nextInt();
		
		int a1=num/100;//κ计
		int aa1=num%100;//т计计
		int a2=aa1/10;//计
		int a3=aa1%10;//т计
		
		int b1=user/100;
		int bb1=user%100;
		int b2=bb1/10;
		int b3=bb1%10;
		
		
		if(num==user){
			System.out.println("The random number is:"+num);
			System.out.println("You win the first prize,money award is 10000");
		}
		else if(a1==b1&&a2==b3&&a3==b2){//1
			System.out.println("The random number is:"+num);
			System.out.println("You win the second prize,money award is 8000");
				}
		else if(a1==b2&&a2==b3&&a3==b1){//1
			System.out.println("The random number is:"+num);
			System.out.println("You win the second prize,money award is 8000");
				}
		else if(a1==b2&&a2==b1&&a3==b3){//1
			System.out.println("The random number is:"+num);
			System.out.println("You win the second prize,money award is 8000");
				}
		else if(a1==b3&&a2==b1&&a3==b2){//1
			System.out.println("The random number is:"+num);
			System.out.println("You win the second prize,money award is 8000");
				}
		else if(a1==b3&&a2==b2&&a3==b1){//1
			System.out.println("The random number is:"+num);
			System.out.println("You win the second prize,money award is 8000");
				}
			
		else if(aa1==bb1){
			System.out.println("The random number is:"+num);
			System.out.println("You win the third prize,money award is 6000");

		}
		else
			System.out.println("The random number is:"+num);
			System.out.println("You lose");
	}

}
