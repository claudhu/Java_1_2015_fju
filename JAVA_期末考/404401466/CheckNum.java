
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 9 digits");
		int a = input.nextInt();
		
		int n1 = a%100000000;
		int n2 = a%10000000-(10*n1);
		int n3 = a%1000000-(100*n1)-(10*n2);
		int n4 = a%100000-(1000*n1)-(100*n2)-(10*n3);
		int n5 = a%10000-(10000*n1)-(1000*n2)-(100*n3)-(10*n4);
		int n6 = a%1000-(100000*n1)-(10000*n2)-(1000*n3)-(100*n4)-(10*n5);
		int n7 = a%100-(1000000*n1)-(100000*n2)-(10000*n3)-(1000*n4)-(100*n5)-(10*n6);
		int n8 = a%10-(10000000*n1)-(1000000*n2)-(100000*n3)-(10000*n4)-(1000*n5)-(100*n6)-(10*n7);
		int n9 = a/10;
		
		int checksum = -(n1*1+n2*2+n3*3+n4*4+n5*5+n6*6+n7*7+n8*8+n9*9)%11;
		

		if(checksum==10){
			System.out.println("The checksum is:"+"X");
			System.out.println("The ISBN is:"+a+"X");
		}
		else{
			System.out.println("The checksum is:"+checksum);
			System.out.println("The ISBN is:"+a+checksum);
		}
		
		
		

	}

}
