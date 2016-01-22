
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("請輸入一個正整數n");
		int n = input.nextInt();
		
		System.out.println("Your square looks like:");
		
		for(int i=1;i<=n;i++){
			for(int star=1;star<=i;star++)
				System.out.print("*");
			for(int k=Math.abs(i-n);k>0;k--)
				System.out.print("#");
			
			System.out.println();
			}
		}

	}


