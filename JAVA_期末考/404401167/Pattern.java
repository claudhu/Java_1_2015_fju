import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a numbers:");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
			for(int k=i-1;k>=1;k--){
				System.out.print("#");
				
		}  
			
			
			
		}
		

	}

}
