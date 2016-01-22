
import java.util.Scanner;

public class printf_test {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter 8 numbers: ");
		int num[] = new int [8];
	
		for(int i=0; i<num.length; i++){
			num[i] = input.nextInt();
		}
		System.out.println("¿é¥Xµ²ªG: ");
		System.out.printf("%10d%10d%10d%10d",num[0],num[1],num[2],num[3]);
		System.out.println();
		System.out.printf("%10d%10d%10d%10d",num[4],num[5],num[6],num[7]);
	}
}
