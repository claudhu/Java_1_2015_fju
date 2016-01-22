
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter a number");
		int num=input.nextInt();
		int x=1;
		int y=num-1;
		for(int a=1;a<=num;a++){
			for(int i=1;i<=x;i++){
				System.out.print("*");
			}
			for(int j=0;j<y;j++){
				System.out.print("#");
			
			}
			System.out.print("\n");
			x++;
			y--;
		}

	}

}
