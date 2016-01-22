
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number¡G");
		int i = input.nextInt();
		//¶¥
		
		for(int j = 1;j<=i;j++){
			//¦æ
			int k = 1;
			while(k <= i){
				System.out.print("*");
			}
		}

	}

}
