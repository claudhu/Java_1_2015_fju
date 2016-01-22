
import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 8 numbers");
		
		int num[]=new int[8];
		for(int a=0;a<8;a++){
			num[a]=input.nextInt();
		}
		for(int b=0;b<8;b++){
			System.out.printf("%8d",num[b]);
			if(b==3){
				System.out.print("\n");
			}
		}
		

	}

}
