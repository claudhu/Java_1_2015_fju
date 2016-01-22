

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		int rand_num;
		int n;
		int[] n1=new int[3];
		int[] n2 = new int[3];
		int res;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		rand_num = (rand.nextInt(9)+1)*100+rand.nextInt(100);
		System.out.print("Please enter the number: ");
		n = input.nextInt();
		System.out.printf("The random number is %d\n", rand_num);
		findDigit(n,n1);
		findDigit(rand_num,n2);
		res = check(n1,n2);
		if (res!=-1)
	     	System.out.printf("You win the third prize, money award is %d\n",res);
		else
			System.out.printf("Sorry!\n");

	}
	public static void findDigit(int n,int[] n1){
		int i=2;
		while (n!=0){
			n= n/10;
			n1[i]=n%10;
			i--;
		}
	}
	public static int check(int[]n1, int[] n2) {
		if((n1[1]==n2[1]) && (n1[2]==n2[2]))
			return 6000;
		else if((n1[0]==n2[0])&&(n1[1]==n2[1])&&(n1[2]==n2[2]))
			return 10000;
		else if((n1[0]==n2[1] )&&( n1[1]==n2[2]) &&(n1[2]==n2[0]))
			return 8000;
		else if((n1[0]==n2[1]) &&( n1[1]==n2[0] )&&(n1[2]==n2[2]))
			return 8000;
		else if((n1[0]==n2[2] )&&( n1[1]==n2[0]) &&(n1[2]==n2[1]))
			return 8000;
		else if((n1[0]==n2[2]) && (n1[1]==n2[1]) &&(n1[2]==n2[0]))
			return 8000;
		else if((n1[0]==n2[0]) && (n1[1]==n2[2] )&&(n1[2]==n2[1]))
			return 8000;
		else 
			return -1;
	}   

}
