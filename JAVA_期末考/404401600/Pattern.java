import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int a =input.nextInt();
		int j;
		
		for(int i = 1;i<=a;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int k =0;k<=(a-j);k++){
				System.out.print("#");
			}
			System.out.println();
			
		}

	}

}
