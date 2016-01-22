
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter a number: ");
        Scanner input =  new Scanner (System.in);
        int n = input.nextInt();
        System.out.println("Your square looks like: ");
        for(int i = 1;i<=n;i++){
        	for(int k=1;k<=i;k++)
              System.out.print("*");
        	
            for(int j =n-i;j>=0;j--)
             System.out.print("#");
            System.out.print("\n");}
        	
            }
        
}
        
	
