
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = ((int)(Math.random()*1001));
		System.out.println("輸入一個介於100到999的數");
        Scanner input = new Scanner(System.in);
		int j = input.nextInt();
	
		if(j != i )
			System.out.println("sorry");
		else if(j == i)
			System.out.println("你輸的是"+j+"隨機數字是"+i);
		}
		}
	
