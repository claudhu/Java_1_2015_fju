
import java.util.Scanner;
public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num1=input.nextInt();
		int num2=(int)((Math.random()*1000)-1);
		System.out.print("The random number is : "+ num2);
		if(num1==num2){
			System.out.print("You win the first prize,money award is 10000");
		}
		else if(){
			
		}
		else if(){
			
		}
		else
			System.out.print("Sorry!");
	}

}
