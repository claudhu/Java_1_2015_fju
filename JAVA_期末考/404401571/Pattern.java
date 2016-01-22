
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個整數");
		int n = input.nextInt();
		
		for(int a=0;a<=n;a++){
			
			for(int b=0;a>b;b++){
				System.out.print("*");
				
				}
			for(int c=n;c>=a+1;--c){
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
