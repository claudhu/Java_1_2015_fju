
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number=input.nextInt();
		for(int i=1;i<=number;i++){
			
			for(int j=1; j<=number-i;j++){
				System.out.print(" * ");
			}
			
				
					for(int s=1;s<=i;s++){
						System.out.print(" # ");
					}
					System.out.println();
			}
			
			}
		
	
	
		}
		
		
		

