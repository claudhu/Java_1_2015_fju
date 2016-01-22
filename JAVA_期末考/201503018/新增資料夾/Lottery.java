
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=(int)(Math.random()*100 +100);
Scanner input=new Scanner(System.in);
System.out.print("Please enter a number: ");
int n=input.nextInt();
if (n==m)
	System.out.print("You win the first prize,money award is 10000 ");
int n1=n/100;
int n2=n%100;
int n3=n2/10;
int n4=n3%10;

int m1=m/100;
int m2=m%100;
int m3=m2/10;
int m4=m3%10;

if(n1==m3 && n3==m4 && n4==m1 || n1==m4 && n3==m1 && n4==m3 ||n1==m1 && n3==m4 && n4==m3 ||n1==m4 && n3==m3 && n4==m1 ||n1==m3 && n3==m1 && n4==m4 )
	System.out.print("You win the Second prize,money award is 8000 ");
if(n1!=m1 && n3==m3 && n4==m4)
	System.out.print("You win the third prize,money award is 6000 ");
	}

}
